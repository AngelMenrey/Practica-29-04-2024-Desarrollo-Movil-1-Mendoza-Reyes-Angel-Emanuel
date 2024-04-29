package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import org.w3c.dom.Text

class activity_accesorio : AppCompatActivity() {
    private lateinit var descripcion:TextView
    private lateinit var imagen:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accesorio)
        descripcion=findViewById(R.id.txtDescripcion)
        imagen=findViewById(R.id.imgAccesorioDetalle)
        val infoRecibida=intent.extras
        val detalle:String?
        val costo:String?
        val num:Int?
        if(infoRecibida != null){
            detalle=infoRecibida.getString("detalle")
            costo=infoRecibida.getString("costo")
            num=infoRecibida.getInt("numAccesorio")
            descripcion.text="descripcion del producto:\n${detalle}\nCosto: ${costo}"
            when(num){
                1 -> imagen.setImageResource(R.drawable.accesorio1)
                2 -> imagen.setImageResource(R.drawable.accesorio2)
                3 -> imagen.setImageResource(R.drawable.accesorio3)
                4 -> imagen.setImageResource(R.drawable.accesorio4)
                5 -> imagen.setImageResource(R.drawable.accesorio5)
                6 -> imagen.setImageResource(R.drawable.accesorio6)
                7 -> imagen.setImageResource(R.drawable.accesorio7)
                8 -> imagen.setImageResource(R.drawable.accesorio8)
                9 -> imagen.setImageResource(R.drawable.accesorio9)
            }
        }
    }
}