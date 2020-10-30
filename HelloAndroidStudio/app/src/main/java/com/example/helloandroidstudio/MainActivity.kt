package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main() {
        printGreeting("Hello, Android World")
    }
    //First modification: This is a function
    //Pls track changes

    //Write a function that takes a string as an argument, and returns “Hello, string”
    fun printGreeting(personName: String) {
        println ("Hello, Android World")
    }

}