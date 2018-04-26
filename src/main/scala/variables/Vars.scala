package variables

object Vars {

  // Complete list of types:
  // Byte Short Int
  // Long Float Double
  // Char String Boolean

  var byteVar: Byte = 10
  var shortVar: Short = 20
  //type inference
  var intVar = 30
  var longVar = 30l
  var doubleVar = 40d
  var doubleVar2 = 40.0
  var stringVar = "test"
  var boolVar = false

  def ensure(bool: Boolean, msg: String = "solution isn't totally correct"): Unit = {
    if(!bool){
      throw new Exception(msg)
    }
  }

  def main(args: Array[String]): Unit = {
    println("byteVar: " + byteVar)
    println("shortVar: " + shortVar)
    println("intVar: " + intVar)
    println("longVar: " + longVar)
    println("stringVar: " + stringVar)
    println("boolVar: " + boolVar)

    ensure(byteVar == 20)

  }
}
