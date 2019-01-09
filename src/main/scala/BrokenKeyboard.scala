object BrokenKeyboard extends App {
  import scala.io.Source
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
          count += 1
        } else {
          count += 1
        }
      }
      if (j == letters1length) {
        println(words(i))
        i += 1
        j = 0
        count = 0
        if (longestWord.length < longestWord1.length) {

        longestWord = longestWord1
        }
                                  //not finished yet
      else {
        i += 1
        j = 0
        count = 0
      }
    }
  }
}


