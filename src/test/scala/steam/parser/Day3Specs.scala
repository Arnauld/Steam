package steam.parser

import org.specs.Specification
import ParserUtils._
import steam.lang._
import org.antlr.runtime.tree.Tree
import collection.JavaConversions._

class Day3Specs  extends Specification {

  "Parser" should {
    "be able to parse 'module' declaration with literal variables" in {
      val input =
        """|module echo
           |public val WHO = "John"
           |""".stripMargin

      val parser = createParser(input)
      val cunit = parser.compilationUnit
      println("Day3Specs::tree=" + cunit.tree.asInstanceOf[Tree].toStringTree)
    }

    "be able to parse 'module' declaration with literal variables" in {
      val input =
        """|module echo
           |public val WHO = "John"
           |
           |def println (what:String) = {
           |}
           |
           |""".stripMargin
      
      println(input)

      val parser = createParser(input, true)
      val cunit = parser.compilationUnit
      println("Day3Specs::tree=" + cunit.tree.asInstanceOf[Tree].toStringTree)
    }
  }

}