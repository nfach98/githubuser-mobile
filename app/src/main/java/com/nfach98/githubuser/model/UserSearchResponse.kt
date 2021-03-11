package com.nfach98.githubuser.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserSearchResponse(
    @SerializedName("incomplete_results")
    @Expose
    val incompleteResults: Boolean,

    @SerializedName("items")
    @Expose
    val items: ArrayList<Item>,

    @SerializedName("total_count")
    @Expose
    val totalCount: Int
)