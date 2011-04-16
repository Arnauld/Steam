package steam.parser

import org.specs.Specification
import ParserUtils._
import steam.lang.Require

class Day1Specs  extends Specification {

  "Parser" should {
    "be able to parse simple expression" in {
      val parser = createParser("require time;")
      val require = parser.require
      require mustEqual Require("time")
    }
  }

}