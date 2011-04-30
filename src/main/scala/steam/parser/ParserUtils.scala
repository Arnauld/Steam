package steam.parser

import java.lang.String
import org.antlr.runtime._
import debug.{BlankDebugEventListener, DebugEventListener}

object ParserUtils {

  var tracingParser = false
  var tracingLexer = false

  def createLexer(input:String) = {
    val stream:CharStream = new ANTLRStringStream (input)
    val lexer = if(tracingLexer)
                  newLexer(stream)
                else
                  new SteamLexer(stream) // create a buffer of tokens pulled from the lexer
    val tokens = new CommonTokenStream(lexer)
    tokens
  }

  def createParser(input:String):SteamParser = createParser(input, tracingParser)

  def createParser(input:String, parserTracing:Boolean):SteamParser = {
    val tokens = createLexer(input)

    // create a parser that feeds off the tokens buffer
    val parser = new SteamParser(tokens,  if(parserTracing)
                                            new TracingDebugListener
                                          else
                                            new BlankDebugEventListener)
    parser
  }

  def newLexer(stream:CharStream) = new SteamLexer(stream) {
    var indent = 0
    override def traceIn(ruleName: String, ruleIndex: Int) {
        indent += 1
        System.err.println(("  " * indent) + ">> " + ruleName + " index: " + ruleIndex)
      }

      override def traceIn(ruleName: String, ruleIndex: Int, inputSymbol: AnyRef) {
        indent += 1
        System.err.println(("  " * indent) + ">> " + ruleName + " index: " + ruleIndex + " <" + inputSymbol + ">")
      }

      override def traceOut(ruleName: String, ruleIndex: Int) {
        System.err.println(("  " * indent) + "<< " + ruleName + " index: " + ruleIndex)
        indent -= 1
      }

      override def traceOut(ruleName: String, ruleIndex: Int, inputSymbol: AnyRef) {
        System.err.println(("  " * indent) + "<< " + ruleName + " index: " + ruleIndex + " <" + inputSymbol + ">")
        indent -= 1
      }
  }

  def newParser(tokens:CommonTokenStream) = new SteamParser(tokens) {
      var indent = 0

      override def traceIn(ruleName: String, ruleIndex: Int) {
        indent += 1
        System.err.println(("  " * indent) + ">> " + ruleName + " index: " + ruleIndex + " <" + getTokenStream().LT(1) + ">")
      }

      override def traceIn(ruleName: String, ruleIndex: Int, inputSymbol: AnyRef) {
        indent += 1
        System.err.println(("  " * indent) + ">> " + ruleName + " index: " + ruleIndex + " <" + inputSymbol + ">")
      }

      override def traceOut(ruleName: String, ruleIndex: Int) {
        System.err.println(("  " * indent) + "<< " + ruleName + " index: " + ruleIndex + " <" + getTokenStream().LT(1) + ">")
        indent -= 1
      }

      override def traceOut(ruleName: String, ruleIndex: Int, inputSymbol: AnyRef) {
        System.err.println(("  " * indent) + "<< " + ruleName + " index: " + ruleIndex + " <" + inputSymbol + ">")
        indent -= 1
      }
  } // begin parsing at rule r parser.r();

  class TracingDebugListener extends DebugEventListener {
    var indent = 0

    def setTokenBoundaries(p1: AnyRef, p2: Int, p3: Int) {
      System.err.println(("  " * indent) + "setTokenBoundaries(" + p1 + ", " + p2 + ", " + p3 +")")
    }

    def addChild(p1: AnyRef, p2: AnyRef) {
      System.err.println(("  " * indent) + "addChild(" + p1 + ", " + p2 +")")
    }

    def becomeRoot(p1: AnyRef, p2: AnyRef) {
      System.err.println(("  " * indent) + "becomeRoot(" + p1 + ", " + p2 +")")
    }

    def createNode(p1: AnyRef, p2: Token) {
      System.err.println(("  " * indent) + "createNode(" + p1 + ", " + p2 +")")
    }

