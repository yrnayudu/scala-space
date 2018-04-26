package configuration
import com.typesafe.config._

import scala.util.Random

object GatlingSimulation extends JourneyConfiguration {

  val conf: Config = ConfigFactory.load("V3Journeys.conf")

  println(getClass.getClassLoader.getResource("config.json"))
  println("getClass.getResource(\"config.json\") $$$" + getClass.getResource("config.json"))
  println("getClass.getClassLoader.getResource(\"config.json\") $$$$$ "+ getClass.getClassLoader.getResource("config.json"))
  println("getClass.getClassLoader.getResource(\"config.json\").getPath $$$$$ "+ getClass.getClassLoader.getResource("config.json").getPath)

  val conf1: Config = ConfigFactory.load("config.json")
  println(conf1.getString("V3.Endpoints.getOthersName" ))
/*
  def getConfigValue(scenarioName: String): String = {
    ConfigFactory.load("V3Journeys.conf").getString(scenarioName)
  }*/
  val noOfUsers = 20

  private val loadPercentage = (load: Int) => { noOfUsers * load /100}
  def getNewUserName(): String = Random.alphanumeric.take(15).mkString.replaceAll("[0-9]", "x")

  def makeSetNameBody() : String ={
    "{ \n" +
      "    \"Title\": \"Mr\", \n" +
      "    \"GivenName\": \"" +getNewUserName()+  "\",  \n" +
      "    \"FamilyName\": \"" +getNewUserName()+  "\", \n" +
      "    \"MiddleInitials\": \"A\"  \n" +
      "  }"
  }


  def main(args: Array[String]): Unit = {
    println( loadPercentage(conf.getInt("journeys.getOtherName.load")))
    println(noOfUsers * conf.getInt("journeys.getOtherName.load") /100 )

    //println(StringBody(makeSetNameBody()))
  }
}
