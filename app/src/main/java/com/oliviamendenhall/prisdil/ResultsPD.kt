package com.oliviamendenhall.prisdil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultsPD : AppCompatActivity() {

    var opponentScore = 0
    var playerScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_pd)

        opponentScore = intent.getIntExtra("EXTRA_PLAYERSCORE", 0)
        playerScore = intent.getIntExtra("EXTRA_OPPSCORE", 0)


            var resultsText = findViewById<TextView>(R.id.results)

            when {
                opponentScore > playerScore -> resultsText.text = "You lose..."
                opponentScore < playerScore -> resultsText.text = "You win!"
                opponentScore == playerScore ->resultsText.text = "Its a tie!"
                }

    }

}