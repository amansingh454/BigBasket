package com.example.bigbasket

import android.app.Application
import com.example.bigbasket.DI.ApiModule
import com.example.bigbasket.DI.RepoModule
import com.example.bigbasket.DI.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(ApiModule, RepoModule, ViewModelModule))
        }
    }}







