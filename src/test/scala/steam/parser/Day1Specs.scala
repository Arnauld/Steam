package steam.parser

import org.specs.Specification
import ParserUtils._
import steam.lang.Require

class Day1Specs  extends Specification {

  "Parser" should {
    "be able to parse 'require' expression with qualified identifier" in {
      val parser = createParser("require time;")
      val require = parser.require
      require mustVerify(_.isInstanceOf[Require])
      val qid = require.qid
      qid.toString mustEqual "time"
    }
  }

}