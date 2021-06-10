package com.example.bigbasket.data.Network

import com.example.bigbasket.data.model.Details


class ApiHelper(private val apiService: ApiService) {


    suspend fun getFood(): List<Details> {
        return apiService.getAllFood()
    }



}