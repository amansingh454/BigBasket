package com.example.bigbasket.data.Network


import com.example.bigbasket.data.model.FoodPacket
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface FoodApi {

    @GET("questions")

    fun getAllFood(): Call<List<FoodPacket>>

    companion object{

        var foodApi: FoodApi?=null

        fun getInstance(): FoodApi {
            if(foodApi ==null){
                val retrofit=Retrofit.Builder().baseUrl("https://private-c55636-bigbasket.apiary-mock.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                foodApi =retrofit.create(FoodApi::class.java)

            }
            return foodApi!!
        }
    }
}
