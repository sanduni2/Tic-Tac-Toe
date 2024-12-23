package com.example.tictac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<View>(R.id.logo)
        btn.setOnClickListener(){
            val inten = Intent(this, MainActivity2::class.java)
            startActivity(inten)
        }
    }
}