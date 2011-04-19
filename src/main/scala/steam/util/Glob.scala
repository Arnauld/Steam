package steam.util

import collection.mutable.ListBuffer

/**
 * A glob pattern is specified as a string and is matched against other strings,
 * such as directory or file names. Glob syntax follows several simple rules:
 * <ul>
 *   <li>
 *     An asterisk, *, matches any number of characters (including none).
 *   </li>
 *   <li>
 *     <b>Not applicable:</b>
 *     <s>Two asterisks, **, works like * but crosses directory boundaries.
 *     This syntax is generally used for matching complete paths.</s>
 *   </li>
 *   <li>
 *     A question mark, ?, matches exactly one character.
 *   </li>
 *   <li>
 *     <b>Not implemented:</b>
 *     <s>Braces specify a collection of subpatterns. For example:
 *     {sun,moon,stars} matches "sun", "moon", or "stars."
 *     {temp*,tmp*} matches all strings beginning with "temp" or "tmp."</s>
 *   </li>
 *   <li>
 *     Square brackets convey a set of single characters or, when the hyphen
 *     character (-) is used, a range of characters.
 *     For example: <br/>
 *       <ul>
 *        <li>[aeiou] matches any lowercase vowel. </li>
 *        <li>[0-9] matches any digit.</li>
 *        <li>[A-Z] matches any uppercase letter. </li>
 *        <li>[a-z,A-Z] matches any uppercase or lowercase letter.</li>
 *       </ul>
 *     Within the square brackets, *, ?, and \ match themselves.
 *   </li>
 * </ul>
 *
 * <p>
 *   All other characters match themselves.
 *   To match *, ?, or the other special characters, you can escape them by using
 *   the backslash character, \.
 *   <br/>
 *   For example: \\ matches a single backslash, and
 *   \? matches the question mark.
 * </p>
 *
 *   Here are some examples of glob syntax:
 * <ul>
 *   <li>*.html – Matches all strings that end in .html</li>
 *   <li>??? – Matches all strings with exactly three letters or digits</li>
 *   <li>*[0-9]* – Matches all strings containing a numeric value</li>
 *   <li>*.{htm,html,pdf} – Matches any string ending with .htm, .html or .pdf</li>
 *   <li>a?*.java – Matches any string beginning with a, followed by at least one
 *   letter or digit, and ending with .java</li>
 *   <li>{foo*,*[0-9]*} – Matches any string beginning with foo or any string
 *   containing a numeric value</li>
 * </ul>
 *
 * Copied from
 * <a href='http://download.oracle.com/javase/tutorial/essential/io/fileOps.html#glob'>What Is a Glob?</a>.
 *
 *
 */
object Glob {

  //TODO extractor to use glob expression as a pattern match

  def apply(pattern:String):GlobMatcher = compile(pattern.toCharArray)

  def compile(pattern:Array[Char]):GlobMatcher = {
    val buffer = new StringBuilder(pattern.length)
    var chain:List[Expr] = Nil
    val stream = new CharStream(pattern)
    while(stream.remaining_?) {

      stream.consume match {
        case '*' =>  chain = Expr.* :: consumeLiteral(buffer, chain)
        case '?' =>  chain = Expr.? :: consumeLiteral(buffer, chain)
        case '[' =>  // choice
          chain = consumeLiteral(buffer, chain)

          // read until one reaches the ending ']'
          // note that nested choice is not allowed here,
          // but one must support escaping
          // e.g. "[\\-\\[\\]\\\\]" to match either '-', '[', ']' or '\'
          chain = consumeChoiceLiteral(stream) :: chain

        case ']' =>  // not supported, valid ones are consumed in '[' case
            throw new InvalidPatternException("Unbalanced ']' at index " + stream.pos)
        case '\\' =>  // escaping character, consume next if exists
          if(stream.remaining_?)
            buffer.append(stream.consume)
          else
            throw new InvalidPatternException("Ends with escaping character")
        case c => // literal case
          buffer.append(c)
      }
    }

    // any pending literal built?
    chain = consumeLiteral(buffer, chain)

    // reverse due to the append to head construction
    chain = chain.reverse

    new ExprChain(chain)
  }

  private def consumeChoiceLiteral(stream:CharStream) = {
    val buffer = new StringBuilder
    val remember = stream.pos // keep original start for error reporting
    while(stream.remaining_? && stream.peek != ']') {
      stream.consume match {
        case '\\' => // escaping character, consume next if exists
          if(stream.remaining_?)
            buffer.append(stream.consume)
          else
            throw new InvalidPatternException("Ends with escaping character")
        case c =>
          buffer.append(c)
      }
    }

    if(!stream.remaining_? || stream.peek !=']')
      throw new InvalidPatternException("Unbalanced '[' at index " + remember)
    //consume choice termination ']'
    stream.consume

    // literal
    Expr.choice(buffer.toArray)
  }

  private def last_?(idx:Int, seq:CharSequence) = { idx==(seq.length-1) }

  /**
   * Consume any literal that may be present in the buffer, if none is present
   * the chain remains unchanged.
   */
  private def consumeLiteral(buffer:StringBuilder, chain:List[Expr]) =
    buffer.isEmpty match {
      case true  => chain
      case false =>
        val expr = Expr.literal(buffer.toArray)
        buffer.setLength(0)
        expr :: chain
    }
}

