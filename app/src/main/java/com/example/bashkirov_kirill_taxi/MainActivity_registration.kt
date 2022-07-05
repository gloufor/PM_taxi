package com.example.bashkirov_kirill_taxi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity_registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sign_up)

        val backspace : TextView = findViewById(R.id.have_account)
        backspace.setOnClickListener {
            val intent = Intent(this@MainActivity_registration, MainActivity_sign_in::class.java)
            startActivity(intent)
        }
    }
}