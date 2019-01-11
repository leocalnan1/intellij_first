object BrokenKeyboard extends App {
  import scala.io.Source

  def wordCalc {
    val dictionary = Source.fromURL("http://norvig.com/ngrams/enable1.txt").getLines.toArray
    val word = "abcd"
    val array = word.toArray
    val array1length = array.length
    var i = 0
    var j = 0
    var count = 0
    var LongestArrayLength = 0
    var LongestWord = ""
    var length = 0
    while (i < dictionary.length) { //goes through all the words
      while (count < array1length) { // goes through each individual letter
        if (dictionary(i).contains(array(j))) { // checks if letter is in word
          j += 1
          count += 1 // if it is it goes to the next letter
        }
        else {
          count += 1
        }
      }
      if (j == array1length) {
        println(dictionary(i))
        length = dictionary(i).length()
        if( length > LongestArrayLength) {
          LongestWord = dictionary(i)
          LongestArrayLength = length
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
    println(s"Longest word: $LongestWord")
  }
  val numberOfWords = 3
  var b = 0
  while( b < numberOfWords) {
    wordCalc
    b+=1
  }
}


