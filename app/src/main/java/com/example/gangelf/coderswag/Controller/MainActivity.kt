package com.example.gangelf.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.gangelf.coderswag.Adapters.CategoryAdapter
import com.example.gangelf.coderswag.Model.Category
import com.example.gangelf.coderswag.R
import com.example.gangelf.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Simple Adapter
//    lateinit var adapter : ArrayAdapter<Category>
    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Simple Adapter
//        adapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1,
//                DataService.categories)

        adapter = CategoryAdapter(this, DataService.categories)
        categorieListView.adapter = adapter

//            categorieListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
//        }
    }
}
