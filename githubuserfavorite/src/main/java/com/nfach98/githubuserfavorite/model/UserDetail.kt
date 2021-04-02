package com.nfach98.githubuserfavorite.model


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
    var avatarUrl: String? = null,

    @ColumnInfo(name = "bio")
    @SerializedName("bio")
    var bio: String? = null,

    @ColumnInfo(name = "blog")
    @SerializedName("blog")
    var blog: String? = null,

    @ColumnInfo(name = "company")
    @SerializedName("company")
    var company: String? = null,

    @ColumnInfo(name = "created_at")
    @SerializedName("created_at")
    var createdAt: String? = null,

    @ColumnInfo(name = "email")
    @SerializedName("email")
    var email: String? = null,

    @ColumnInfo(name = "events_url")
    @SerializedName("events_url")
    var eventsUrl: String? = null,

    @ColumnInfo(name = "followers")
    @SerializedName("followers")
    var followers: Int = 0,

    @ColumnInfo(name = "followers_url")
    @SerializedName("followers_url")
    var followersUrl: String? = null,

    @ColumnInfo(name = "following")
    @SerializedName("following")
    var following: Int = 0,

    @ColumnInfo(name = "following_url")
    @SerializedName("following_url")
    var followingUrl: String? = null,

    @ColumnInfo(name = "gists_url")
    @SerializedName("gists_url")
    var gistsUrl: String? = null,

    @ColumnInfo(name = "gravatar_id")
    @SerializedName("gravatar_id")
    var gravatarId: String? = null,

    @ColumnInfo(name = "hireable")
    @SerializedName("hireable")
    var hireable: Boolean = false,

    @ColumnInfo(name = "html_url")
    @SerializedName("html_url")
    var htmlUrl: String? = null,

    @PrimaryKey
    @SerializedName("id")
    var id: Int = 0,

    @ColumnInfo(name = "location")
    @SerializedName("location")
    var location: String? = null,

    @ColumnInfo(name = "login")
    @SerializedName("login")
    var login: String? = null,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    var name: String? = null,

    @ColumnInfo(name = "node_id")
    @SerializedName("node_id")
    var nodeId: String? = null,

    @ColumnInfo(name = "organizations_url")
    @SerializedName("organizations_url")
    var organizationsUrl: String? = null,

    @ColumnInfo(name = "public_gists")
    @SerializedName("public_gists")
    var publicGists: Int = 0,

    @ColumnInfo(name = "public_repos")
    @SerializedName("public_repos")
    var publicRepos: Int = 0,

    @ColumnInfo(name = "received_events_url")
    @SerializedName("received_events_url")
    var receivedEventsUrl: String? = null,

    @ColumnInfo(name = "repos_url")
    @SerializedName("repos_url")
    var reposUrl: String? = null,

    @ColumnInfo(name = "site_admin")
    @SerializedName("site_admin")
    var siteAdmin: Boolean = false,

    @ColumnInfo(name = "starred_url")
    @SerializedName("starred_url")
    var starredUrl: String? = null,

    @ColumnInfo(name = "subscriptions_url")
    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null,

    @ColumnInfo(name = "twitter_username")
    @SerializedName("twitter_username")
    var twitterUsername: String? = null,

    @ColumnInfo(name = "type")
    @SerializedName("type")
    var type: String? = null,

    @ColumnInfo(name = "updated_at")
    @SerializedName("updated_at")
    var updatedAt: String? = null,

    @ColumnInfo(name = "url")
    @SerializedName("url")
    var url: String? = null
) : Parcelable