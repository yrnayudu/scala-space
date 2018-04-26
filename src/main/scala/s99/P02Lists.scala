package s99

object P02Lists {

  //find last but one
  def lastButOneElement(list: List[Int]): Int = {
    list.take(list.size-1).last
  }

  def main(args: Array[String]): Unit = {
    val list = List[Int](1,2,3,4,5)
    println("take :" + list.take(3))
    println("take :" + list.takeRight(2).head)
    println(lastButOneElement(list))

  }
}
