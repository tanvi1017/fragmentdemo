package com.tanvi.fragmentdemo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

class MyListFragment : ListFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_list2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrayAdapter =
            activity?.let { ArrayAdapter.createFromResource(it, R.array.cities,android.R.layout.simple_list_item_1) }
        listAdapter=arrayAdapter
        listView.setOnItemClickListener { adapterView, view, positon, l ->
            val intent=Intent(activity,SsecondActivity::class.java)
            intent.putExtra("position",positon)
            startActivity(intent)

        }
    }

}



