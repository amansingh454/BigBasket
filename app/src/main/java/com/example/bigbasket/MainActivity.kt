package com.example.bigbasket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    var items = arrayOf<String?>("item1", "item2", "item3", "item4")

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)

        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(
                this,
                android.R.layout.simple_spinner_item,
                items)
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner?.adapter=ad
        spinner?.onItemSelectedListener =this

        ///data preparation

        val foodPacket:MutableList<FoodPacket> = mutableListOf()

        foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
                50,1234,1234,2, R.drawable.food_packet,"superb"))
        foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
                50,1234,1234,2, R.drawable.food_packet,"superb"))
        foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
                50,1234,1234,2, R.drawable.food_packet,"superb"))
        foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
                50,1234,1234,2, R.drawable.food_packet,"superb"))

        foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
                50,1234,1234,2, R.drawable.food_packet,"superb"))
        foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
                50,1234,1234,2, R.drawable.food_packet,"superb"))

        foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
                50,1234,1234,2, R.drawable.food_packet,"superb"))

        recyclerView=findViewById(R.id.recview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=Adapter(foodPacket)






    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, items[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

}









