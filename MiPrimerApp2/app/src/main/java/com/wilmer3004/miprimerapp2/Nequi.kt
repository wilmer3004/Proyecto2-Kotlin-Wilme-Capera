package com.wilmer3004.miprimerapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class Nequi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nequi)

        val saldo = Saldo
        val botonSalir = findViewById<Button>(R.id.buttonSalirNequi)
        val botonConsignar = findViewById<Button>(R.id.buttonConsignar)
        val botonRetirar = findViewById<Button>(R.id.buttonRetirar)
        val botonEnviar = findViewById<Button>(R.id.buttonEnviar)

        val textSaldo = findViewById<TextView>(R.id.textViewSaldo)


        textSaldo.setText("Saldo: $${saldo.consultarSaldo()}")

        //Salir Nequi
        botonSalir.setOnClickListener{
            finishAffinity()
            exitProcess(0)
        }

        //Consignar
        botonConsignar.setOnClickListener{
            val intentoConsignar = Intent(this,ConsignarNequi::class.java)
            startActivity(intentoConsignar)
        }

        //Retirar
        botonRetirar.setOnClickListener{
            val intentoRetirar = Intent(this,RetirarNequi::class.java)
            startActivity(intentoRetirar)
        }

        //Enviar
        botonEnviar.setOnClickListener{
            val intentoEnviar = Intent(this,EnviarNequi::class.java)
            startActivity(intentoEnviar)
        }

    }
}