package com.wilmer3004.miprimerapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuarios = listOf(
            mapOf("UserName" to "Wilmer", "password" to "wilmer1234"),
            mapOf("UserName" to "Sandra", "password" to "sandra1234"),
            mapOf("UserName" to "Andres", "password" to "andres1234")
        )
        val nombre = findViewById<EditText>(R.id.editTextTextNombre)
        val password = findViewById<EditText>(R.id.editTextTextpassword)
        val buttonSaludar = findViewById<Button>(R.id.buttonSaludar)

        buttonSaludar.setOnClickListener{
            var nombreRecogido = nombre.text.toString()
            var passwordRecogida = password.text.toString()

            try {
                var usuarioEncontrado = false

                for (usuario in usuarios) {
                    val userName = usuario["UserName"]
                    val password1 = usuario["password"]

                    if (userName.equals(nombreRecogido, ignoreCase = true) && password1.equals(passwordRecogida, ignoreCase = true)) {
                        usuarioEncontrado = true
                        break
                    }
                }

                if (usuarioEncontrado) {
                    Toast.makeText(this, "¡Bienvenido $nombreRecogido a mi APP!", Toast.LENGTH_LONG).show()
                    val intento = Intent(this, Dashboard::class.java)
                    startActivity(intento)
                } else {
                    Toast.makeText(this, "El usuario o la contraseña son incorrectos o no se han encontrado registrados en el sistema.", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Error: ${e.message}", Toast.LENGTH_LONG).show()
                e.printStackTrace()
            }
        }

    }
}