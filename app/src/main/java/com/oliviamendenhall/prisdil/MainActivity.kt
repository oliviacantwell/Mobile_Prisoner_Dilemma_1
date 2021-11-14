package com.oliviamendenhall.prisdil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import java.util.*

class MainActivity : AppCompatActivity() {

    var g = Game()
    var playerScore = 0
    var oppScore = 0
    var round = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stealButton = findViewById<Button>(R.id.stealButton)
        stealButton.setOnClickListener { playerSteal() }

        var splitButton = findViewById<Button>(R.id.splitButton)
        splitButton.setOnClickListener { playerSplit() }

    }

    //increases the round displayed when called by the button choice functions
    fun roundCount(round: Int) {
        var roundText = findViewById<TextView>(R.id.roundCount)
        roundText.text = "Round $round"
    }

    //randomly generates what the opponent's choice was
    fun opponentChoices(): Int {
        val steal = 1
        val split = 2

        return (steal..split).random()
    }

    //if user presses the split button
    fun playerSplit() {
        var choice = opponentChoices()
        var playerScoreText = findViewById<TextView>(R.id.playerScore)
        var oppScoreText = findViewById<TextView>(R.id.oppScore)

        if (choice == 1) //what happens depends on oppenents choice
        {
            Toast.makeText(this, "Opponent chose steal!", Toast.LENGTH_LONG).show()
            playerScoreText.text = "$playerScore"
            oppScore += 100
            oppScoreText.text = "$oppScore"

        }
        else
        {
            Toast.makeText(this, "Opponent chose split!", Toast.LENGTH_LONG).show()
            playerScore += 50
            playerScoreText.text = "$playerScore"
            oppScore += 50
            oppScoreText.text = "$oppScore"
        }
        round++
        roundCount(round)
    }

    //if user presses steal button
    fun playerSteal() {
        var choice = opponentChoices()
        var playerScoreText = findViewById<TextView>(R.id.playerScore)
        var oppScoreText = findViewById<TextView>(R.id.oppScore)
        if (choice == 1)
        {
            Toast.makeText(this, "Opponent chose steal!", Toast.LENGTH_LONG).show()
            playerScoreText.text = "$playerScore"
            oppScoreText.text = "$oppScore"

        }
        else
        {
            Toast.makeText(this, "Opponent chose split!", Toast.LENGTH_LONG).show()
            playerScore += 100
            playerScoreText.text = "$playerScore"
            oppScoreText.text = "$oppScore"
        }
        round++
        roundCount(round)

    }

}