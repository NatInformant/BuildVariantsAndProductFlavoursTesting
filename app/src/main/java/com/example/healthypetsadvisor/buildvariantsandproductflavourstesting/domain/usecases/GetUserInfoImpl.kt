package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.usecases

import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.repositories.MainRepository

class GetUserInfoImpl(private val mainRepository: MainRepository) : GetUserInfo {
    override fun invoke() = mainRepository.getUserInfo()
}