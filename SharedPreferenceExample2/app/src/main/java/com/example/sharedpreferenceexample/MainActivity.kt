package com.example.sharedpreferenceexample

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var sharedpreferences: SharedPreferences
    lateinit var name: TextView
    lateinit var email:TextView
    val mypreference="mypref"
    val Name="namekey"
    val Email="emailkey"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.etName)
        email = findViewById(R.id.etEmail)
        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE)
        name.text = sharedpreferences.getString(Name, "")
        email.text = sharedpreferences.getString(Email, "")

        fun save(view: View?) {
            val n: String = name.text.toString()
            val e: String = email.text.toString()
            val editor: SharedPreferences.Editor= sharedpreferences.edit()
            editor.putString(Name, n)
            editor.putString(Email, e)
            editor.apply()
        }

        fun clear(view: View?) {
            name.text = ""
            email.text = ""
        }

        fun get(view: View) {
            sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE)
            name.text = sharedpreferences.getString(Name, "")
            email.text = sharedpreferences.getString(Email, "")
        }
        val button:Button=findViewById(R.id.btnSave)
        button.setOnClickListener(){
            save(it)
        }

        val buttonClear:Button=findViewById(R.id.btnClear)
        buttonClear.setOnClickListener(){
            clear(it)
        }

        val buttonRet:Button=findViewById(R.id.btnRet)
        buttonRet.setOnClickListener(){
            //get(it)
            if(name.text!=null){
                save(it)
                clear(it)
                //setContentView(R.layout.login)
            }
            get(it)
        }
        val button1:Button=findViewById(R.id.logout)
        button1.setOnClickListener(){
            setContentView(R.layout.activity_main)
            clear(it)
        }
    }
}