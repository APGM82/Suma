package com.example.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var miBoton : Button = findViewById(R.id.botonAceptar)
        miBoton.setOnClickListener(){

            var micaja: TextView =findViewById(R.id.txtCaja)
            var mientrada:EditText=findViewById(R.id.editTextNumber)
            var mientrada2:EditText=findViewById(R.id.editTextNumber2)

            micaja.text=(Integer.parseInt(mientrada.text.toString())+Integer.parseInt(mientrada2.text.toString())).toString()

            Toast.makeText(this, "Sumando", Toast.LENGTH_LONG).show()

        }

    }
}