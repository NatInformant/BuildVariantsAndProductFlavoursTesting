package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting

import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.repositories.MainRepository
import org.koin.dsl.module

object TestDataModule {
    val testModule = module {
        single<MainRepository> {
            TestRepository(context = get())
        }
    }
}