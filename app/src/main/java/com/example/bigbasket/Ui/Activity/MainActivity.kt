package com.example.bigbasket.Ui.Activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bigbasket.Ui.Adapter.Adapter
import com.example.bigbasket.R
import com.example.bigbasket.Ui.ViewModel.MainViewModel
import com.example.bigbasket.data.model.FoodPacket
import com.example.bigbasket.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private val viewModel: MainViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //spinner()

        displayUi(binding)


    }

    private fun displayUi(binding: ActivityMainBinding) {

        recyclerView = binding.recView
        viewModel.getFood()

        val food: LiveData<List<FoodPacket>> = viewModel.response

        food.observe(this, Observer {

                food ->
            binding.recView.also {
                it.layoutManager = LinearLayoutManager(this)
                it.adapter = Adapter(food)


            }
        })


    }
//
////    //@SuppressLint("ResourceType")
////    private fun spinner(){
////
////        val items= mutableListOf<Any?>("abc","abs")
////
////        val spinner = findViewById<Spinner>(R.id.spinner)
////
////        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(
////                this,
////                android.R.layout.simple_spinner_item,items)
////        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
////        spinner?.adapter=ad
////        spinner?.onItemSelectedListener =this
////
////    }
//    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        Toast.makeText(this, "item selected", Toast.LENGTH_LONG).show()
//    }
//
//    override fun onNothingSelected(parent: AdapterView<*>?) {
//    }

}









