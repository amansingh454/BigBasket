package com.example.bigbasket.Ui.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigbasket.data.Repository.MainRepository
import com.example.bigbasket.data.model.FoodPacket
import kotlinx.coroutines.launch


class MainViewModel(private val repository: MainRepository) : ViewModel() {

    private val mResponse= MutableLiveData<List<FoodPacket>>()

    val response = mResponse as LiveData<List<FoodPacket>>
    fun getFood(){

        viewModelScope.launch {

            mResponse.value=repository.getFood()
        }

    }










}




