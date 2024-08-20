package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  private def aFactorialFunction(n: Int): Int = {
    if (n > 0) n * aFactorialFunction(n - 1)
    else 1
  }

  private def aFactorialFunctionTailRec(i: BigInt): BigInt = {
    @tailrec
    def aTailRec(n: BigInt, accumulator: BigInt): BigInt = {
      //println(accumulator)
      if (n > 0) aTailRec(n - 1, n * accumulator)
      else accumulator
    }

    aTailRec(i, 1)
  }

  println(aFactorialFunctionTailRec(5))
  //println(aFactorialFunction(50000))

  private def recString(aString: String, aNumber: Int): String = {
    if (aNumber == 1) aString
    else aString + "," + recString(aString, aNumber - 1)
  }

  private def tailRecString(aString: String, n: Int): String = {
    @tailrec
    def aTailRec(aString: String, n: Int, accumulator: String): String = {
      if (n > 0) aTailRec(aString, n - 1, aString + "|" + accumulator)
      else accumulator
    }

    aTailRec(aString, n, "")
  }

  println(recString("Sagar", 5))
  println(tailRecString("Sagar", 5))

  private def aFibonacciNumber(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1 || n == 2) {
      1
    }
    else {
      aFibonacciNumber(n - 1) + aFibonacciNumber(n - 2)
    }
  }

  //  println(aFibonacciNumber(50))

  private def aTailRecFibonacciNumber(n: Int): BigInt = {
    @tailrec
    def aTailRec(n: Int, currentPos: Int, prev: BigInt, current: BigInt): BigInt = {
      if (n > currentPos) aTailRec(n, currentPos + 1, current, prev + current)
      else current
    }

    if (n < 1) 0 else aTailRec(n, 1, 0, 1)
  }

  //  println(aTailRecFibonacciNumber(50))

  private def ifPrimeRec(n: Int, m: Int = 2): Boolean = {
    if (n < 2) false
    else if (m > scala.math.sqrt(n).toInt) true
    else if (n % m == 0) false
    else {
      val result = ifPrimeRec(n, m + 1)
      result
    }
  }

  private def ifPrimeTailRec(n: Int): Boolean = {
    @tailrec
    def aTailRec(n: Int, m: Int): Boolean = {
      if (n < 2) false
      else if (m > scala.math.sqrt(n).toInt) true
      else if (n % m == 0) false
      else aTailRec(n, m + 1)
    }

    aTailRec(n, 2)
  }

  println(ifPrimeRec(101))
  println(ifPrimeTailRec(101))
}
