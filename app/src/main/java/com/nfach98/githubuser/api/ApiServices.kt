package com.nfach98.githubuser.api

import com.nfach98.githubuser.model.UserResponse
import com.nfach98.githubuser.model.UserSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("search/users")
    fun search(@Query("q") username: String): Call<UserSearchResponse>

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<UserResponse>
}