package com.nfach98.githubuser.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserDetail(
    @SerializedName("avatar_url")
    val avatarUrl: String? = null,

    @SerializedName("bio")
    val bio: String? = null,

    @SerializedName("blog")
    val blog: String? = null,

    @SerializedName("company")
    val company: String? = null,

    @SerializedName("created_at")
    val createdAt: String? = null,

    @SerializedName("email")
    val email: String? = null,

    @SerializedName("events_url")
    val eventsUrl: String? = null,

    @SerializedName("followers")
    val followers: Int,

    @SerializedName("followers_url")
    val followersUrl: String? = null,

    @SerializedName("following")
    val following: Int,

    @SerializedName("following_url")
    val followingUrl: String? = null,

    @SerializedName("gists_url")
    val gistsUrl: String? = null,

    @SerializedName("gravatar_id")
    val gravatarId: String? = null,

    @SerializedName("hireable")
    val hireable: Boolean,

    @SerializedName("html_url")
    val htmlUrl: String? = null,

    @SerializedName("id")
    val id: Int,

    @SerializedName("location")
    val location: String? = null,

    @SerializedName("login")
    val login: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("node_id")
    val nodeId: String? = null,

    @SerializedName("organizations_url")
    val organizationsUrl: String? = null,

    @SerializedName("public_gists")
    val publicGists: Int,

    @SerializedName("public_repos")
    val publicRepos: Int,

    @SerializedName("received_events_url")
    val receivedEventsUrl: String? = null,

    @SerializedName("repos_url")
    val reposUrl: String? = null,

    @SerializedName("site_admin")
    val siteAdmin: Boolean,

    @SerializedName("starred_url")
    val starredUrl: String? = null,

    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String? = null,

    @SerializedName("twitter_username")
    val twitterUsername: String? = null,

    @SerializedName("type")
    val type: String? = null,

    @SerializedName("updated_at")
    val updatedAt: String? = null,

    @SerializedName("url")
    val url: String? = null
) : Parcelable