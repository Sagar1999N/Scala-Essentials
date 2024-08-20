package lectures.part2oop

object OOBasics extends App {
  private val person = new Person("Sagar", 24)
  println(person.x)
  person.greet("Kiran")
  person.greet()

  private val writer1 = new Writer("Sagar", "Nalawade", 1999)
  private val writer2 = new Writer("Sagar", "Nalawade", 1999)
  println(writer1.fullName)
  private val novel1 = new Novel("Novel1", 2020, writer1)
  println(s"Author's Age is ${novel1.authorAge()}")
  println(s"${novel1.name} is Written by ${novel1.isWrittenBy()}")
  println(novel1.isWrittenBy(writer2))
  private val novel2 = novel1.copy(2024)
  println(s"Author's Age is ${novel2.authorAge()}")
  println(s"${novel2.name} is Written by ${novel2.isWrittenBy()}")

  private var counter = new Counter(5)
  println(counter.count)
  counter = counter.increment()
  println(counter.count)
  counter = counter.decrement()
  println(counter.count)
  counter.increment(5)
  println(counter.count)
  counter.decrement(5)
  println(counter.count)

  val counter1 = new Counter
  counter1.inc().print()
  counter1.inc().inc().inc().print()
  counter1.inc(10).print()
}

//constructor
class Person(name: String, val age: Int) {
  //body
  var x = 2
  println(10 + 20)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading - same name with different signature return type does not matter
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("Sagar")

}

class Writer(val name: String, val lastName: String, val year: Int) {
  val fullName = s"$name $lastName"
}

class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {
  def authorAge(): Int = yearOfRelease - author.year

  def isWrittenBy(): String = s"${author.name} ${author.lastName}"

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(yearOfRel: Int): Novel = new Novel(this.name, yearOfRel, this.author)
}

class Counter(var count: Int = 0) {
  def print(): Unit = println(count)

  def inc(): Counter = {
    println("Incrementing")
    new Counter(count + 1)
  }

  def dec(): Counter = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc().inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec().dec(n - 1)
  }

  def increment(in: Int): Unit = {
    this.count = this.count + in
  }

  def decrement(in: Int): Unit = {
    this.count = this.count - in
  }

  def increment(): Counter = Counter(count + 1)

  def decrement(): Counter = Counter(count - 1)
}


//class parameters are NOT fields
//adding val/var before parameter will create field