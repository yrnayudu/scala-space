package s99

object P01Lists {

  def lastElement[A](list: List[A]): A = {
    list.last
  }

  def findLastElement[A](ls: List[A]): A = ls match {
    case l :: Nil => l
    case _ :: tail => findLastElement(tail)
    case _  => throw new NoSuchElementException
  }


  //find last but one
  def lastButOneElement[A](list: List[A]): A = {
    if(list.isEmpty) throw new NoSuchElementException
    else list.init.last
    //list.take(list.size - 1).last
  }

  def findLastButOneElement[A](ls : List[A]):A = ls match {
    case l :: _ :: Nil => l
    case _ :: tail => findLastButOneElement(tail)
    case _ => throw new NoSuchElementException
  }
  //find nth element of list
  def nthElement[A](n: Int, list: List[A]): A = {
    if(n > 0) list(n) else throw new NoSuchElementException
    //list.take(n).last
  }

  def findNthElement[A](n: Int, list: List[A]): A = (n, list) match {
    case (0,l :: _) => l
    case (n, _ :: tail) => findNthElement(n-1, tail)
    case (_, Nil) => throw new NoSuchElementException


  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list.size)
    println(lastElement(list))
    println("last recursion ::" + findLastElement(list))
    println("last but one recursion ::" + findLastButOneElement(list))
    println("nth element recursion :: "+ findNthElement(5, list))
    println("for a commit")
    println("take :" + list.take(3))
    println("take :" + list.takeRight(2).head)
    println("last but one :" + lastButOneElement(list))
    println("nth : " + nthElement(5, list))
  }

}
