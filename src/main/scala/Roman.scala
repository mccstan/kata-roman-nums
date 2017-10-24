import scala.collection.mutable

object Roman {


  def decode(num: Int) : String = {
    val range1_3 = Range.inclusive(1, 3)
    val range5_8 = Range.inclusive(5, 8)

    if (range1_3.contains(num) || range5_8.contains(num))
      return decodeRange1_3__5_8(num)
    else if(isMainPrefix(num))
      return decodeMain(num)
    return decodeRange1_3__5_8__Mult(num)
  }



  def decodeMain(num: Int) : String = num match {
    case 1 => "I"
    case 5 => "V"
    case 10 => "X"
    case 50 => "L"
    case 100 => "C"
    case 500 => "D"
    case 1000 => "M"
  }

  def decodeMultiPrefix(prefix: String, occur : Int) : String = {
    var value = ""
    for(i <- 1 to occur)
      value += prefix
    return value
  }


  def decodeRange1_3__5_8__Mult(num: Int) : String = {
    val prefix = findPrefix(num)
    val rest = num % prefix
    if (rest < 10  && num / prefix <=1)
      return decodeMain(prefix) + decodeRange1_3__5_8(num % prefix)
    else if (isMainPrefix(num))
      return decodeMain(prefix) + decodeRange1_3__5_8__Mult(rest)
    return decodeMultiPrefix(decodeMain(prefix), num / prefix ) + decodeRange1_3__5_8__Mult(rest)
  }

  def decodeRange1_3__5_8(num: Int) : String = {
    var numeral = if(num < 5)  "" else "V"
    val begin = if(num < 5) 1  else 6

    for (a <- begin to num){
      numeral = numeral + "I"
    }
    if (num == 5)
      return "V"
    return numeral
  }



  def findPrefix (num : Int) : Int = {
    val mainNums = Array(5, 10, 50, 100, 500, 1000)
    var prefixNumber = 1
    for (value <- mainNums){
      if(num >= value )
        prefixNumber = value
    }
    return prefixNumber
  }

  def isMainPrefix(num : Int) : Boolean =  {
    val mainNums = Array(5, 10, 50, 100, 500, 1000)
    if (mainNums.contains(num))
      return true
    return  false
  }


}
