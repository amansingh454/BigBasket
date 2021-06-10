package com.example.bigbasket.data.Network

import com.example.bigbasket.data.model.Details
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET("questions")

    suspend fun getAllFood(): List<Details>

    companion object{

        fun getRetrofit():ApiService {
            return Retrofit.Builder().baseUrl("https://private-c55636-bigbasket.apiary-mock.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
        }

    }


}