package com.example.extending_view

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //lateinit var customDrawing: CustomDrawing2

    lateinit var c_d:CustomDrawing
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //customDrawing=CustomDrawing2(this)
        //setContentView(customDrawing)
        c_d=CustomDrawing(this)
        setContentView(c_d)
    }
}