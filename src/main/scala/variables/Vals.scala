package variables

object Vals {

  def ensure(bool: Boolean, msg: String = "solution doesn't seems to be correct"): Unit = {
    if(!bool) throw new Exception(msg)
  }

  def main(args: Array[String]): Unit = {

    val PiConstant = 3.14
    val radius = 2.0

    val area = PiConstant * radius * radius

    println("area of circle :" + area)

    ensure(area == 12.56)


  }
}
