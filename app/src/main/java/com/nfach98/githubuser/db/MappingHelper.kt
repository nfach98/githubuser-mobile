package com.nfach98.githubuser.db

import android.database.Cursor
import com.nfach98.githubuser.model.UserDetail

object MappingHelper {

    fun mapCursorToArrayList(usersCursor: Cursor?): ArrayList<UserDetail> {
        val users = ArrayList<UserDetail>()

        usersCursor?.apply {
            while (moveToNext()) {
                val id = getInt(getColumnIndexOrThrow(DatabaseContract.UserColumns._ID))
                val avatar = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.AVATAR))
                val bio = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.BIO))
                val blog = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.BLOG))
                val company = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.COMPANY))
                val createdAt =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.CREATED_AT))
                val email = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.EMAIL))
                val eventsUrl =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.EVENTS_URL))
                val followers =
                    getInt(getColumnIndexOrThrow(DatabaseContract.UserColumns.FOLLOWERS))
                val following =
                    getInt(getColumnIndexOrThrow(DatabaseContract.UserColumns.FOLLOWING))
                val hireable = getInt(getColumnIndexOrThrow(DatabaseContract.UserColumns.HIREABLE))
                val htmlUrl =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.HTML_URL))
                val location =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.LOCATION))
                val login = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.LOGIN))
                val name = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.NAME))
                val nodeId = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.NODE_ID))
                val organizationUrl =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.ORGANIZATION_URL))
                val reposUrl =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.REPOS_URL))
                val siteAdmin =
                    getInt(getColumnIndexOrThrow(DatabaseContract.UserColumns.SITE_ADMIN))
                val twitterUsername =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.TWITTER_USERNAME))
                val type = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.TYPE))
                val url = getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.URL))
                val updatedAt =
                    getString(getColumnIndexOrThrow(DatabaseContract.UserColumns.UPDATED_AT))

                users.add(
                    UserDetail(
                        avatar,
                        bio,
                        blog,
                        company,
                        createdAt,
                        email,
                        eventsUrl,
                        followers,
                        null,
                        following,
                        null,
                        null,
                        null,
                        hireable == 1,
                        htmlUrl,
                        id,
                        location,
                        login,
                        name,
                        nodeId,
                        organizationUrl,
                        0,
                        0,
                        null,
                        reposUrl,
                        siteAdmin == 1,
                        null,
                        null,
                        twitterUsername,
                        type,
                        updatedAt,
                        url
                    )
                )
            }
        }
        return users
    }
}