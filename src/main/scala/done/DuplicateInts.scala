//package done
//
//object DuplicateInts extends App {
//  def main(args: Array[Int]): Unit = {
//    println("Start:\n")
//  }
//
//  val array1 = Array(768395, 768395, 954687, 463527, 463527, 100000)
//  // Find maximum number in array
//  def findMax(num1:Int, num2:Int):Int = {
//    val top = num1 max num2
//    println("compared %d to %d, %d was larger".format(num1,num2,top))
//    top
//  }
//  array1.reduceLeft(findMax)
//
//  // Find duplicate integers in an array with reduceLeft (IN PROGRESS - DOES NOT COMPILE)
//  def duplicate(num1:Int, num2:Int):Int = {
//    val sum = num1 + num2
//    val sumDivided = sum/2
//    if(sumDivided == num1){
//      println("compared %d to %d, %d is a duplicate".format(num1,num2,sumDivided))
//    }
//    else if(sumDivided == num2) {
//      println("compared %d to %d, %d is a duplicate".format(num1,num2,sumDivided))
//    }
//    else{
//      println("compared %d to %d, not a duplicate".format(num1,num2))
//    }
//    sumDivided
//  }
//  array1.reduceLeft(duplicate)
//
//  // Find duplicate integers in an array with foldLeft (IN PROGRESS - DOES NOT COMPILE)
//  val a = Array(1,2,3,4)
//  def add(num1: Int, num2: Int):Int = {
//    num1 + num2
//  }
//  println(foldLeft(0)(a)(add))
//
//  def foldLeft(lastResult: Int)(array: Array[Int])(f: (Int, Int) => Int): Int = array match {
//    case Nil => lastResult
//    case x :: xs => {
//      val result = f(lastResult, x)
//      println(s"last: $lastResult, x: $x, result = $result")
//      foldLeft(result)(xs)(f)
//    }
//  }
//
//}
