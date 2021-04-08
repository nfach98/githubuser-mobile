package com.nfach98.githubuser.helper

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InternetViewModel : ViewModel() {
    val isInternet = MutableLiveData<Boolean>()

    internal fun getInternet() : LiveData<Boolean>{
        InternetCheck(object : InternetCheck.Consumer {
            override fun accept(internet: Boolean) {
                isInternet.postValue(internet)
            }
        })

        return isInternet
    }
}