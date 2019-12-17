package com.example.android_di_koin_example.di

import com.example.android_di_koin_example.ui.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModule = module {

    // Provide MainActivityViewModel
    viewModel { MainActivityViewModel(get()) }

}