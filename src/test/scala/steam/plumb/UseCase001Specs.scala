package steam.plumb

import org.specs.Specification
import java.io.{PrintWriter, ByteArrayOutputStream, PrintStream, StringWriter}

class UseCase001Specs extends Specification {
  "Say Hello" should {

    var sout: StringWriter = null
    var pOut: PrintWriter = null
    doBefore {
      sout = new StringWriter
      pOut = new PrintWriter(sout)
    }

    "be describable using scala" in {

      val construct_sentence: PartialFunction[String, String] = {
        case x@"Phileas" => "Good travel! " + x
        case "Watson" => "Elementary, my dear Watson"
        case x => "Hello " + x + "!"
      }
      val plumb = construct_sentence andThen {
        x => pOut.print(x)
      }

      plumb.apply("Phileas")
      sout.toString must_== "Good travel! Phileas"
    }

    "be describable using script" in {

    }

    "be describable using plumb" in {

    }
  }
}