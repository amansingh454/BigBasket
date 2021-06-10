package com.example.bigbasket.DI

import com.example.bigbasket.data.Network.ApiHelper
import com.example.bigbasket.data.Network.ApiService
import org.koin.dsl.module


val ApiHelperModule= module {

    single { ApiHelper(get()) }
    single { ApiService.getRetrofit() }
}