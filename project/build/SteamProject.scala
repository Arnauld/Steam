import sbt._

class SteamProject(info: ProjectInfo) extends DefaultProject(info) {

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * antlr
   * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  import org.antlr.{Tool=>AntlrTool}

  lazy val antlrGen = task {
      // Use -fo option to force output to go explicitly into a directory, ignoring any path on the input grammar name.
      val antlr = new AntlrTool(Array("-fo", "src/main/generated-java/org/technbolts/steam/parser/", "src/main/antlr3/Steam.g"))
      antlr.process
      None
    } describedAs "Generate Antlr files."
  
  /*override def compileAction = super.compileAction dependsOn(antlrGen)*/

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * add generated-java source folder
   * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  def mainGeneratedJavaSourcePath = mainSourcePath / "generated-java"

  override def mainSourceRoots = (mainGeneratedJavaSourcePath##) +++ (mainJavaSourcePath##) +++ (mainScalaSourcePath##)

  lazy val cleanGen = task {
    FileUtilities.clean(mainGeneratedJavaSourcePath, log)
  } describedAs "Clean generated java folder"

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * dependencies
   * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  val jbossRepository = "repository.jboss.org" at "http://repository.jboss.org/nexus/content/groups/public/"

  // antlr
  val antlr = "org.antlr" % "antlr" % "3.2"

  // logs
  val slf4j        = "org.slf4j" % "slf4j-api" % "1.6.0"
  val slf4jBinding = "ch.qos.logback" % "logback-classic" % "0.9.25" % "runtime"

  // utilities
  val specs   = "org.scala-tools.testing" % "specs_2.8.1" % "1.6.7.2" % "test"
  val mockito = "org.mockito" % "mockito-all" % "1.8.5" % "test"
  val junit = "junit" % "junit" % "4.8.1" % "test"

}
