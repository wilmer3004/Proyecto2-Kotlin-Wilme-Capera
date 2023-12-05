package com.wilmer3004.miprimerapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RetirarNequi : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retirar_nequi)

        val saldo = Saldo
        val botonRetirar = findViewById<Button>(R.id.buttonRetiroValor2)
        val textRandom = findViewById<TextView>(R.id.textViewCodigoRetiro)
        val botonAtras = findViewById<Button>(R.id.buttonAtras1)
        botonRetirar.setOnClickListener{
            val numeroRandom = saldo.retirarSaldo()
            textRandom.setText("$numeroRandom")
        }
        botonAtras.setOnClickListener{
            val intentoAtras = Intent(this,Nequi::class.java)
            startActivity(intentoAtras)
        }
    }
}