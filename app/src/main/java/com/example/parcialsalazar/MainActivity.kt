package com.example.parcialsalazar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnLog: Button = findViewById(R.id.btnLogin)
        val email: EditText =findViewById(R.id.edtUser)
        val password: EditText =findViewById(R.id.edtPass)

        btnLog.setOnClickListener{
            this.login(email.text.toString(),password.text.toString());
        }


    }
    private fun login(value1: String,value2: String)
    {
        if (value1=="admin@multiapp.com" && value2 =="multiapp123"){
            val intent = android.content.Intent(this, com.example.parcialsalazar.MenuActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(
                applicationContext, "Credenciales inválidas", Toast.LENGTH_SHORT
            ).show()
        }

    }
}