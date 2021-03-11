package com.nfach98.githubuser.api

import com.nfach98.githubuser.model.UserSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("search/users")
    fun search(@Query("q") username: String): Call<UserSearchResponse>

}