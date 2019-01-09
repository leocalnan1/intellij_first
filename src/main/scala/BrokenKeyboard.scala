object BrokenKeyboard extends App {
  import scala.io.Source
  val words = Source.fromURL("http://norvig.com/ngrams/enable1.txt").getLines.toArray

  val letters1 = "abcd".toArray
  val letters1length = letters1.length
  val letters2 = "dgsf".toArray
  val letters2length = letters2.length
  val letters3 = "ostr".toArray
  val letters3length = letters3.length
  val letters4 = "ihst".toArray
  val letters4length = letters4.length

//  val availableKeys = "he".toArray // Array("h","e")
//  val testWord = "hello"
//  var character = 0
//  var contains = false
//  for (character <- words.length) {
//    println(character)
//    character += 1
  // }
  var i = 0
  var k = 0
  var count = 0
  while()
    var longestWord = ""
    var longestWord21 = "a"

    if (longestWord.length <  longestWord21.length) {
      longestWord = longestWord21
    }

  while (i < words.length) {
    while (count < letters1length) {
      if (words(i).contains(letters1(k))) {
        k += 1
        count += 1
      } else {
        count += 1
      }
    }
    if (k == letters1length) {
      println(words(i))
      i += 1
      k = 0
      count = 0
    }
    else {
      i += 1
      k = 0
      count = 0
    }
  }
}


