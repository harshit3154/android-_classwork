package com.example.project

import android.content.Intent
import android.content.SharedPreferences
import android.health.connect.datatypes.units.Length
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation

class SignUp : Fragment() {

    lateinit var view1:View
    lateinit var name:TextView
    lateinit var email:TextView
    lateinit var button:Button
    lateinit var f:SignUp
    lateinit var h:HomePage
    lateinit var main:MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view1=inflater.inflate(R.layout.fragment_sign_up, container, false)
        name=view1.findViewById(R.id.name)
        email=view1.findViewById(R.id.email)
        button=view1.findViewById(R.id.submit)
        button.setOnClickListener(){
            if(name.text.isEmpty() && email.text.isEmpty()) {
                Toast.makeText(context, "Empty username & email can't create account", Toast.LENGTH_SHORT).show()
            }else if(name.text.isEmpty()){
                Toast.makeText(context,"Empty user name",Toast.LENGTH_SHORT).show()
            }else if(email.text.isEmpty()){
                Toast.makeText(context,"Empty email field",Toast.LENGTH_SHORT).show()
            }
            else{
                main=activity as MainActivity
                main.save(name.text.toString(),email.text.toString())
                main.show()
                //switchToMainActivity()
                val fra=HomePage()
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.main,fra)
                    ?.commit()
            }
        }
        return view1
    }
    private fun switchToMainActivity() {
        val intent = Intent(activity, MainActivity::class.java)
        startActivity(intent)
        // You can choose not to finish the current activity if you want to keep it in the back stack
    }
}