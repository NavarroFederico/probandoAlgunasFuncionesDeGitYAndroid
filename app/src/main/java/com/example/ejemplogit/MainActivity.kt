package com.example.ejemplogit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("estoy probando algunas funciones de android con git")
        println("antes de pasar de rama hice un commit")

    }
}