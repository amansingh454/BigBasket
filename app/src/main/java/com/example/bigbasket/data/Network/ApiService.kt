package com.example.bigbasket.data.Network

import com.example.bigbasket.data.model.FoodPacket
import retrofit2.http.GET

interface ApiService {

    @GET("questions")

    suspend fun getAllFood(): List<FoodPacket>


}