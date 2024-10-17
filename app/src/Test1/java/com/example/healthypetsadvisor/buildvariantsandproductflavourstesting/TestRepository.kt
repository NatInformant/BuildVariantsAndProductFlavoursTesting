package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting

import android.content.Context
import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.repositories.MainRepository

class TestRepository(private val context: Context) : MainRepository {
    override fun getUserInfo() = context.getString(R.string.user_info)
}