package com.example.exerciciodelogica1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        val listItem = listOf("Primeiro item", "Segundo Item", "Terceiro item", "Quarto item")
        var position = 0

        val textView = findViewById<TextView>(R.id.editTextTextPersonName)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if (position < listItem.size) {
                textView.text = listItem[position]
                position = (position + 1) % listItem.size


            }
        }
    }
}