case class CharStream(chars:Array[Char]) {
  var pos = 0
  def peek:Char = chars(pos)
  def consume:Char = chars(getPosAndIncrement)
  def first_? = (pos==0)
  def remaining_? = (pos<chars.length)
  def getPosAndIncrement = {
    val rec = pos
    pos = rec + 1
    rec
  }

  override def toString:String = {
    val b = new StringBuilder
    b.append("<<")
    for(i <- 0 until chars.length) {
      if(i==pos)
        b.append("<").append(chars(i)).append('>')
      else
        b.append(chars(i))
    }
    b.append(">>")
    b.toString()
  }
}

class InvalidPatternException(message:String) extends Exception(message)

trait GlobMatcher {
  def matches(seq:CharSequence):Boolean
}

case class ExprChain(exprs:List[Expr]) extends GlobMatcher {
  def matches(seq:CharSequence):Boolean =
    if(exprs.isEmpty)
      // nothing actually matches... nothing!
      false
    else
      matches(0, 0, seq)

  override def toString = exprs.mkString("~>")

  private def matches(idxExpr:Int, idxSeq:Int, seq:CharSequence):Boolean = {
    if(idxExpr>=exprs.size) {
      // no more expression to match, this is good only if
      // the end of sequence has been reached too
      if(idxSeq==(seq.length))
        return true
      // or the last expr is a star
      // note that exprs is never empty here, filtering has been done previously
      return exprs(idxExpr-1).star_?
    }
    else if(exprs(idxExpr).star_?) {
      // end reached on a star is accepted!
      if(idxSeq>=seq.length) {
        return true
      }

      // star is a special case of recursive call
      // due to the greedy behavior one can consume any number of char
      // so let's try until a good one is found, or the end of the seq
      // is reached
      for(idx <- idxSeq until seq.length) {
        if(matches(idxExpr+1, idx, seq))
          return true;
      }
      // still there?
      // humpff no path has been found, returns, may be an other
      // path can be tried,but that's out of scope at this point
      return false
    }
    else if(idxSeq>=seq.length) {
      // end reached
      return false
    }
    else {
      // ouch! finally the normal case
      // check against the current expr, and jump to next
      // one in recursive call
      exprs(idxExpr).nextIndex(idxSeq, seq) match {
        case Some(idx) =>
          return matches(idxExpr + 1, idx, seq)
        case None =>
          return false
      }
    }
  }
}

/**
 * base interface for all expression cases
 */
trait Expr {
  def star_? = false
  def nextIndex(idx:Int, seq:CharSequence):Option[Int]
}

object Expr {

  def * : Expr = Star
  def ? : Expr = Question
  def literal(content:Array[Char]) : Expr = new Literal(content)
  def choice(content:Array[Char]) : Expr = new Choice(compileChoice(content))

  /**
   * the 'match any sequence of character' expression
   * Its behavior is mostly handled within the @link{#matches(Int, Int, CharSequence)} method.
   */
  private case object Star extends Expr {
    override def star_? = true
    def nextIndex(idx:Int, seq:CharSequence):Option[Int] = Some(idx+1)
  }

  /**
   * the 'match any character' expression.
   */
  private case object Question extends Expr {
    def nextIndex(idx:Int, seq:CharSequence):Option[Int] = Some(idx+1)
  }

  /**
   * Literal or 'match exactly the sequence of character' expression.
   */
  private case class Literal(chars:Array[Char]) extends Expr {
    def nextIndex(idx:Int, seq:CharSequence):Option[Int] = {
      for(i <-0 until chars.length) {
        if(seq.charAt(idx+i)!=chars(i))
          return None
      }
      // still there, so the sequence is fulfilled
      Some(idx+chars.length)
    }
    override def toString = "Literal[" + new String(chars) + "]"
  }

  /**
   * Choice or 'match at least one of the characters' expression.
   */
  private case class Choice(ranges:List[Range]) extends Expr {
    def nextIndex(idx:Int, seq:CharSequence):Option[Int] = {
      val c = seq.charAt(idx)
      ranges.find( _.isSatisfiedBy(c)) match {
        case None => None
        case _ => Some(idx+1) // at least one was satisfied
      }
    }
    override def toString = "Choice[" + ranges.mkString(",") + "]"
  }

  private def compileChoice(chars:Array[Char]):List[Range] =
    if(chars.isEmpty)
      List[Range]()
    else {
      val ranges = ListBuffer[Range]()

      val stream = new CharStream(chars)
      var min:Char = stream.peek // not empty thus one is sure it exists
      while(stream.remaining_?) {
        stream.consume match {
          case '-' =>
            if(stream.pos==1)
              throw new InvalidPatternException("Choice cannot start with the range character '-'")
            if(!stream.remaining_?)
              throw new InvalidPatternException("No upper bound in range [" + new String(chars) + "]")

            val max = stream.consume
            ranges += Range(min, max)

          case c =>
            // check for range...
            if(stream.remaining_? && stream.peek=='-') {
              // lower bound of the range, thus set the min
              // and continue to consume the stream
              min = c
            }
            else // simple char, escaped characters were already handled in the Glob class
                 // so one just has to add the char as a regular choice
            {
              ranges += Range(c, c)
            }
        }
      }
      ranges.toList
    }

  private case class Range(min:Char, max:Char) {
    def isSatisfiedBy(c:Char) = (min<=c && c<=max)
    override def toString = "'" + min + "' -> '" + max + "'"
  }
}