package com.example.bigbasket.data.Network

class ApiHelper(private val apiService: ApiService) {

    suspend fun getAllFood()= apiService.getAllFood()


}