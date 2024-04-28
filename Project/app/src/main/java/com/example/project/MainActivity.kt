package com.example.project

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    lateinit var signup:Button
    lateinit var s_p:SharedPreferences
    val file_name="MyPref.txt"
    val name_key="NAME"
    val email_key="EMAIL"
    var selected_options_index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val first=First_Screen()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main,first)
    }
    fun save(name:String,email:String){
        s_p=getSharedPreferences(file_name, MODE_PRIVATE)
        val editor=s_p.edit()
        editor.putString(name_key,name)
        editor.putString(email_key,email)
        editor.apply()
    }

    fun show(){
        s_p=getSharedPreferences(file_name, MODE_PRIVATE)
        val editor=s_p.edit()
        var n=s_p.getString(name_key,"").toString()
        var e=s_p.getString(email_key,"").toString()
        Toast.makeText(applicationContext,"${n} ${e}",Toast.LENGTH_SHORT).show()
    }

    fun delete_info(){
        s_p=getSharedPreferences(file_name, MODE_PRIVATE)
        val editor=s_p.edit()
        editor.remove(name_key)
        editor.remove(email_key)
        editor.apply()
    }
}