package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting

import android.app.Application
import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.di.UseCaseModule
import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.di.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class TestApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@TestApp)
            modules(
                UseCaseModule.useCaseModule,
                ViewModelModule.viewModelModule,
                TestDataModule.testModule
            )
        }
    }
}

