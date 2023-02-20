package com.tanvi.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.ListFragment


class MyDialogFragment : DialogFragment() {
    lateinit var tvFragment: TextView
    lateinit var etName:EditText
    lateinit var etAge:EditText
    lateinit var cancel:Button
    lateinit var ok:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val view:View = inflater.inflate(R.layout.fragment_my_list,container,false)
        etName= view.findViewById(R.id.etName)
        etAge=view.findViewById(R.id.etAge)
        cancel=view.findViewById(R.id.btCancel)
        ok=view.findViewById(R.id.btOk)
        //dialog!!.window!!.setBackgroundDrawable(android.R.color.transparent)
        cancel.setOnClickListener {
            dialog!!.dismiss()

        }
        ok.setOnClickListener {
            val userName:String = etName.text.toString()
            val userAge:Int = etAge.text.toString().toInt()
            val mainActivity:MainActivity= activity as MainActivity
            mainActivity.getUserData(userName,userAge)
            dialog!!.dismiss()
        }
        return view

    }

}


