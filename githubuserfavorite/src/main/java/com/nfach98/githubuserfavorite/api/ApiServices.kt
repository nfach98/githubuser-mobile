package com.nfach98.githubuserfavoritefavorite.api

import com.nfach98.githubuserfavorite.model.UserDetail
import com.nfach98.githubuserfavorite.model.UserSearchResponse
import com.nfach98.githubuserfavoritefavorite.model.Item
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("search/users")
    fun search(@Query("q") username: String): Call<UserSearchResponse>

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<UserDetail>

    @GET("users/{username}/followers")
    fun getUserFollower(@Path("username") username: String): Call<ArrayList<Item>>

    @GET("users/{username}/following")
    fun getUserFollowing(@Path("username") username: String): Call<ArrayList<Item>>
}