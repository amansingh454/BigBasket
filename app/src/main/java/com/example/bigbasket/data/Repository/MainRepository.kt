package com.example.bigbasket.data.Repository


import com.example.bigbasket.data.Network.ApiHelper
import com.example.bigbasket.data.model.FoodPacket
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class MainRepository(private val apiHelper: ApiHelper) {


    suspend fun getFood():List<FoodPacket> {
        return withContext(Dispatchers.IO){
            apiHelper.getFood()[0].choices

    }
}}







