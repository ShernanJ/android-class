package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var rolled = 0;
    var diceImage : ImageView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button);
        rollButton.setOnClickListener { rollDice() };

        diceImage = findViewById(R.id.imageView);

    }

    private fun rollDice() {
//        var randomInt = Random.nextInt(6) + 1;
        var randomInt = (1..6).random();
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        val resultText: TextView = findViewById(R.id.results);
        val totalRolled: TextView = findViewById(R.id.totalRolled);
        rolled++;
        totalRolled.text = "Total Rolled: $rolled";
        resultText.text = randomInt.toString();

        val image = when (randomInt) {
            1->R.drawable.die_1;
            2->R.drawable.die_2;
            3->R.drawable.die_3;
            4->R.drawable.die_4;
            5->R.drawable.die_5;
            6->R.drawable.die_6;
            else -> {
                Toast.makeText(this, "Invalid face number!", Toast.LENGTH_SHORT)
            }
        }
        diceImage?.setImageResource(image as Int);
    }
}