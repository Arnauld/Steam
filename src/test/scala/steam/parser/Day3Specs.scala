package steam.parser

import org.specs.Specification
import ParserUtils._
import steam.lang._
import org.antlr.runtime.tree.Tree
import collection.JavaConversions._

class Day3Specs  extends Specification {

  "Parser" should {

    "be able to parse 'module' declaration with literal variables" in {
      skip("Not required")

      val input =
        """|module echo
           |public val WHO = "John"
           |""".stripMargin

      val parser = createParser(input)
      val cunit = parser.compilationUnit
      println("Day3Specs:01:tree=" + cunit.tree.asInstanceOf[Tree].toStringTree)
    }

    "be able to parse 'module' declaration with literal variable and function definition" in {
      skip("Not required")

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
      println("Day3Specs:02:tree=" + cunit.tree.asInstanceOf[Tree].toStringTree)
    }

    "be able to parse 'module' declaration with literal variables with different visibility modifiers" in {
      skip("Not required")
      val input =
        """|module echo
           |public val WHO = "John"
           |var WHAT = "Smurf"
           |
           |""".stripMargin

      val parser = createParser(input, true)
      val cunit = parser.compilationUnit
      println("Day3Specs:03:tree=" + cunit.tree.asInstanceOf[Tree].toStringTree)
    }

    "be able to parse 'module' declaration with def body" in {
      val input =
        """|module echo
           |require io.in
           |def println (what:String) = {
           |  in << what
           |}
           |""".stripMargin

      val parser = createParser(input, true)
      val cunit = parser.compilationUnit
      println("Day3Specs:04:tree=" + cunit.tree.asInstanceOf[Tree].toStringTree)
    }
  }

}