package com.example.parcialsalazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EdadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edad)

        val btnCalcE: Button = findViewById(R.id.btnCalcE)
        val tvResultE = findViewById<TextView>(R.id.tvResultEdad)
        val Fecha: EditText = findViewById(R.id.edtFecha)

        btnCalcE.setOnClickListener {
            val totalD = this.calc(Fecha.text.toString());
            tvResultE.text = "Su edad en días es: $totalD"
        }


    }

    private fun calc(value1: String): Int {
        //Código para calcular los días de acuerdo a la fecha

        return 900
    }
}