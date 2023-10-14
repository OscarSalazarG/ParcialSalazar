package com.example.parcialsalazar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnTKambio: Button = findViewById(R.id.btnTK)
        val btnContact: Button = findViewById(R.id.btnContactos)
        val btnEdad: Button = findViewById(R.id.btnEdad)

        btnTKambio.setOnClickListener{
            this.changeTK();
        }
        btnEdad.setOnClickListener{
            this.changeEdad();
        }
        btnContact.setOnClickListener{
            this.changeContact();
        }


    }

    private fun changeTK()
    {
        val intent = Intent(this,KambioActivity::class.java)
        startActivity(intent)
    }
    private fun changeEdad()
    {
        val intent = Intent(this,EdadActivity::class.java)
        startActivity(intent)
    }
    private fun changeContact()
    {
        val intent = Intent(this,ContactActivity::class.java)
        startActivity(intent)
    }
}