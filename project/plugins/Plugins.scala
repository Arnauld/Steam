import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val antlr = "org.antlr" % "antlr" % "3.2"
}
