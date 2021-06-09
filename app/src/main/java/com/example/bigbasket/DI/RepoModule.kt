package com.example.bigbasket.DI

import com.example.bigbasket.data.Repository.MainRepository
import org.koin.dsl.module


val RepoModule= module {
    single { MainRepository(get()) }
}