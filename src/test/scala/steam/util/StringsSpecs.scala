package steam.util

import org.specs.Specification

class StringsSpecs extends Specification {

  "join" should {
    "work with a single element" in {
      val result = Strings.join(Array("steam"), ":")
      result mustEqual "steam"
    }

    "work with two elements" in {
      val result = Strings.join(Array("steam","punk"), ":")
      result mustEqual "steam:punk"
    }
  }
}