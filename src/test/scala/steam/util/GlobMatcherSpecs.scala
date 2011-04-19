package steam.util

import org.specs.Specification

class GlobMatcherSpecs extends Specification {

  "Empty expression" should {
    "not throw an exception" in {
      Glob("").matches("Tohh") mustBe false
    }
  }

  "Pattern" should {
    "throw an exception if ending with the escape sequence" in {
      Glob("a\\") must throwA[InvalidPatternException]
    }

    "not throw an exception if unbalanced '[' is escaped" in {
      Glob("\\[az").matches("[az") mustBe true
    }

    "not throw an exception if unbalanced ']' is escaped" in {
      Glob("\\]az").matches("]az") mustBe true
    }
  }

  "Exact match" should {
    "work with the same character" in {
       Glob("a").matches("a") mustBe true
    }

    "work with a different character" in {
       Glob("a").matches("b") mustBe false
    }

    "not work with more than one character and a different entry" in {
       Glob("Tohhmork").matches("Gohhmork") mustBe false
    }
    "work with more than one character and the same entry" in {
       Glob("Tohhmork").matches("Tohhmork") mustBe true
    }
  }

  "Special construct '?'" should {
    "match a single character" in {
      Glob("?").matches("a") mustBe true
      Glob("?").matches("b") mustBe true
    }

    "match a simple valid expression" in {
      Glob("?og").matches("Mog") mustBe true
      Glob("?og").matches("Tog") mustBe true
    }

    "not match a simple invalid expression" in {
      Glob("?og").matches("Tag") mustBe false
    }

    "not match empty character" in {
      Glob("?").matches("") mustBe false
      Glob("T?").matches("T") mustBe false
      Glob("?T").matches("T") mustBe false
    }
  }

  "Special construct [...]" should {
    "match on an accepted single character" in {
      Glob("[TG]").matches("T") mustBe true
      Glob("[TG]").matches("G") mustBe true
    }
    "not match on an non accepted single character" in {
      Glob("[TG]").matches("M") mustBe false
      Glob("[TG]").matches("a") mustBe false
    }

    "match on a simple expression with a valid entry" in {
      Glob("[TG]ohh").matches("Tohh") mustBe true
      Glob("Goh[hk]").matches("Gohh") mustBe true
    }

    "not match on a simple expression with an invalid entry" in {
      Glob("[TG]ohh").matches("Mohh") mustBe false
    }

    "match on a more complex expression with a valid entry" in {
      Glob("[TG]ohh[MTmt]ork").matches("Tohhmork") mustBe true
      Glob("[TG]ohh[MTmt]ork").matches("Gohhtork") mustBe true
    }

    "not match on a more complex expression with an invalid entry" in {
      Glob("[TG]ohh[MTmt]ork").matches("GohhKork") mustBe false
    }

    "support range of characters with entry as boundary" in {
      val matcher = Glob("[a-z]")
      matcher.matches("a") mustBe true
      matcher.matches("z") mustBe true
    }

    "support range of characters with entry not in range" in {
      Glob("[a-z]").matches("0") mustBe false
      Glob("[a-z]").matches("A") mustBe false
    }

    "support range of characters with entry inside range" in {
      Glob("[a-z]").matches("b") mustBe true
      Glob("[a-z]").matches("c") mustBe true
      Glob("[a-z]").matches("d") mustBe true
      Glob("[a-z]").matches("e") mustBe true
      Glob("[a-z]").matches("f") mustBe true
    }

    "support composition of range" in {
      Glob("[a-z0A-Z]").matches("B") mustBe true
      Glob("[a-z0A-Z]").matches("0") mustBe true
      Glob("[a-z0A-Z]").matches("9") mustBe false
      Glob("[a-zA-Z9]").matches("9") mustBe true
    }

    "not accept '[' or ']' as valid character" in {
      Glob("[a]").matches("[") mustBe false
      Glob("[a]").matches("]") mustBe false
    }

    "reject everything when empty" in {
      Glob("[]").matches("a") mustBe false
      Glob("[]").matches("[") mustBe false
      Glob("[]").matches("]") mustBe false
    }

    "support escaped character as choice but the escaping is not a valid entry" in {
      Glob("[\\[]").matches("\\") mustBe false
    }

    "support escaped character for '[' as choice" in {
      Glob("[\\[]").matches("[") mustBe true
    }

    "support escaped character for ']' as choice" in {
      Glob("[\\]]").matches("]") mustBe true
    }

    "not consider escaped closing ']' as termination of choice" in {
      Glob("[\\]]").matches("]]") mustBe false
    }

    "consider '*' as a literal" in {
      Glob("F[*u]ck").matches("F*ck") mustBe true
      Glob("F[*u]ck").matches("Fack") mustBe false
    }
    
    "consider '?' as a literal" in {
      Glob("F[?u]ck").matches("F?ck") mustBe true
      Glob("F[?u]ck").matches("Fack") mustBe false
    }

    "throw an exception on unbalanced '['" in {
      Glob("[a-z") must throwA[InvalidPatternException]
    }

    "throw an exception on unbalanced ']'" in {
      Glob("a-z]") must throwA[InvalidPatternException]
    }
    
    "throw an exception with no upper bound in range" in {
      Glob("[a-]") must throwA[InvalidPatternException]
    }

    "throw an exception if finishing by the escape sequence" in {
      Glob("[a\\]") must throwA[InvalidPatternException]
    }
  }

  "Special construct '*'" should {
    "work on an empty sequence" in {
      Glob("*").matches("") mustBe true
    }
    "work on a single character" in {
      Glob("*").matches("T") mustBe true
    }
    "be accepted as ending sequence" in {
      Glob("Tohh*").matches("Tohh") mustBe true
    }

    "match on simple case with a valid entry" in {
      Glob("Tohh*rk").matches("Tohhmork") mustBe true
    }
    "not match on simple case with an invalid entry" in {
      Glob("Tohh*rk").matches("Tohhmorkk") mustBe false
    }
  }

  "Glob" should {
    "work also with complex expression" in {
      val matcher = Glob("[GT]?hh*rk")
      matcher.matches("Tohhmork") mustBe true
      matcher.matches("Gohhmork") mustBe true
    }

    "work also with complex expression and repeating sequence" in {
      val matcher = Glob("[GT]?hh*rk")
      matcher.matches("Tohhmorkork") mustBe true
    }

    "work with complex expression and escaped character" in {
      Glob("[GT]?hh*rk").matches("Tohhmoo****rk") mustBe true
      Glob("[GT]?hh*rk").matches("Tohhmoo***rrk") mustBe true
      Glob("[GT]?hh*\\*rk").matches("Tohhmoo*rk") mustBe true
      Glob("[GT]?hh*\\*rk").matches("Tohhmoo****rk") mustBe true
      Glob("[GT]?hh*\\*rk").matches("Tohhmoo***rrk") mustBe false
    }

    "work with complex and ureadable examples" in {
      val glob = Glob("\\[[0-9][0-9][0-9]-[a-zA-Z]\\**[?*]")
      glob.matches("[123-B***") mustBe true
      glob.matches("[123-B**?") mustBe true
      glob.matches("[123-B*??") mustBe true
      glob.matches("[123-B*?_") mustBe false
      glob.matches("[123-8*??") mustBe false
      glob.matches("[123-B*any[?*]thing*") mustBe true
      glob.matches("[123-B*any[?*]thing?") mustBe true
      glob.matches("[123-B*any[?*]thing_") mustBe false
    }
  }

}