package com.example.jcplicores

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val log_button = findViewById<Button>(R.id.log_in)
        log_button.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }
}