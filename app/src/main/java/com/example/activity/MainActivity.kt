package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editNome: EditText
    private lateinit var editEmail: EditText

    private val TAG = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate - MainActivity - Arthur")

        editNome = findViewById(R.id.editNome)
        editEmail = findViewById(R.id.editEmail)

        val buttonEnviar: Button = findViewById(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener {

            val nome = editNome.text.toString()
            val email = editEmail.text.toString()

            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("NOME", nome)
            intent.putExtra("EMAIL", email)

            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - MainActivity - Arthur")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume - MainActivity - Arthur")

        val prefs = getSharedPreferences("dadosFormulario", MODE_PRIVATE)

        editNome.setText(prefs.getString("nome", ""))
        editEmail.setText(prefs.getString("email", ""))

        Log.d(TAG, "Dados recuperados no onResume - MainActivity - Arthur")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause - MainActivity - Arthur")

        val prefs = getSharedPreferences("dadosFormulario", MODE_PRIVATE)

        prefs.edit()
            .putString("nome", editNome.text.toString())
            .putString("email", editEmail.text.toString())
            .apply()

        Log.d(TAG, "Dados salvos no onPause - MainActivity - Arthur")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - MainActivity - Arthur")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - MainActivity - Arthur")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart - MainActivity - Arthur")
    }
}