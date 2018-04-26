package functions

object Functions1 {

  //function definition
  val addOneF = (i: Int) => { i + 1 }
  //addOneF = function literal
  //other way of defining a function
  val powerF: Int => Int = i => i*i

  val otherPowerF: Int => Int = powerF

  //calling a function
  println(addOneF.apply(10))
  println(powerF(10))
  println(otherPowerF(10))

  def main(args: Array[String]): Unit = {

  }


}
