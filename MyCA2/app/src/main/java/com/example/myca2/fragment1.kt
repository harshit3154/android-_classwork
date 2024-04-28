package com.example.myca2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment() , View.OnClickListener {
    // TODO: Rename and change types of parameters
    private lateinit var editTextop: EditText
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fragment1, container, false)
        editTextop = view.findViewById(R.id.op)
        editText1 = view.findViewById(R.id.ip1)
        editText2 = view.findViewById(R.id.ip2)
        button1 = view.findViewById(R.id.plus)
        button2 = view.findViewById(R.id.sub)
        button3 = view.findViewById(R.id.mul)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)

        return view
    }
    override fun onClick(v:View?) {

        when(v?.id){
            R.id.plus-> {
                var inp1=editText1.text.toString()
                var inp2=editText2.text.toString()
                var result=inp1.toInt()+inp2.toInt()
                editTextop.setText(result.toString())
            }
            R.id.mul-> {
                var inp1=editText1.text.toString()
                var inp2=editText2.text.toString()
                var result=inp1.toInt()*inp2.toInt()
                editTextop.setText(result.toString())
            }
            R.id.sub-> {
                var inp1=editText1.text.toString()
                var inp2=editText2.text.toString()
                var result=inp1.toInt()-inp2.toInt()
                editTextop.setText(result.toString())
            }
    }
}


}