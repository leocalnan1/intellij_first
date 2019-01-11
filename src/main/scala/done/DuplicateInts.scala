package done

object DuplicateInts extends App {
  val array1 = Array(768395, 768395, 954687, 463527, 463527, 100000)
    // Find maximum number in array
    def findMax(num1:Int, num2:Int):Int = {
      val top = num1 max num2
      println("compared %d to %d, %d was larger".format(num1,num2,top))
      println(top)
      top
    }
    array1.reduceLeft(findMax)

  def duplicates() = {
    for (num1 <- array1.indices) {
      for (num2 <- 1 to array1.length-1) {
        val number1 = array1(num1)
        val number2 = array1(num2)
        if (number1 == number2) {
          println("compared %d to %d, %d is a duplicate".format(number1, number2, number2))
        }
        else {
          println("compared %d to %d, %d not a duplicate".format(number1, number2, number2))
        }
      }
    }
  }
  duplicates() //Important, returns everything
}


