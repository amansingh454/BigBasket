package com.example.bigbasket.Ui.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigbasket.data.Repository.MainRepository
import com.example.bigbasket.data.model.FoodPacket
import kotlinx.coroutines.launch


class MainViewModel(private val repository: MainRepository) : ViewModel() {

    val response: LiveData<List<FoodPacket>> =  MutableLiveData()

    fun getFood(){

        viewModelScope.launch {

            response as MutableLiveData
            response.value=repository.getFood()

        }

    }










}




