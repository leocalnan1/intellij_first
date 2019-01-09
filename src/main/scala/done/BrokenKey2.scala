//package done
//
//object BrokenKey2 extends App{
//  val listOfWords = List("apple", "hello", "aaaaaaaalep", "appleee")
//  val keyboardKeys = "alep".toArray
//  var longestWord = ""
//  checkWord()
//
//  def checkWord():Unit = {
//    for (word <- listOfWords) {
//      var containsLetters = ArrayBuffer[Boolean]()
//      for (letter <- keyboardKeys) {
//        if (word.contains(letter)) containsLetters.append(true)
//        else containsLetters.append(false)
//      }
//      if (containsLetters.exists(value => value) && longestWord.length < word.length) {
//        longestWord = word
//      }
//    }
//    println(longestWord)
//  }
//}
