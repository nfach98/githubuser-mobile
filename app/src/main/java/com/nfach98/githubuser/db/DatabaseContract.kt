package com.nfach98.githubuser.db

import android.provider.BaseColumns
import com.google.gson.annotations.SerializedName

internal class DatabaseContract {

    internal class UserColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "users"
            const val _ID = "_id"
            const val AVATAR = "avatar"
            const val BIO = "bio"
            const val BLOG = "blog"
            const val COMPANY = "company"
            const val CREATED_AT = "created_at"
            const val EMAIL = "email"
            const val EVENTS_URL = "events_url"
            const val FOLLOWERS = "followers"
            const val FOLLOWING = "following"
            const val HIREABLE = "hireable"
            const val HTML_URL = "html_url"
            const val LOCATION = "location"
            const val LOGIN = "login"
            const val NAME = "name"
            const val NODE_ID = "node_id"
            const val ORGANIZATION_URL = "organization_url"
            const val REPOS_URL = "repos_url"
            const val SITE_ADMIN = "site_admin"
            const val TWITTER_USERNAME = "twitter_username"
            const val TYPE = "type"
            const val UPDATED_AT = "updated_at"
            const val URL = "url"
        }
    }
}