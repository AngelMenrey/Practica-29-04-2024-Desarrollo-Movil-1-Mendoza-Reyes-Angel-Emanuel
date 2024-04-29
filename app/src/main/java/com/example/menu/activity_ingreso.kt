package com.example.menu

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication

class activity_ingreso : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)
        email=findViewById(R.id.edtCorreo)
        password=findViewById(R.id.edtContrasena)
    }

    fun onClick(view: View?){
        when(view?.id){
            R.id.btnAceptar ->aceptar()
            R.id.btnCancelar -> cancelar()
        }
    }

    private fun aceptar(){
        if(email.text.isNotEmpty() && email.text.isNotBlank() && password.text.isNotBlank() && password.text.isNotEmpty()){
            if (email.text.toString() == "usuario" && password.text.toString() == "12345"){
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"correo o contraseña incorrecta",Toast.LENGTH_SHORT).show()
            }
        }

    }
    private fun cancelar(){
        Toast.makeText(this,"Termina aplicacion",Toast.LENGTH_SHORT).show()
        finish()
    }
}