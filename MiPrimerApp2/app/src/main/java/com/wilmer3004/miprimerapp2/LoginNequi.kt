package com.wilmer3004.miprimerapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.Exception

class   LoginNequi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_nequi)



        val usuarios = listOf(
            mapOf("UserName" to "Wilmer","phone" to "3182441234", "password" to "wilmer1234"),
            mapOf("UserName" to "Sandra","phone" to "3122461234", "password" to "sandra1234"),
            mapOf("UserName" to "Andres","phone" to "3132421234", "password" to "andres1234")
        )
        val numeroTelefono = findViewById<EditText>(R.id.editTextTextNumeroTelefono)
        val password = findViewById<EditText>(R.id.editTextTextpassword2)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener{
            var numeroRecogido = numeroTelefono.text.toString().toString()
            var passwordRecogida = password.text.toString()
            var nombreUsuario = ""
            try {
                var usuarioEncontrado = false

                for (usuario in usuarios) {
                    val userPhone = usuario["phone"]
                    val password1 = usuario["password"]

                    if (password1 != null) {
                        if ( userPhone == numeroRecogido && password1.equals(passwordRecogida, ignoreCase = true)) {
                            usuarioEncontrado = true
                            nombreUsuario = usuario["UserName"].toString()
                            break
                        }
                    }
                }

                if (usuarioEncontrado) {
                    Toast.makeText(this, "¡Bienvenido $nombreUsuario a mi APP!", Toast.LENGTH_LONG).show()
                    val intento = Intent(this,Nequi::class.java)
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