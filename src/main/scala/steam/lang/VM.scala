package steam.lang

object VM {
  val log:org.slf4j.Logger = org.slf4j.LoggerFactory.getLogger(classOf[VM])
}

class VM {

  var modules:Map[String, Module] = Map()

  def load(module:Module):Unit = {
    modules += (module.qid.toString -> module)
  }


}