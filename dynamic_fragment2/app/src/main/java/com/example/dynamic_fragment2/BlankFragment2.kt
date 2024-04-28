package com.example.dynamic_fragment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BlankFragment2 : Fragment() {

    lateinit var txtData:TextView
    var msge:String=""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View?{
       val v:View=inflater.inflate(R.layout.fragment_blank2,container,false)
       txtData =v.findViewById(R.id.txt2)
        txtData.setText(msge)
        return v
    }
    fun dispalyrepalceData(message:String){
        msge=message
    }
}