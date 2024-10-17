package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.domain.usecases.GetUserInfo

class MainViewModel(private val getUserInfo: GetUserInfo) : ViewModel() {
    private val _userInfo = MutableLiveData<String>()
    val userInfo: LiveData<String> = _userInfo
    init {
        updateUserInfo()
    }

    private fun updateUserInfo() {
        _userInfo.postValue(getUserInfo())
    }
}