    def createNode(p1: AnyRef) {
      System.err.println(("  " * indent) + "createNode(" + p1 + ")")
    }

    def errorNode(p1: AnyRef) {
      System.err.println(("  " * indent) + "errorNode(" + p1 +")")
    }

    def nilNode(p1: AnyRef) {
      System.err.println(("  " * indent) + "nilNode(" + p1 +")")
    }

    def LT(p1: Int, p2: AnyRef) {
      System.err.println(("  " * indent) + "LT(" + p1 + ", " + p2 +")")
    }

    def consumeNode(p1: AnyRef) {
      System.err.println(("  " * indent) + "LT(" + p1 + ")")
    }

    def terminate() {
      indent -= 1
      System.err.println(("  " * indent) + "terminate(" + ")")
      indent -= 1
    }

    def commence() {
      indent += 1
      System.err.println(("  " * indent) + "commence(" + ")")
      indent += 1
    }

    def semanticPredicate(p1: Boolean, p2: String) {
      System.err.println(("  " * indent) + "semanticPredicate(" + p1 + ", " + p2 +")")
    }

    def endResync() {
      indent -= 1
      System.err.println(("  " * indent) + "endResync()")
      indent -= 1
    }

    def beginResync() {
      indent += 1
      System.err.println(("  " * indent) + "beginResync()")
      indent += 1
    }

    def recognitionException(p1: RecognitionException) {
      System.err.println(("  " * indent) + "recognitionException(" + p1 + ")")
    }

    def location(p1: Int, p2: Int) {
      System.err.println(("  " * indent) + "location(" + p1 + ", " + p2 +")")
    }

    def endBacktrack(p1: Int, p2: Boolean) {
      indent -= 1
      System.err.println(("  " * indent) + "endBacktrack(" + p1 + ", " + p2 +")")
      indent -= 1
    }

    def beginBacktrack(p1: Int) {
      indent += 1
      System.err.println(("  " * indent) + "beginBacktrack(" + p1 + ")")
      indent += 1
    }

    def rewind() {
      System.err.println(("  " * indent) + "rewind()")
    }

    def rewind(p1: Int) {
      System.err.println(("  " * indent) + "rewind(" + p1 + ")")
    }

    def mark(p1: Int) {
      System.err.println(("  " * indent) + "mark(" + p1 + ")")
    }

    def LT(p1: Int, p2: Token) {
      System.err.println(("  " * indent) + "LT(" + p1 + ", " + p2 +")")
    }

    def consumeHiddenToken(p1: Token) {
      System.err.println(("  " * indent) + "consumeHiddenToken(" + p1 + ")")
    }

    def consumeToken(p1: Token) {
      System.err.println(("  " * indent) + "consumeToken(" + p1 + ")")
    }

    def exitDecision(p1: Int) {
      indent -= 1
      System.err.println(("  " * indent) + "exitDecision(" + p1 + ")")
      indent -= 1
    }

    def enterDecision(p1: Int) {
      indent += 1
      System.err.println(("  " * indent) + "enterDecision(" + p1 + ")")
      indent += 1
    }

    def exitSubRule(p1: Int) {
      indent -= 1
      System.err.println(("  " * indent) + "exitSubRule(" + p1 + ")")
      indent -= 1
    }

    def enterSubRule(p1: Int) {
      indent += 1
      System.err.println(("  " * indent) + "enterSubRule(" + p1 + ")")
      indent += 1
    }

    def exitRule(p1: String, p2: String) {
      indent -= 1
      System.err.println(("  " * indent) + "exitRule(" + p1 + ", " + p2 +")")
      indent -= 1
    }

    def enterAlt(p1: Int) {
      System.err.println(("  " * indent) + "enterAlt(" + p1 + ")")
    }

    def enterRule(p1: String, p2: String) {
      indent += 1
      System.err.println(("  " * indent) + "enterRule(" + p1 + ", " + p2 +")")
      indent += 1
    }
  }
}