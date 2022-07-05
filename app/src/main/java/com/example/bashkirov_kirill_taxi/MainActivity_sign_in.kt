package com.example.bashkirov_kirill_taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity_sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sign_in)

        val backspace : TextView = findViewById(R.id.txt3)
        backspace.setOnClickListener {
            val intent = Intent(this@MainActivity_sign_in, MainActivity_registration::class.java)
            startActivity(intent)
        }
    }
}