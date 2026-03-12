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
        val currentYear=2026
        val age=currentYear-yearOfBirth

        //1. calculate years until 100
        val yearsUntil100=100-age

        //2.age in month
        val ageInMonths=age*12

        //3.age in days (excluding leap years)
        val ageInDays=age*365

        //4. Remoinder when divided by 5
        val ageRemainder=age%5

        //printing the calculated values to lagcat
        Log.d("calculation","years until 100: $yearsUntil100")
        Log.d("calculation","age in months: $ageInMonths")
        Log.d("calculation","age in days: $ageInDays")
        Log.d("calculation","Remainder when divided by 5: $ageRemainder")
        
        Log.d("hi",firstName +" "+ lastName +"you live in"+ address + "it is" +isMale+ "that you are male"+dayOfBirth+" "+monthOfBirth+" "+yearOfBirth)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}