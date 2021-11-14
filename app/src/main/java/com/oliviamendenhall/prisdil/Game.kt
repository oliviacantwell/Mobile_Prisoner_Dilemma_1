package com.oliviamendenhall.prisdil

import android.widget.Toast

class Game {

    //abstract var clicked: Boolean
    private var opponentScore = 0
    private var playerScore = 0



    fun opponentChoices(): Int {

        //randomly generates opponent's choice
        val steal = 1
        val split = 2

        return (steal..split).random()
    }

    fun playerSteal(clicked: Boolean): Boolean {

        //Toast.makeText(this,"clicked steal", Toast.LENGTH_LONG).show()
        return clicked
    }

    fun playerSplit(clicked: Boolean): Boolean {
        return clicked
    }

    fun playerChoices(): Char {

        var playerChoice = 's'

        //if (!playerSplit(clicked)) {
            playerChoice = 't'
       // }


        //set variable to view id (findViewById(R.id.splitButton)
        //findViewById(R.id.stealButton)

        //variable.setOnClickListener(new View.OnClickListener() {
        //  public void onClick(View v) { playerChoice = 's' }

        //do same with steal

        return playerChoice
    }

    fun playerScore(addNum1: Int): Int {

        playerScore += addNum1
        //set text of score to playerScore
        return playerScore
    }

    fun opponentScore(addNum2: Int): Int {

        opponentScore += addNum2
        //set text of score to opponentScore
        return opponentScore
    }

    fun calcOutcome(opponentChoice: Int, playerChoice: Char) {
        if (opponentChoice == 1)
            //Toast.makeText(this, "Your opponent chose steal!", Toast.LENGTH_LONG).show()
        else
            //Toast.makeText(this, "Your opponent chose split!", Toast.LENGTH_LONG).show()

        //figures out what choices everyone made and calls the functions to add to the scores
        when {
            opponentChoice == 2 && playerChoice == 's' -> opponentScore(50) and playerScore(50)
            opponentChoice == 2 && playerChoice == 't' -> opponentScore(0) and playerScore(100)
            opponentChoice == 1 && playerChoice == 's' -> opponentScore(100) and playerScore(0)
            opponentChoice == 1 && playerChoice == 't' -> opponentScore(0) and playerScore(0)
        }
    }



    fun roundCount() {
        var round = 1
        var rounds = 3

        //set a variable to the view id "roundCount" (findViewById(R.id.roundCount)


        while (round <= rounds)
        {
            //set roundCount text to "Round $round"
            var opponentChoice = opponentChoices() //gets opponent's choice
            var playerChoice = playerChoices() //gets your choice
            calcOutcome(opponentChoice, playerChoice) //adds up scores
            round++
        }
    }

    fun main () {

        //var g = Game()
        //g.roundCount()
        //g.winner()
    }


}
