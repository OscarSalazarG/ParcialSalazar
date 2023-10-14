package com.example.parcialsalazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactActivity : AppCompatActivity() {
    var names = arrayOf(
        "Juan", "Maria", "José" ,
        "Miguel", "Pedro", "Manolo", "Julieta"
    )
    var numbersC = arrayOf(
        "32134342", "3423455234", "324324324" ,
        "35325325", "325355235", "1233435", "4342323"
    )
    var FechaC = arrayOf(
        "23/06/2000", "19/08/2000", "23/02/2000" ,
        "24/05/2000", "12/07/2000", "23/06/2000", "23/06/2000"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contacts: RecyclerView = findViewById(R.id.rvContacts)
        val adaptador: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, names)

        contacts.layoutManager = LinearLayoutManager(requireContext())




    }
}