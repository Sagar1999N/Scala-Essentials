package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  //x = 42
  //val are immutable
  val y = 43.21
  println(y)
  //Int is optional, Compiler can infer types

  val firstName: String = "Sagar";
  val lastName = "Nalawade"
  println(s"Hi! I'am ${firstName} ${lastName}.")
  println(firstName.getClass)

  val aBoolean: Boolean = false
  println(s"${aBoolean} is ${aBoolean.getClass}")

  val aChar: Char = 'a'
  println(s"${aChar} is ${aChar.getClass}")

  val anInt: Int = 2147483647 //(-2147483648 to 2147483647)
  println(s"Max Int: ${Int.MaxValue}")
  println(s"Min Int: ${Int.MinValue}")
  println(s"${anInt} is ${anInt.getClass}")

  val aShort: Short = 32767 //(-32768 to 32767)
  println(s"Max Short: ${Short.MaxValue}")
  println(s"Min Short: ${Short.MinValue}")
  println(s"${aShort} is ${aShort.getClass}")

  val aLong: Long = 9223372036854775807l //(9223372036854775808l to 9223372036854775807l)
  println(s"Max Long: ${Long.MaxValue}")
  println(s"Min Long: ${Long.MinValue}")
  println(s"${aLong} is ${aLong.getClass}")

  val aFloat: Float = 0.6f
  println(s"Max Float: ${Float.MaxValue}")
  println(s"Min Float: ${Float.MinValue}")
  println(s"${aFloat} is ${aFloat.getClass}")

  val aDouble: Double = 0.1d
  println(s"Max Double: ${Double.MaxValue}")
  println(s"Min Double: ${Double.MinValue}")
  println(s"${aDouble} is ${aDouble.getClass}")

  //val = values immutable
  //var = variables mutable/variable
  //Variables //side effects //use vals unless you want side effects
  var aVariable: Int = 6
  println(s"aVariable = ${aVariable}")
  aVariable -= 10
  println(s"aVariable = ${aVariable}")

}
