//package done
//
////6,7,9,7,9,4       2,7,6,4,9             1,8,3,2,9
//object LuhnAlgorithm extends App {
//  import scala.io.StdIn.{readInt}
//
//  def DigitSum(num: Int, digits: List[Int]): List[Int] = {
//    println("Choose and option between a randomly generated number (1) and a user inputted number (2)")
//    var options = readInt
//    if (options == 1) {
//      var RandomNum = scala.util.Random.nextInt(9)
//
//
//      val CardNum2 = num :: digits.tail.reverse
//      for (count <- 0 to CardNum2.length) {
//        print(CardNum2(count))
//      }
//      println(":  is your newest card number")
//      CardNum2
//    }
//
//
//
//
//
//
//
//    }
//    if (options == 2) {
//      val digits = readInt
//      val reverseDigits = num :: List(digits).reverse
//
//    }
//  }
//}
//
//
//object CreditCard extends App {
//
//
//  def CheckValid( NewCard: List[Int])= {   // checks if identifying number is valid
//    var i = 0
//    var Doubled = 0
//    var NextNum = 0
//
//
//    var Total = 0
//    while (i < CardNo.length) {
//      Doubled = CardNo(i + 1) * 2
//      if (Doubled > 9) {
//        Doubled = Doubled - 9
//        Total = Total + Doubled
//        i += 2
//      }
//      else {
//        i += 2
//      }
//    }
//    println(Total)
//    if (Total % 10 == 0) {
//      println(" Your number is valid")
//    }
//    else {
//      println("Your number is invalid")
//    }
//  }
//
//
//  def CheckDigit ( num:Int, NewCard:List[Int]): List[Int] ={   // adds a new digit to the end of a card
//    val NewestCard = num:: NewCard.tail.reverse
//    var z = 0
//    while(z < NewestCard.length) {
//      print(NewestCard(z))
//      z += 1
//    }
//    println(":  is your newest card number")
//    return NewestCard
//
//
//  }
//  var CardNo = List[Int]()
//  var x: Int = 0
//  for(x <- 1 to 16){
//    CardNo = CardNo :+ scala.util.Random.nextInt(9)      //  generates a random card number
//  }
//  val NewCard = CardNo.reverse
//
//  // println("your  card number is")
//  // var y = 0
//  // while(y < NewCard.length){
//  //   print(NewCard(y))
//  //   y +=1
//  // }
//
//
//  CheckValid(NewCard)
//
//  CheckDigit(3,NewCard)
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////  val fakeDigits = Array(4,9,9,2,7,3,9,8,7,1,6).reverse
////  var i = 0
////  var j = 0
////    var sum1 = 0
////  for(i <- 0 to fakeDigits.length -2 by 2){
////    if(i == 0){
////      sum1 = fakeDigits(i+2) +fakeDigits(i)
////
////    }
////  }
////
////  var k = 0
////  var l = 1
////  var digitTimes2Above5 = 0
////  var secondNum = 0
////  var firstNum = 0
////  var finalNum = 0
////  while(k <= 4){ // Even numbers
////    if(fakeDigits(l) < 5){
////      var digitTimes2Below5 = l * 2
////      //println(digitTimes2Below5)
////      k += 1
////    }
////    else {
////      digitTimes2Above5 = l * 2
////      secondNum = digitTimes2Above5 % 10
////      //println(secondNum)
////      firstNum = (digitTimes2Above5 + 10) / 10
////      //println(firstNum)
////      finalNum = firstNum + secondNum
////      //println(finalNum)
////      k += 1
////    }
////    l += 2
////  }
////
////}
