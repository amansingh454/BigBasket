package com.example.bigbasket.data.Network


import com.example.bigbasket.data.model.FoodPacket
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface FoodApi {

    @GET("questions")

    suspend fun getAllFood(): List<FoodPacket>

    companion object{


        fun getInstance(): FoodApi {
                val retrofit=Retrofit.Builder().baseUrl("https://private-c55636-bigbasket.apiary-mock.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

            return retrofit.create(FoodApi::class.java)
        }
    }
}
