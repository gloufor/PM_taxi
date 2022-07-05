package com.example.bashkirov_kirill_taxi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity_start_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start_screen)

        val backspace : Button = findViewById(R.id.button1)
        backspace.setOnClickListener {
            val intent = Intent(this@MainActivity_start_screen, MainActivity_menu::class.java)
            startActivity(intent)
        }
    }
}