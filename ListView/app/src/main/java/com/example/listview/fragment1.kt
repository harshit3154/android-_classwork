package com.example.listview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class fragment1 : Fragment() {
    lateinit var list_view:ListView
    lateinit var view1:View
    lateinit var txtfrag:fragment2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view1=inflater.inflate(R.layout.fragment_fragment1, container, false)
        var list= arrayOf(
            "Burger",
            "Pizza",
            "Somosa",
            "Kurkura",
            "Chocolate",
            "Biscuit",
            "Ice-creame",
            "Pine-apple"
        )
        list_view=view1.findViewById(R.id.listView)
        val adapter=ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,list)
        list_view.adapter=adapter

        list_view.setOnItemClickListener(){
                adapterView, view, i,l->
            txtfrag=parentFragmentManager.findFragmentById(R.id.f2) as fragment2
            txtfrag.changeTxt(list[i])
            list_view.setSelector(androidx.appcompat.R.color.abc_background_cache_hint_selector_material_dark)
        }

        return view1
    }
}