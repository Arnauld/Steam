package steam.parser

import org.antlr.runtime.{CharStream, ANTLRStringStream, CommonTokenStream}

object ParserUtils {
  def createParser(input:String) = {
    val stream:CharStream = new ANTLRStringStream (input)
    val lexer = new SteamLexer(stream); // create a buffer of tokens pulled from the lexer
    val tokens = new CommonTokenStream(lexer);
    // create a parser that feeds off the tokens buffer
    new SteamParser(tokens); // begin parsing at rule r parser.r();
  }
}