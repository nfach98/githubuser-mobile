package com.nfach98.githubuser.app.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nfach98.githubuser.api.ApiMain
import com.nfach98.githubuser.model.Item
import com.nfach98.githubuser.model.UserFollowModel
import com.nfach98.githubuser.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailViewModel : ViewModel() {
    val detail = MutableLiveData<UserResponse>()
    val listFollower = MutableLiveData<ArrayList<Item>>()
    val listFollowing = MutableLiveData<ArrayList<Item>>()

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

    internal fun getUserFollower(username: String): LiveData<ArrayList<Item>> {
        val result = ApiMain().services.getUserFollower(username)

        result.enqueue(object : Callback<ArrayList<Item>> {
            override fun onResponse(call: Call<ArrayList<Item>>, response: Response<ArrayList<Item>>) {
                if(response.code() == 200) {
                    response.body().let {
                        listFollower.postValue(it)
                    }
                }
            }
            override fun onFailure(call: Call<ArrayList<Item>>, t: Throwable) {
                t.message?.let { Log.d("API: ", it) }
            }
        })
        return listFollower
    }

    internal fun getUserFollowing(username: String): LiveData<ArrayList<Item>> {
        val result = ApiMain().services.getUserFollowing(username)

        result.enqueue(object : Callback<ArrayList<Item>> {
            override fun onResponse(call: Call<ArrayList<Item>>, response: Response<ArrayList<Item>>) {
                if(response.code() == 200) {
                    response.body().let {
                        listFollowing.postValue(it)
                    }
                }
            }
            override fun onFailure(call: Call<ArrayList<Item>>, t: Throwable) {
                t.message?.let { Log.d("API: ", it) }
            }
        })
        return listFollowing
    }
}