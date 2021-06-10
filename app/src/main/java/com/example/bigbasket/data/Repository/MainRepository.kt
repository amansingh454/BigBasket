package com.example.bigbasket.data.Repository


import com.example.bigbasket.data.Network.ApiHelper
import com.example.bigbasket.data.model.FoodPacket



class MainRepository(private val apiHelper: ApiHelper) {


    suspend fun getFood(): List<FoodPacket> {
        val details = apiHelper.getFood()
        val lis = mutableListOf<FoodPacket>()

        for (item in details) {
            lis.addAll(item.choices)
        }
        return lis


    }
}







