package steam.lang

object Implicits {
  implicit def string2QualifiedIdentifier(qid:String) = QualifiedIdentifier(qid.split(':'))
  implicit def string2Literal(literal:String) = StringLiteral(literal)
  implicit def int2Literal(literal:Int) = NumberLiteral(literal)
  implicit def double2Literal(literal:Double) = NumberLiteral(literal)
}