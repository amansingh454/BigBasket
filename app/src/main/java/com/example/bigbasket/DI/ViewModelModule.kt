package com.example.bigbasket.DI

import com.example.bigbasket.Ui.ViewModel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val ViewModelModule= module {
   viewModel { MainViewModel(get()) }
}

