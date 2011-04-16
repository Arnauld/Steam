package steam.lang

case class QualifiedIdentifier(path:Array[String]) {
  override def toString = path.mkString(":")
}