package com.nfach98.githubuser.model


import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class UserDetail(
    @ColumnInfo(name = "avatar_url")
    @SerializedName("avatar_url")
    val avatarUrl: String? = null,

    @ColumnInfo(name = "bio")
    @SerializedName("bio")
    val bio: String? = null,

    @ColumnInfo(name = "blog")
    @SerializedName("blog")
    val blog: String? = null,

    @ColumnInfo(name = "company")
    @SerializedName("company")
    val company: String? = null,

    @ColumnInfo(name = "created_at")
    @SerializedName("created_at")
    val createdAt: String? = null,

    @ColumnInfo(name = "email")
    @SerializedName("email")
    val email: String? = null,

    @ColumnInfo(name = "events_url")
    @SerializedName("events_url")
    val eventsUrl: String? = null,

    @ColumnInfo(name = "followers")
    @SerializedName("followers")
    val followers: Int,

    @ColumnInfo(name = "followers_url")
    @SerializedName("followers_url")
    val followersUrl: String? = null,

    @ColumnInfo(name = "following")
    @SerializedName("following")
    val following: Int,

    @ColumnInfo(name = "following_url")
    @SerializedName("following_url")
    val followingUrl: String? = null,

    @ColumnInfo(name = "gists_url")
    @SerializedName("gists_url")
    val gistsUrl: String? = null,

    @ColumnInfo(name = "gravatar_id")
    @SerializedName("gravatar_id")
    val gravatarId: String? = null,

    @ColumnInfo(name = "hireable")
    @SerializedName("hireable")
    val hireable: Boolean,

    @ColumnInfo(name = "html_url")
    @SerializedName("html_url")
    val htmlUrl: String? = null,

    @PrimaryKey
    @SerializedName("id")
    val id: Int,

    @ColumnInfo(name = "location")
    @SerializedName("location")
    val location: String? = null,

    @ColumnInfo(name = "login")
    @SerializedName("login")
    val login: String? = null,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val name: String? = null,

    @ColumnInfo(name = "node_id")
    @SerializedName("node_id")
    val nodeId: String? = null,

    @ColumnInfo(name = "organizations_url")
    @SerializedName("organizations_url")
    val organizationsUrl: String? = null,

    @ColumnInfo(name = "public_gists")
    @SerializedName("public_gists")
    val publicGists: Int,

    @ColumnInfo(name = "public_repos")
    @SerializedName("public_repos")
    val publicRepos: Int,

    @ColumnInfo(name = "received_events_url")
    @SerializedName("received_events_url")
    val receivedEventsUrl: String? = null,

    @ColumnInfo(name = "repos_url")
    @SerializedName("repos_url")
    val reposUrl: String? = null,

    @ColumnInfo(name = "site_admin")
    @SerializedName("site_admin")
    val siteAdmin: Boolean,

    @ColumnInfo(name = "starred_url")
    @SerializedName("starred_url")
    val starredUrl: String? = null,

    @ColumnInfo(name = "subscriptions_url")
    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String? = null,

    @ColumnInfo(name = "twitter_username")
    @SerializedName("twitter_username")
    val twitterUsername: String? = null,

    @ColumnInfo(name = "type")
    @SerializedName("type")
    val type: String? = null,

    @ColumnInfo(name = "updated_at")
    @SerializedName("updated_at")
    val updatedAt: String? = null,

    @ColumnInfo(name = "url")
    @SerializedName("url")
    val url: String? = null
) : Parcelable