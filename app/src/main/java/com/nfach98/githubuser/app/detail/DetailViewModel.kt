package com.nfach98.githubuser.app.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nfach98.githubuser.api.ApiMain
import com.nfach98.githubuser.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailViewModel : ViewModel() {
    val detail = MutableLiveData<UserResponse>()

    internal fun getUser(username: String): LiveData<UserResponse> {
        val result = ApiMain().services.getUser(username)

        result.enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if(response.code() == 200) {
                    response.body().let {
                        detail.postValue(it)
                    }
                }
            }
            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                t.message?.let { Log.d("API: ", it) }
            }
        })
        return detail
    }
}