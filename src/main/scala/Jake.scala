object Jake extends App {
  override def main(args: Array[String]): Unit = {
    var jake = "Jake Booker"
      .replace("Jake Booker","Jake")
      .concat(", hello world")
    println(jake)
  }
}
