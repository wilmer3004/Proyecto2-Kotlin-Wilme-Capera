package com.wilmer3004.miprimerapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)


        val numero1 = findViewById<EditText>(R.id.editTextNumberNumero1)
        val numero2 = findViewById<EditText>(R.id.editTextNumberNumero2)
        val textresultado = findViewById<TextView>(R.id.textViewResultado)
        val botonSumar = findViewById<Button>(R.id.buttonSumar)
        val botonRestar = findViewById<Button>(R.id.buttonRestar)
        val botonMultiplicar = findViewById<Button>(R.id.buttonMultiplicar)
        val botonDividir = findViewById<Button>(R.id.buttonDividir)


        botonSumar.setOnClickListener{
            var resultado = numero1.text.toString().toDouble() + numero2.text.toString().toDouble()
            textresultado.setText("Resultado: ${resultado.toString()}")
        }
        botonRestar.setOnClickListener{
            var resultado = numero1.text.toString().toDouble() - numero2.text.toString().toDouble()
            textresultado.setText("Resultado: ${resultado.toString()}")
        }
        botonMultiplicar.setOnClickListener{
            var resultado = numero1.text.toString().toDouble() * numero2.text.toString().toDouble()
            textresultado.setText("Resultado: ${resultado.toString()}")
        }
        botonDividir.setOnClickListener{
            var resultado = numero1.text.toString().toDouble() / numero2.text.toString().toDouble()
            textresultado.setText("Resultado: ${resultado.toString()}")
        }
        val botonAtras = findViewById<Button>(R.id.buttonAtras)

        botonAtras.setOnClickListener{
            val intentoAtras = Intent(this,Dashboard::class.java)
            startActivity(intentoAtras)
        }
    }
}