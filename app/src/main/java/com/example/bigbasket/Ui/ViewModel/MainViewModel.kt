package com.example.bigbasket.Ui.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigbasket.data.Repository.MainRepository
import com.example.bigbasket.data.model.FoodPacket
import kotlinx.coroutines.launch


class MainViewModel(private val repository: MainRepository) : ViewModel(){

    private lateinit var response:LiveData<List<FoodPacket>>

    fun getFood():LiveData<List<FoodPacket>>{

        viewModelScope.launch {
             response= repository.getFood()
        }
        return response
    }

    }



