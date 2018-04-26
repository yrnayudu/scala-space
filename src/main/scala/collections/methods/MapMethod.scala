package collections.methods

object MapMethod {

  val strings = List("a", "b", "c")
  val stringsMapped1 = strings.map(string => string + "!")
  println(stringsMapped1)

  val stringsMapped2 = strings.map(string => string )
  println(stringsMapped2)

  val stringsMapped3 = strings.map(string => 123 )
  println(stringsMapped3)

  val stringsMapped4 = strings.map(string => List(1,2) )
  println(stringsMapped4)

  val stringsMapped5 = strings.map(s => List(s,2) )
  println(stringsMapped5)

  //list of strings => add lower case and upper case strings
  val list6 = strings.map(s => List(s.toLowerCase, s.toUpperCase))
  println(list6)


  def main(args: Array[String]): Unit = {

  }

}
