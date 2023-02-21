package com.tanvi.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val fragmentManager:FragmentManager =supportFragmentManager
        val fragmentTransaction :FragmentTransaction = fragmentManager.beginTransaction()
        val myListFragment =MyListFragment()
        fragmentTransaction.add(R.id.frame,myListFragment)
        fragmentTransaction.commit()

    }
}