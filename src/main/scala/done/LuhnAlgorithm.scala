object LongNumber extends App {
  def checkDigit(num:Int, newNum:List[Int]): List[Int] = {
    val newestNum = num :: newNum.tail.reverse
    var j = 0
    print("New number:   ")
    while (j < newestNum.length) {
      print(newestNum(j))
      j += 1
    }
    println("")
    newestNum
  }
  def checkingValidity(newNumber: List[Int]):Unit = {   // checks if identifying number is valid
    var i = 0
    var doubled = 0
    var sum = 0
    while (i < num.length) {
      doubled = num(i + 1) * 2
      if (doubled > 9) {
        doubled = doubled - 9
        sum = sum + doubled
        i += 2
      }
      else {
        i += 2
      }
    }
    println("")
    print(sum)
    if (sum % 10 == 0) {
      println(":   The number is valid\n")
    }
    else {
      println(":   The number is invalid\n")
    }
  }

  var num = List[Int]()
  var x: Int = 0
  for(x <- 1 to 16){
    num = num :+ scala.util.Random.nextInt(9)
  }
  val newNum = num.reverse
  checkingValidity(newNum)
  checkDigit(num = 3, newNum)
}

