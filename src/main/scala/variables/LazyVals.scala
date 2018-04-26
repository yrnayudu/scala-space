package variables

object LazyVals {
  lazy val myInt10 = {println("test"); 10}

  lazy val myInt20 = {println("test"); 10}
  println(myInt20)
  println(myInt10)

  println(myInt10)
  println(myInt20)


  def main(args: Array[String]): Unit = {

  }

  def ensure(bool: Boolean, msg: String = "solution doesn't seems to be correct"): Unit = {
    if (!bool) throw new Exception(msg)
  }
}
