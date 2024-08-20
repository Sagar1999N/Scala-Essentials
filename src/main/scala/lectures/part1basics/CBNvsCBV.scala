package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  //calling by value will get the input value sent while calling the function
  //and feed it to both the print statements

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  //calling by name will use the expression sent while calling the function
  //and at the time of feeding values to the print statements will evaluate the expression
  //while calling prints from first print to second print some time passes so time value changes
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
  //Difference of "=>"
  //=> means call by name

  def infinite(): Int = 1+infinite()

  def printFirst(x: Int, y: => Int) = println(x)
  //printFirst(infinite(),34)
  //will call infinite function and will cause stack overflow
  printFirst(34,infinite())
  //=> delays the evaluation of the expression until its used
  //in this case since its not used at all so it does not crash


  //Call by Value
  //value is computed before call
  //same value is used everywhere

  //Call by Name
  //expression is passed literally
  //expression is evaluated at every use within
}
