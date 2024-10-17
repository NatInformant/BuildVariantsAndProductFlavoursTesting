package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.di

import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.ui.MainViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

object ViewModelModule {
    val viewModelModule = module {
        viewModel<MainViewModel> { MainViewModel(getUserInfo = get()) }
    }
}