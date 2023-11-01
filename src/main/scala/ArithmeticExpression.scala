enum ArithmeticExpression:
  Num(x: Int)
  Minus(x: ArithmeticExpression)
  Plus(x: ArithmeticExpression, y: ArithmeticExpression)
  Mult(x: ArithmeticExpression, y: ArithmeticExpression)
  Div(x: ArithmeticExpression, y: ArithmeticExpression)



object ArithmeticExpression {

}
