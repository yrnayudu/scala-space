package utils

import scala.util.Random

object RandomTest {

  def getNewUserName: String = Random.alphanumeric.take(15).mkString.replaceAll("[0-9]", "x")

  def main(args: Array[String]): Unit = {
    println(getNewUserName)
    println(getNewUserName)
    println(getNewUserName)
    println(getNewUserName)
    println(getNewUserName)


  }
}
