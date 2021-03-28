package com.nfach98.githubuser.app.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nfach98.githubuser.api.ApiMain
import com.nfach98.githubuser.model.UserSearchResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {
    val userSearch = MutableLiveData<UserSearchResponse>()

    internal fun getSearch(username: String): LiveData<UserSearchResponse> {
        val result = ApiMain().services.search(username)

        result.enqueue(object : Callback<UserSearchResponse> {
            override fun onResponse(call: Call<UserSearchResponse>, response: Response<UserSearchResponse>) {
                if(response.code() == 200) {
                    response.body().let {
                        userSearch.postValue(it)
                    }
                }
            }
            override fun onFailure(call: Call<UserSearchResponse>, t: Throwable) {
                t.message?.let { Log.d("API: ", it) }
            }
        })
        return userSearch
    }
}