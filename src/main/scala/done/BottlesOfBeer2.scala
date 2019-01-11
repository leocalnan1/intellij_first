package done

object BottlesOfBeer2 extends App{
  def bottleFunction(counter:Int):Unit = {
    println(s"$counter bottles of beer on the wall, $counter bottles of beer. ")
    println(s"Take one down and pass it around, $counter bottles of beer on the wall.\n")
  }
  val rangeOfNums = 99 to 1 by -1
  rangeOfNums.foreach(i => bottleFunction(i))

  println(s"No more bottles of beer on the wall, no more bottles of beer. ")
  println(s"Go to the store and buy some more, 99 bottles of beer on the wall.")
}
