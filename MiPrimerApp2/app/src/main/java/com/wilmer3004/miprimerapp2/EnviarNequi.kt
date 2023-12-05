package com.wilmer3004.miprimerapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EnviarNequi : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar_nequi)

        val numeroTelefono = findViewById<EditText>(R.id.editTextNumberTelefono)
        val valor = findViewById<EditText>(R.id.editTextNumberEnviar)
        val buttonEnviar1 = findViewById<Button>(R.id.buttonEnviarValor)
        val saldo = Saldo




        buttonEnviar1.setOnClickListener{
            if(numeroTelefono.text.toString() != "" && valor.text.toString() !=""){
                var numeroCapturado = numeroTelefono.text.toString().toInt()
                var valorCapturado = valor.text.toString().toDouble()
                var enviarDinero = saldo.enviarDinero(valorCapturado)
                if (enviarDinero){
                    Toast.makeText(this,"El envio al numero $numeroCapturado con un valor de $$valorCapturado fue exitoso",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"No posee el saldo suficiente",Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this,"No ingreso ningun dato",Toast.LENGTH_LONG).show()
                val intentoNequi1 = Intent(this, Nequi::class.java)
                startActivity(intentoNequi1)
            }
            val intentoNequi1 = Intent(this, Nequi::class.java)
            startActivity(intentoNequi1)
        }

    }
}