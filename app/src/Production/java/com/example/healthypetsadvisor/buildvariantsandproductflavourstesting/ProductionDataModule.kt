package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting

import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.repositories.MainRepository
import org.koin.dsl.module

object ProductionDataModule {
    val productionModule = module {
        single<MainRepository> {
            ProductionRepository(context = get())
        }
    }
}