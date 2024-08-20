package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessVoidReturningFunction(): Unit = println(42)

  aParameterlessVoidReturningFunction()

  def aParameterlessFunction(): Int = 43

  println(aParameterlessFunction())
  // println(aParameterlessFunction)// shown in video but not working may be depricated

  val name: String = "SAGAR"

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString.charAt(0).toString
    else aString.charAt(n - 1) + "," + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction(name, 5))
  //Whenever you need loops, Use recursive functions

  def printCharacters(s: String, index: Int = 0): Unit = {
    if (index < s.length) {
      println(s(index))
      printCharacters(s, index + 1) // Recursive call to print the next character
    }
  }

  printCharacters(name)

  def printCharactersRecursively(str: String, index: Int = 0): Unit = {
    if (index < str.length) {
      // Print the current character
      print(str.charAt(index))

      // If it's not the last character, print a comma
      if (index < str.length - 1) {
        print(",")
      }

      // Recursively call the function for the next character
      printCharactersRecursively(str, index + 1)
    }
  }

  // if a normal function didnt define return type its not an issue
  // but a recursive function should always define return type

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n - 1)
  }
  // println(aSmallFunction(5,4)) // scope is limited to aBigFunction
  println(aBigFunction(5))

  def anIntroductoryFunction(name: String, age: Int): String = {
    s"Hi, My name is ${name} and I am ${age} years old."
  }

  println(anIntroductoryFunction("Sagar", 24))

  def aFactorialFunction(n: Int): Int = {
    if (n > 0) n * aFactorialFunction(n - 1)
    else 1
  }

  println(aFactorialFunction(5))

  def aFibonacciNumber(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1 || n == 2) {
      1
    }
    else {
      aFibonacciNumber(n - 1) + aFibonacciNumber(n - 2)
    }
  }

  println(aFibonacciNumber(7))

  def aFibonacciSequence(n: Int): Unit = {
    if (n >= 0) {
      aFibonacciSequence(n - 1)
      println((aFibonacciNumber(n)))
    }
  }

  aFibonacciSequence(10)

  def ifPrime(n: Int, m: Int = 2): Boolean = {
    if (n < 2) false
    else if (m <= scala.math.sqrt(n)) {
      if (n % m == 0) false
      else ifPrime(n, m + 1)
    } else true
  }

  def ifPrimeRec(n: Int, m: Int = 2): Boolean = {
    if (n < 2) false
    else if (m <= scala.math.sqrt(n)) {
      n % m == 0
    } else ifPrimeRec(n, m + 1)
  }

  println(ifPrime(-9))

}
