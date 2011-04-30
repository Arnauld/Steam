package steam.lang

trait LiteralOrFunc[T] {
  def eval(context:EvalContext):T
}

case class Var[T](name:String, value:LiteralOrFunc[T]) extends LiteralOrFunc[T] {
  def eval(context: EvalContext) = value.eval(context)
}

case class StringLiteral(value:String) extends LiteralOrFunc[String] {
  def eval(context: EvalContext) = value
}
case class NumberLiteral(value:Number) extends LiteralOrFunc[Number] {
  def eval(context: EvalContext) = value
}