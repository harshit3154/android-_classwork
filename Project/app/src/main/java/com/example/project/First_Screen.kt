package com.example.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class First_Screen : Fragment() {

    lateinit var view1:View
    lateinit var signup:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view1=inflater.inflate(R.layout.fragment_first__screen, container, false)
        signup=view1.findViewById(R.id.signup)
        signup.setOnClickListener(){
            var f1=First_Screen()
            fragmentManager?.beginTransaction()
                ?.replace(R.id.main,f1)
                ?.commit()
        }
        return view1
    }
}