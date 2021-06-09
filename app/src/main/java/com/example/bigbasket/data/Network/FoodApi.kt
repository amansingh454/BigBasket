package com.example.bigbasket.data.Network



import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FoodApi {


        private fun getRetrofit(): Retrofit {
            return Retrofit.Builder().baseUrl("https://private-c55636-bigbasket.apiary-mock.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val apiService: ApiService = getRetrofit().create(ApiService::class.java)
    }

