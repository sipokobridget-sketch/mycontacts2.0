package com.example.mycontacts20

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName="bridget"
        val lastName="sipoko"
        var address="84 on main complex"
        var isMale=false
        val dayOfBirth=21
        val monthOfBirth="march"
        val yearOfBirth=2007
        Log.d("hi",firstName +" "+ lastName +"you live in"+ address + "it is" +isMale+ "that you are male"+dayOfBirth+" "+monthOfBirth+" "+yearOfBirth)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}