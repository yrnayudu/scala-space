package collections.methods

object FlattenMethod {

  val strings = List("a", "b", "c")

  val list6 = strings.map(s => List(s.toLowerCase, s.toUpperCase))
  println(list6)
  println(list6.flatten)

  def main(args: Array[String]): Unit = {

  }
}
