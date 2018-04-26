package methods

object PassByName1 {

  def value1(): Int = { println("value1"); 1}
  def value2(): Int = { println("value2"); 2}
  def value3(): Int = { println("value3"); 3}
  def value4(): Int = { println("value4"); 4}

  def normalArgs(n: Int) = {
    println("normal args")
    println("n " + n)
    println()
  }



  def passByNameArg(n: => Int) = {
    println("name args")
    println("n " + n)
    println()
  }

  normalArgs(value1() + 0)
  passByNameArg(value2() + 0)

  def passByNameArgIgnored(n: => Int) = {
    println("ignored")
    println()
  }

  def passByNameArgAgain(n: => Int) = {
    println("name args again")
    println("n " + n)
    println("n " + n)
    println()
  }

  passByNameArgIgnored(value3() + 0)
  passByNameArgAgain(value4() + 0)

  def main(args: Array[String]): Unit = {

  }

}
