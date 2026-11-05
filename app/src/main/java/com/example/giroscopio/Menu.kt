package com.example.giroscopio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        findViewById<Button>(R.id.btmcalculadora).setOnClickListener {
            val intent = Intent(this, MainCalculadora::class.java)
            startActivity(intent)
        }


        findViewById<Button>(R.id.btmcontador).setOnClickListener {
            val intent = Intent(this, MainContador::class.java)
            startActivity(intent)
        }
        }
    }
}