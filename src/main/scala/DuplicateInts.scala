object DuplicateInts extends App {
  def main(args: Array[Int]): Unit = {
    println("Start:\n")
  }

  val array1 = Array(768395, 768395, 954687, 463527, 463527, 100000)
  // Find maximum number in array
  def findMax(x:Int, y:Int):Int = {
    val top = x max y
    println("compared %d to %d, %d was larger".format(x,y,top))
    top
  }
  array1.reduceLeft(findMax)

  // Find duplicate integers in an array with reduceLeft (IN PROGRESS - DOES NOT COMPILE)
  def duplicate(x:Int, y:Int):Int = {
    val m = x + y
    val n = m/2
    if(n == x){
      println("compared %d to %d, %d is a duplicate".format(x,y,n))
    }
    else if(n == y) {
      println("compared %d to %d, %d is a duplicate".format(x,y,n))
    }
    else{
      println("compared %d to %d, not a duplicate".format(x,y))
    }
    n
  }
  array1.reduceLeft(duplicate)

  // Find duplicate integers in an array with foldLeft (IN PROGRESS - DOES NOT COMPILE)
  val a = Array(1,2,3,4)
  def add(a: Int, b: Int):Int = {
    a + b
  }
  println(foldLeft(0)(a)(add))

  def foldLeft(lastResult: Int)(array: Array[Int])(f: (Int, Int) => Int): Int = array match {
    case Nil => lastResult
    case x :: xs => {
      val result = f(lastResult, x)
      println(s"last: $lastResult, x: $x, result = $result")
      foldLeft(result)(xs)(f)
    }
  }

}
