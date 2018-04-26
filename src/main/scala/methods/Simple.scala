package methods

object Simple {
  //variables in scala
  val str1 = "hello"
  val str2 = ("hello" + " ")
  val str3 = {"hello"}.toUpperCase()

  def getHello() = "hello"

  val str4 = getHello()
  //methods are same in scala
  def getHello1(): String = "hello"
  def getHello2(): String = ("hello" + "")
  def getHello3(): String = {"hello"}.toUpperCase()
  def getHello4(): String = getHello()

  //or in multiple lines
  def getHello5(): String = {
    println("hello")
    "hello"
  }
  val isProd = false
  def getLog(): String = if(isProd) "1" else "2"

  //create a counter variable
  var counter = 0
  //create a method to increment counter
  def incrementCounter(value: Int): Unit = {
    counter = counter + value
  }
  //create a method to get count
  def count(): Int = counter

  def main(args: Array[String]): Unit = {
    ensure(counter == 0)
    incrementCounter(10)
    ensure(count() == 10)
    incrementCounter(30)
    ensure(count() == 40)
  }

  def ensure(bool: Boolean, msg: String = "solution doesn't seems to be correct"): Unit = {
    if (!bool) throw new Exception(msg)
  }

}
