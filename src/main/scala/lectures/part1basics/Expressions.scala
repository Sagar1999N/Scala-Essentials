package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 //Expression
  println(x)

  println(1 + 2 * 3)
  //+ - * / % & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  //== != > >= < <=

  println(!(1 == x))
  //! && ||

  var aVariable = 2
  aVariable += 3 //-= *= /= ... side effects
  println(aVariable)

  //Instructions/Statement (DO) vs Expressions (VALUE)
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // like turnery operator
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // avoid loops, it is specific to imperative programming(Java/Python/C)
  // Everything in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  //side effects: println(), whiles, reassigning
  //return type: Unit == ()

  i = 0
  val unit = while (i < 10) {
    println(i)
    i += 1
  }

  println(unit)

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z < 2) "Hello" else "Goodbye"
    4
    //val a = 0 // returns unit / ()
  }
  //Everything in scala is a expression so code block is also an expression
  //which results in a value stored in aCodeBlock variable.
  //The Value of a code block is the value of its last expression

  //z += 1 //z block specific variables/values not accessible outside block
  println(aCodeBlock)

}
