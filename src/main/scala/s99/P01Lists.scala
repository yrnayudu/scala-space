package s99

object P01Lists {

  def lastElement(list: List[Int]): Int = {
    list.last
  }

  //find last but one
  def lastButOneElement(list: List[Int]): Int = {
    list.take(list.size - 1).last
  }

  //find nth element of list
  def nthElement(n: Int, list: List[Int]): Int = {
    list.take(n).last
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list.size)
    println(lastElement(list))
    println("take :" + list.take(3))
    println("take :" + list.takeRight(2).head)
    println("last but one :" + lastButOneElement(list))
    println("nth : " + nthElement(5, list))
  }

}
