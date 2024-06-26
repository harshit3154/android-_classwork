package com.example.fragment_list_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BlankFragment2 : Fragment() {

    lateinit var view2:View
    lateinit var text:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view2=inflater.inflate(R.layout.fragment_blank2, container, false)
        text=view2.findViewById(R.id.txt)
        return view2
    }

    fun changeText(msg:String){
        text.text=msg
    }
}