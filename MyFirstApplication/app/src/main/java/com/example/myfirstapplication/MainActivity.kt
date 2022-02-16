package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun disableButton(v: View) {
        v.isEnabled = false
        println("Button was clicked and disabled")
    }

    fun buttonClicked(v: View) {
        var b = v as Button
        b.text = "Clicked"
        Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()

    }
}