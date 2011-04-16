package steam.parser

import org.specs.Specification
import ParserUtils._
import steam.lang.Module

class Day2Specs  extends Specification {

  "Parser" should {
    "be able to parse 'module' declaration" in {
      val parser = createParser("module echo {}")
      val module = parser.moduleDecl
      module mustVerify(_.isInstanceOf[Module])
    }
  }

}