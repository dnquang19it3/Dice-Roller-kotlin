package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var resultImage:ImageView
    lateinit var resultImage2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btn_click)
        resultImage = findViewById(R.id.result_image)
        resultImage2 = findViewById(R.id.result_image_2)
        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice() {
        resultImage.setImageResource(getRandomDiceImage())
        resultImage2.setImageResource(getRandomDiceImage())
    }
    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random();
        return when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else ->  R.drawable.dice_6
        }
    }
}