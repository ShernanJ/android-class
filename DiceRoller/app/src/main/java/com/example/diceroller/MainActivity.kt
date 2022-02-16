package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var rolled = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button);
        rollButton.setOnClickListener { rollDice() };

    }

    private fun rollDice() {
        var randomInt = Random.nextInt(6) + 1;
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        val resultText: TextView = findViewById(R.id.results);
        val totalRolled: TextView = findViewById(R.id.totalRolled);
        rolled++;
        totalRolled.text = "Total Rolled: $rolled";
        resultText.text = randomInt.toString();
    }
}