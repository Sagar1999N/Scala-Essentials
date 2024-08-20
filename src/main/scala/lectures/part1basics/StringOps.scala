package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(4))
  println(str.substring(7, 11))
  println(str.split(" ").mkString(" | "))
  println(str.split(" ").mkString("\n"))
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase)
  println(str.toUpperCase)
  println(str.length)
  //above all are java library functions

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println(aNumber.getClass)
  println('a'+: aNumberString :+'z')
  println("a "+: aNumberString :+" z")
  println(str.reverse)
  println(str.take(2))
  println(str.takeRight(2))

  //Scala specific: String interpolators

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old."
  val anotherGreeting = s"Hello, my name is $name and I am ${age+1} years old."
  println(anotherGreeting)

  //F-interpolators
  val speed = 1.296f
  val myth = f"$name can eat $speed%1.5f burgers per minute"
  //"%8.2f"
  //8 = total length of number including ".", e.g. "    1.30" does not decrease only increase
  //2 = number of digits after decimal decrease as well as increase
  println(myth)

//  val x = 1.1f
  val x = 46
  val str1 = f"$x%8d"
  println(f"a = $str1")

  //raw-interpolator
  println("This is a \n newline")
  println(raw"This is a \n newline")
  println("This is a \\n newline")

  println("\nescaped---------")
  val escaped = "This is a \n newline"
  println(escaped)
  println(raw"$escaped")

  println("\nnotEscaped------")
  val notEscaped = raw"This is a \n newline"
  println(notEscaped)
  println(raw"$notEscaped")
}
