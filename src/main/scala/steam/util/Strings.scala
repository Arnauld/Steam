package steam.util

object Strings {
  def join(values:Iterable[Any], sep:String) = values.mkString(sep)
}