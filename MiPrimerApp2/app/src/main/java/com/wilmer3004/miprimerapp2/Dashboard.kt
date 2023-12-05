package com.wilmer3004.miprimerapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wilmer3004.miprimerapp2.R
import kotlin.system.exitProcess

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        val botonCalcuculadora = findViewById<Button>(R.id.buttonCalculadora)
        val botonNequi = findViewById<Button>(R.id.buttonNequi)
        val botonSalir = findViewById<Button>(R.id.buttonSalir)
        val botonLibre = findViewById<Button>(R.id.buttonLibre)

        botonNequi.setOnClickListener{
            val intentoNequi = Intent(this,LoginNequi::class.java)
            startActivity(intentoNequi)
        }

        botonCalcuculadora.setOnClickListener{
            val intentoCalculadora = Intent(this,Calculadora::class.java)
            startActivity(intentoCalculadora)
        }

        botonSalir.setOnClickListener{
            finishAffinity()
            exitProcess(0)
        }


        botonLibre.setOnClickListener{
            val intentoLibre = Intent(this,Binario::class.java)
            startActivity(intentoLibre)
        }


    }

}