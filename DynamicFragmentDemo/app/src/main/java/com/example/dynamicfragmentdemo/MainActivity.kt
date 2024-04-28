package com.example.dynamicfragmentdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    lateinit var fm:FragmentManager
    lateinit var ft:FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        fm=supportFragmentManager
        ft=fm.beginTransaction()
        val orientation=resources.configuration.orientation
        if(orientation==1){
            val f1=fragment1()
            ft.replace(android.R.id.content,f1)
        }else{
            val f2=fragment2()
            ft.replace(android.R.id.content,f2)
        }
        ft.commit()
    }
}