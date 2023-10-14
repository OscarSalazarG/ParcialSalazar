package com.example.parcialsalazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class KambioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kambio)

        val btnCalc: Button = findViewById(R.id.btnCalcK)
        val tvTotal =findViewById<TextView>(R.id.tvResult)
        val tvBill100 =findViewById<TextView>(R.id.tvBill100)
        val tvBill50 =findViewById<TextView>(R.id.tvBill50)
        val tvBill20 =findViewById<TextView>(R.id.tvBill20)
        val tipo: EditText =findViewById(R.id.edtTipo)
        val cantidad: EditText =findViewById(R.id.edtCant)

        btnCalc.setOnClickListener{
            val total = this.calc(tipo.text.toString(),cantidad.text.toString());
            val Bill100 = total/100
            val Bill50=(total-Bill100*100)/50
            val Bill20=(total-Bill100*100-Bill50*50)/20


            tvTotal.text = "El resultado en soles es de: $total"
            tvBill100.text="Billetes de 100:$Bill100"
            tvBill50.text="Billetes de 100:$Bill50"
            tvBill20.text="Billetes de 100:$Bill20"
        }


    }
    private fun calc(value1: String,value2: String): Int {
        var tipoK: Int = value1.toInt()
        var cant: Int = value2.toInt()
        var total: Int = tipoK*cant

        return total
    }
}