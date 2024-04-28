package com.example.dynfragment3

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val fm:FragmentManager=supportFragmentManager
        val ft:FragmentTransaction=fm.beginTransaction()
        val click:Button=findViewById(R.id.button1)
        click.setOnClickListener{
            val f=BlankFragmentA()
            ft.replace(android.R.resources,f)
            ft.commit()
        }

    }
}