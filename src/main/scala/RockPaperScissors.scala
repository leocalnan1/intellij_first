

import scala.io.StdIn.readInt

class RockPaperScissors {
  def Rock = {
    val AIChoice = scala.util.Random.nextInt(3)
    if(AIChoice == 1){
      println("Rock was picked by AI, draw\n")
      Player.playerRockWinCount += 0
      AI.AIRockCount += 0
    }
    if(AIChoice == 2){
      println("Paper was picked by AI, loss\n")
      Player.playerRockWinCount += 0
      AI.AIRockCount += 1
    }
    if(AIChoice == 3){
      println("Scissors was picked by AI, win\n")
      Player.playerRockWinCount += 1
      AI.AIRockCount += 0
    }
  }
  def Paper = {
    val AIChoice = scala.util.Random.nextInt(3)
    if(AIChoice == 1){
      println("Rock was picked by AI, win\n")
      Player.playerPaperWinCount += 1
      AI.AIPaperCount += 0
    }
    if(AIChoice == 2){
      println("Paper was picked by AI, draw\n")
      Player.playerPaperWinCount += 0
      AI.AIPaperCount += 0
    }
    if(AIChoice == 3){
      println("Scissors was picked by AI, loss\n")
      Player.playerPaperWinCount += 0
      AI.AIPaperCount += 1
    }
  }
  def Scissors ={
    val AIChoice = scala.util.Random.nextInt(3)
    if(AIChoice == 1){
      println("Rock was picked by AI, loss\n")
      Player.playerScissorsWinCount += 0
      AI.AIScissorsCount += 1
    }
    if(AIChoice == 2){
      println("Paper was picked by AI, win\n")
      Player.playerScissorsWinCount += 1
      AI.AIScissorsCount += 0
    }
    if(AIChoice == 3){
      println("Scissors was picked by AI, draw\n")
      Player.playerScissorsWinCount += 0
      AI.AIScissorsCount+= 0
    }
  }
}

object Main extends App {
  var ref = new RockPaperScissors

  try {
    var x = 0
    while (x == 0) {
      var retryCount = 0 // Work on this
      println("Pick an option by entering a number from 1 to 3:\n(1) Rock\n(2) Paper\n(3) Scissors")
      val playerChoice = readInt
      match {
        case 1 => ref.Rock
        case 2 => ref.Paper
        case 3 => ref.Scissors
        case _ =>
      }
      if (playerChoice == 1) {
        ref.Rock
        println("Would you like to play again? Pick a number\n(1) Yes\n(2) No")
        val retry = readInt
        if(retry == 1) {
          x = 0
          retryCount += 1
          println(s"Retry: $retryCount")
        }
        else if(retry == 2){
          x += 1
          println("You have chosen not to retry. End of game.")
        }
        else{
          x += 1
          println("End.")
        }
      }
      if (playerChoice == 2) {
        ref.Paper
        println("Would you like to play again? Pick a number\n(1) Yes\n(2) No")
        val retry = readInt
        if(retry == 1) {
          x = 0
          retryCount += 1
          println(s"Retry: $retryCount")
        }
        else if(retry == 2){
          x += 1
          println("You have chosen not to retry. End of game.")
        }
        else{
          x += 1
          println("End.")
        }
      }
      if (playerChoice == 3) {
        ref.Scissors
        println("Would you like to play again? Pick a number\n(1) Yes\n(2) No")
        val retry = readInt
        if(retry == 1) {
          x = 0
          retryCount += 1
          println(s"Retry: $retryCount")
        }
        else if(retry == 2){
          x += 1
          println("You have chosen not to retry. End of game.")
        }
        else{
          x += 1
          println("End.")
        }
      }
    }
  } catch {
    case e: Exception => println(e)
  }
}

object Player {
  var playerRockWinCount = 0
  var playerPaperWinCount = 0
  var playerScissorsWinCount = 0
  def vanityChoices() {
    println("Would you like to see how many times you have won with either: " +
      "(1) Rock, (2) Paper, (3) Scissors or (4) all of them? Press 5 if not.")
    val vanityChoice = readInt
    if (vanityChoice == 1) {
      println(s"Amount of wins with 'Rocks' picked: $playerRockWinCount")
    }
    if (vanityChoice == 2) {
      println(s"Amount of wins with 'Paper' picked: $playerPaperWinCount")
    }
    if (vanityChoice == 3) {
      println(s"Amount of wins with 'Scissors' picked: $playerScissorsWinCount")
    }
    if (vanityChoice == 4) {
      println(s"Amount of wins with 'Rocks' picked: $playerRockWinCount")
      println(s"Amount of wins with 'Paper' picked: $playerPaperWinCount")
      println(s"Amount of wins with 'Scissors' picked: $playerScissorsWinCount")
    }
    else {

    }
  }
}


object AI {
  var AIRockCount = 0
  var AIPaperCount = 0
  var AIScissorsCount = 0
//    println(s"Amount of 'Rocks' picked: $AIRockCount")
//    println(s"Amount of 'Paper' picked: $AIPaperCount")
//    println(s"Amount of 'Scissors' picked: $AIScissorsCount")

}