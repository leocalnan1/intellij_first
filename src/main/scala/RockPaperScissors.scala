import scala.io.StdIn.{readInt}

class RockPaperScissors {
  def battle(num:Int) = {
    println("Pick an option:\nRock (1)\nPaper (2)\nScissors (3)")
    val num = scala.util.Random.nextInt(3)
    num match{
      case 1 => this.Rock
      case 2 => this.Paper
      case 3 => this.Scissors
      case _ => println("Invalid option....")
    }
  }
  def Rock: Unit = {
    val AIChoice = scala.util.Random.nextInt(3)
    var playerCount = 0
    var AICount = 0
    if(AIChoice == 1){
      println("Rock was picked by AI, draw")
      Player.playerRockCount += 0
      AI.AIRockCount += 0
    }
    if(AIChoice == 2){
      println("Paper was picked by AI, loss")
      Player.playerRockCount += 0
      AI.AIRockCount += 1
    }
    if(AIChoice == 3){
      println("Scissors was picked by AI, win")
      Player.playerRockCount += 1
      AI.AIRockCount += 0
    }
  }
  def Paper = {
    val AIChoice = scala.util.Random.nextInt(3)
    var AICount = 0
    if(AIChoice == 1){
      println("Rock was picked by AI, win")
      Player.playerPaperCount += 1
      AI.AIPaperCount += 0
    }
    if(AIChoice == 2){
      println("Paper was picked by AI, draw")
      Player.playerPaperCount += 0
      AI.AIPaperCount += 0
    }
    if(AIChoice == 3){
      println("Scissors was picked by AI, loss")
      Player.playerPaperCount += 0
      AI.AIPaperCount += 1
    }
  }
  def Scissors ={
    var AIChoice = scala.util.Random.nextInt(3)
    var playerCount = 0
    var AICount = 0
    if(AIChoice == 1){
      println("Rock was picked by AI, loss")
      Player.playerScissorsCount += 0
      AI.AIScissorsCount += 1
    }
    if(AIChoice == 2){
      println("Paper was picked by AI, win")
      Player.playerScissorsCount += 1
      AI.AIScissorsCount += 0
    }
    if(AIChoice == 3){
      println("Scissors was picked by AI, draw")
      Player.playerScissorsCount += 0
      AI.AIScissorsCount+= 0
    }
  }
  def Repeat={

  }
}

object Main extends App {
  var ref = new RockPaperScissors

  try {
    var x = 0
    while (x == 0) {
      println("Pick an option:\n(1) Rock\n(2) Paper\n(3) Scissors\n(4) Retry")
      var playerChoice = readInt
      if (playerChoice == 1) {
        ref.Rock
        x += 1
      }
      if (playerChoice == 2) {
        ref.Paper
        x += 1
      }
      if (playerChoice == 3) {
        ref.Scissors
        x += 1
      }
      if (playerChoice == 4) {
        println("You are about to retry .... ")
        x = 0
      }
    }
  } catch {
    case e: Exception => println(e)
  }
}

object Player {
  var playerRockCount = 0
  var playerPaperCount = 0
  var playerScissorsCount = 0
}

object AI {
  var AIRockCount = 0
  var AIPaperCount = 0
  var AIScissorsCount = 0
}