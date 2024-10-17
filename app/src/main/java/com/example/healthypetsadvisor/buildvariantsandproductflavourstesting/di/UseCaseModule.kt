package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.di

import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.usecases.GetUserInfo
import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.usecases.GetUserInfoImpl
import org.koin.dsl.module

object UseCaseModule {
    val useCaseModule = module {
        single<GetUserInfo> { GetUserInfoImpl(mainRepository = get()) }
    }
}