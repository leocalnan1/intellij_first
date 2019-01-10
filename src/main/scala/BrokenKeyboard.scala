import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object BrokenKeyboard extends App {
  val words = Source.fromURL("http://norvig.com/ngrams/enable1.txt").getLines.toArray
  def DictoLibrary {
    val letters1 = "abcd".toArray
    val letters1length = letters1.length
    val letters2 = "dgsf".toArray
    val letters2length = letters2.length
    val letters3 = "ostr".toArray
    val letters3length = letters3.length
    val letters4 = "ihst".toArray
    val letters4length = letters4.length

    var longestWord = ""
    var longestWord1 = ""
    var i = 0
    var j = 0
    var count = 0
    while (i < words.length) {
      while (count < letters1length) {
        if (words(i).contains(letters1(j))) {
          j += 1
        }
        count += 1
      }
      if (j == letters1length) {
        println(words(i))
        i += 1
        j = 0
        count = 0
        if (longestWord.length < longestWord1.length) {
          longestWord = words(i)
          longestWord = longestWord1
        } else {
          i += 1
          j = 0
          count = 0
        }
      }
      println(s"Longest word: $longestWord")
    }
  }
}

//readUserInput()
//
//def readUserInput():Unit = {
//  println("---")
//  for(keys <- readKeyboards()){
//    betterCheckWord(keys.toArray)
//  }
//}
//
//def readKeyboards():ArrayBuffer[String] = {
//  val keyboards = ArrayBuffer[String]()
//    for(i <- 0 until readInt()){
//    println("------")
//    keyboards.append(readLine())
//  }
//  keyboards
//}
//
//
//def betterCheckWord(keysAvailable: Array[Char]):Unit = {
//  var listOfWords = Source.fromFile("words.txt").getLines.toList
//  ('a' to 'z')
//    .toArray
//    .diff(keysAvailable)
//    .foreach(
//    key => listOfWords = listOfWords.filter(!_.contains(key))
//  )
//  println(listOfWords.sortBy(_.length).last)
//}


object WednesdayTask extends App {
  import scala.io.Source

def WordCalc {

  val lines = Source.fromURL("http://norvig.com/ngrams/enable1.txt").getLines.toArray
  val WordCombo1 = "abcd"
  val array1 = WordCombo1.toArray
  val array1Length = array1.length
  var i = 0
  var j = 0
  var count = 0
  var LongestArrayLength = 0
  var LongestWord = ""
  var length1 = 0
  while (i < lines.length) { //goes through all the words
    while (count < array1Length) { // goes through each individual letter
      if (lines(i).contains(array1(j))) { // checks if letter is in word
        j += 1
        count += 1 // if it is it goes to the next letter
      }
      else {
        count += 1
      }
    }
    if (j == array1Length) {
      println(lines(i))
      length1 = lines(i).length()
      if( length1 > LongestArrayLength) {
        LongestWord = lines(i)
        LongestArrayLength = length1
      }

      i += 1
      j = 0
      count = 0
    }
    else {
      i += 1
      j = 0
      count = 0
    }
  }
  println(s"the longest word is: $LongestWord")
}
println("please enter number")
val WordNumber = scala.io.StdIn.readInt()
var b = 0
while( b < WordNumber) {
  WordCalc
  b+=1
}
}

