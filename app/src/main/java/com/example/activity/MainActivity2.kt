package com.example.activity

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private val TAG = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(TAG, "onCreate - MainActivity2 - Arthur")

        val textDados: TextView = findViewById(R.id.textDados)

        val nome = intent.getStringExtra("NOME")
        val email = intent.getStringExtra("EMAIL")

        textDados.text = "Nome: $nome\nE-mail: $email"
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - MainActivity2 - Arthur")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume - MainActivity2 - Arthur")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause - MainActivity2 - Arthur")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - MainActivity2 - Arthur")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - MainActivity2 - Arthur")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart - MainActivity2 - Arthur")
    }
}