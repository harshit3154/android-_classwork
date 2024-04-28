package com.example.dynamic_fragment2

import OnDataListner
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity:AppCompatActivity(),OnDataListner{
    var sendData=""
    var sendData2=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fm:FragmentManager=supportFragmentManager
        var ft:FragmentTransaction=fm.beginTransaction()
        if(savedInstanceState!=null){
            sendData2=savedInstanceState.getString("K1")!!
        }
        val displaymode=resources.configuration.orientation
        if(displaymode==1)
        {
            var f1=fragment1()
            ft.replace(android.R.id.content,f1)
        }else{
            val f2=BlankFragment2()
            ft.replace(android.R.id.content,f2)
            f2.dispalyrepalceData(sendData2)
        }
        ft.commit()
    }

    override fun communicate(msg: String) {
        sendData=msg
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("K1",sendData)
    }
}