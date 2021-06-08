package com.example.bigbasket.Ui.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bigbasket.Ui.Adapter.Adapter
import com.example.bigbasket.R
import com.example.bigbasket.Ui.ViewModel.MainViewModel
import com.example.bigbasket.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinComponent



class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener ,KoinComponent{
    var items = arrayOf<String?>("item1", "item2", "item3", "item4")

    private lateinit var recyclerView: RecyclerView
    private   val  viewModel: MainViewModel by viewModel()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        spinner()

        displayUi(binding)


    }
    private fun displayUi(binding: ActivityMainBinding) {



        recyclerView = findViewById(R.id.recView)

        val food= viewModel.getFood()
        food.observe(this, Observer { binding.recView.also {
            it.layoutManager = LinearLayoutManager(this)
            it.adapter= food.value?.let { it1 -> Adapter(it1) }


        } })






    }

    private fun spinner(){
        val spinner = findViewById<Spinner>(R.id.spinner)

        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(
                this,
                android.R.layout.simple_spinner_item,
                items)
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner?.adapter=ad
        spinner?.onItemSelectedListener =this

    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, items[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

}








