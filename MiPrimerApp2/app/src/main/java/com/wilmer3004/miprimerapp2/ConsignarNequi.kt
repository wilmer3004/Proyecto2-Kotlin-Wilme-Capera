package com.wilmer3004.miprimerapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.security.interfaces.EdECKey

class ConsignarNequi : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consignar_nequi)

        val botonConsignar = findViewById<Button>(R.id.buttonConsignarValor)
        val valor = findViewById<EditText>(R.id.editTextNumberConsignar)
        val saldo = Saldo

        botonConsignar.setOnClickListener{
            if(valor.text.toString() !=""){
            var valorCapturado = valor.text.toString().toDouble()
            saldo.consignarSaldo(valorCapturado)
            val intentoConsignar = Intent(this, Nequi::class.java)
            startActivity(intentoConsignar)
            }else{
                Toast.makeText(this,"No ingreso ningun dato",Toast.LENGTH_LONG).show()
                val intentoConsignar = Intent(this, Nequi::class.java)
                startActivity(intentoConsignar)
            }
        }




    }
}