package com.example.gangelf.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.gangelf.coderswag.Adapters.CategoryRecycleAdapter
import com.example.gangelf.coderswag.R
import com.example.gangelf.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Simple Adapter
    //lateinit var adapter : ArrayAdapter<Category>
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//      //Simple Adapter
//        adapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1,
//                DataService.categories)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categorieListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categorieListView.layoutManager = layoutManager
        categorieListView.setHasFixedSize(true)
    }
}
