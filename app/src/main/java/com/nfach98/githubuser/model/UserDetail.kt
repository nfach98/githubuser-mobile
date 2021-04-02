package com.nfach98.githubuser.model


import android.content.ContentValues
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
) : Parcelable {

    companion object {
        fun fromContentValues(contentValues: ContentValues) : UserDetail{
            val userDetail = UserDetail()
            if (contentValues.containsKey("avatar_url")) {
                userDetail.avatarUrl = contentValues.getAsString("avatar_url")
            }
            if (contentValues.containsKey("bio")) {
                userDetail.bio = contentValues.getAsString("bio")
            }
            if (contentValues.containsKey("blog")) {
                userDetail.blog = contentValues.getAsString("blog")
            }
            if (contentValues.containsKey("company")) {
                userDetail.company = contentValues.getAsString("company")
            }
            if (contentValues.containsKey("created_at")) {
                userDetail.createdAt = contentValues.getAsString("created_at")
            }
            if (contentValues.containsKey("email")) {
                userDetail.email = contentValues.getAsString("email")
            }
            if (contentValues.containsKey("events_url")) {
                userDetail.eventsUrl = contentValues.getAsString("events_url")
            }
            if (contentValues.containsKey("followers")) {
                userDetail.followers = contentValues.getAsInteger("followers")
            }
            if (contentValues.containsKey("followers_url")) {
                userDetail.followersUrl = contentValues.getAsString("followers_url")
            }
            if (contentValues.containsKey("following")) {
                userDetail.following = contentValues.getAsInteger("following")
            }
            if (contentValues.containsKey("following_url")) {
                userDetail.followingUrl = contentValues.getAsString("following_url")
            }
            if (contentValues.containsKey("gists_url")) {
                userDetail.gistsUrl = contentValues.getAsString("gists_url")
            }
            if (contentValues.containsKey("gravatar_id")) {
                userDetail.gravatarId = contentValues.getAsString("gravatar_id")
            }
            if (contentValues.containsKey("hireable")) {
                userDetail.hireable = contentValues.getAsInteger("hireable") == 1
            }
            if (contentValues.containsKey("html_url")) {
                userDetail.htmlUrl = contentValues.getAsString("html_url")
            }
            if (contentValues.containsKey("id")) {
                userDetail.id = contentValues.getAsInteger("id")
            }
            if (contentValues.containsKey("location")) {
                userDetail.location = contentValues.getAsString("location")
            }
            if (contentValues.containsKey("login")) {
                userDetail.login = contentValues.getAsString("login")
            }
            if (contentValues.containsKey("name")) {
                userDetail.name = contentValues.getAsString("name")
            }
            if (contentValues.containsKey("node_id")) {
                userDetail.nodeId = contentValues.getAsString("node_id")
            }
            if (contentValues.containsKey("organizations_url")) {
                userDetail.organizationsUrl = contentValues.getAsString("organizations_url")
            }
            if (contentValues.containsKey("public_gists")) {
                userDetail.publicGists = contentValues.getAsInteger("public_gists")
            }
            if (contentValues.containsKey("public_repos")) {
                userDetail.publicRepos = contentValues.getAsInteger("public_repos")
            }
            if (contentValues.containsKey("received_events_url")) {
                userDetail.receivedEventsUrl = contentValues.getAsString("received_events_url")
            }
            if (contentValues.containsKey("repos_url")) {
                userDetail.reposUrl = contentValues.getAsString("repos_url")
            }
            if (contentValues.containsKey("site_admin")) {
                userDetail.siteAdmin = contentValues.getAsInteger("site_admin") == 1
            }
            if (contentValues.containsKey("starred_url")) {
                userDetail.starredUrl = contentValues.getAsString("starred_url")
            }
            if (contentValues.containsKey("subscriptions_url")) {
                userDetail.subscriptionsUrl = contentValues.getAsString("subscriptions_url")
            }
            if (contentValues.containsKey("twitter_username")) {
                userDetail.twitterUsername = contentValues.getAsString("twitter_username")
            }
            if (contentValues.containsKey("type")) {
                userDetail.type = contentValues.getAsString("type")
            }
            if (contentValues.containsKey("updated_at")) {
                userDetail.updatedAt = contentValues.getAsString("updated_at")
            }
            if (contentValues.containsKey("url")) {
                userDetail.url = contentValues.getAsString("url")
            }

            return userDetail
        }
    }
}