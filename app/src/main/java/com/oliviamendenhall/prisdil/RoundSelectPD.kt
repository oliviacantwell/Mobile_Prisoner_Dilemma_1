package com.oliviamendenhall.prisdil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker

class RoundSelectPD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_round_select_pd)

        var numberPicker = findViewById<NumberPicker>(R.id.numberPicker)

        numberPicker.maxValue = 15
        numberPicker.minValue = 1


        var playButton = findViewById<Button>(R.id.playButton)
        playButton.setOnClickListener {

            var picked = numberPicker.value

            Intent(this, MainActivity::class.java).also {
                it.putExtra("EXTRA_PICKED", picked)
                startActivity(it)
            }
        }
    }
}