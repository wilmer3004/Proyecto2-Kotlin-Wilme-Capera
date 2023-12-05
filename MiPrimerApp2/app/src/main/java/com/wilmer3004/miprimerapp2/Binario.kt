package com.wilmer3004.miprimerapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Binario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binario)

        val numeroBinario = findViewById<EditText>(R.id.editTextNumberBinario)
        val textresultado = findViewById<TextView>(R.id.textViewResultadoDecimal)
        val botonConvertir = findViewById<Button>(R.id.buttonDecimal)

        botonConvertir.setOnClickListener{
            var resultado = numeroBinario.text.toString().matches("[01]+".toRegex())
            if (resultado){
                var resultado1 = numeroBinario.text.toString().toInt(2)
            textresultado.setText("Binario a Decimal: ${resultado1.toString()}")
            }else{
                Toast.makeText(this,"¡El numero ingresasdo no es binario!", Toast.LENGTH_LONG).show()
            }
        }

    }
}