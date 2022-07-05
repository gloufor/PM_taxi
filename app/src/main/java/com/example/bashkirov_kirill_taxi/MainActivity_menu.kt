package com.example.bashkirov_kirill_taxi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val backspace : ImageView = findViewById(R.id.ic_vector_menu)
        backspace.setOnClickListener {
            val intent = Intent(this@MainActivity_menu, MainActivity_start_screen::class.java)
            startActivity(intent)

            val backspace : Button = findViewById(R.id.history_menu)
            backspace.setOnClickListener {
                val intent = Intent(this@MainActivity_menu, MainActivity_history::class.java)
                startActivity(intent)

                val backspace : Button = findViewById(R.id.settings_menu)
                backspace.setOnClickListener {
                    val intent = Intent(this@MainActivity_menu, MainActivity_settings::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}