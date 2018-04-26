package s99

object P01Lists {

  def last(list: List[Int]): Int = {
    list.last
  }

  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)
    println(list.size)
    println(last(list))
  }

}
