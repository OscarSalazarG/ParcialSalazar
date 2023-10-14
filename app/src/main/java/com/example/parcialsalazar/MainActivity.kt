package com.example.parcialsalazar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnLog: Button = findViewById(R.id.btnLogin)

        btnLog.setOnClickListener{
            this.login();
        }


    }
    private fun login()
    {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}