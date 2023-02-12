package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btdwnload = findViewById<Button>(R.id.btndownload)
        val btdupload = findViewById<Button>(R.id.btnupload)

        btdupload.setOnClickListener{
             Toast.makeText(applicationContext, "loaddingn", Toast.LENGTH_SHORT).show()
        }
    }
}