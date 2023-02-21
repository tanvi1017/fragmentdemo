package com.tanvi.fragmentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SsecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_ssecond)
       val position = intent.getIntExtra("position",0)

        val fragmentManager:FragmentManager=supportFragmentManager
        val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
        val ssecondFragment =SsecondFragment()

        val bundle = Bundle()
        bundle.putInt("position",position)
        ssecondFragment.arguments = bundle
        fragmentTransaction.add(R.id.frame,ssecondFragment)
        fragmentTransaction.commit()

    }
}