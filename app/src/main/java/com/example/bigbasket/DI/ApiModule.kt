package com.example.bigbasket.DI



import com.example.bigbasket.data.Network.FoodApi
import org.koin.dsl.module

val ApiModule= module {
    single { FoodApi.getInstance() }
}






