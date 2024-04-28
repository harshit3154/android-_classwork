package com.example.dynamic_fragment2

import OnDataListner
import android.annotation.SuppressLint
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.example.dynamic_fragment2.R.id.edtTxt

class fragment1 : Fragment() {
    lateinit var edtText: EditText
    lateinit var msg: String
    lateinit var comm: OnDataListner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_fragment1, container, false).also {
            edtText = v.findViewById(edtTxt)


            edtText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    TODO("Not yet implemented")
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    TODO("Not yet implemented")
                }

                override fun afterTextChanged(s: Editable?) {
                    comm.communicate(edtText.text.toString())
                }
            })
        }
        return v

    }

}