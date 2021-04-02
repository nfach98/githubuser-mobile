package com.nfach98.githubuserfavorite.db

import android.database.Cursor
import com.nfach98.githubuserfavorite.model.UserDetail

object MappingHelper {

    fun mapCursorToArrayList(usersCursor: Cursor?): ArrayList<UserDetail> {
        val users = ArrayList<UserDetail>()

        usersCursor?.apply {
            while (moveToNext()) {
                val id = getInt(getColumnIndexOrThrow("id"))
                val avatar = getString(getColumnIndexOrThrow("avatar_url"))
                val bio = getString(getColumnIndexOrThrow("bio"))
                val blog = getString(getColumnIndexOrThrow("blog"))
                val company = getString(getColumnIndexOrThrow("company"))
                val createdAt =
                    getString(getColumnIndexOrThrow("created_at"))
                val email = getString(getColumnIndexOrThrow("email"))
                val eventsUrl =
                    getString(getColumnIndexOrThrow("events_url"))
                val followers =
                    getInt(getColumnIndexOrThrow("followers"))
                val following =
                    getInt(getColumnIndexOrThrow("following"))
                val hireable = getInt(getColumnIndexOrThrow("hireable"))
                val htmlUrl =
                    getString(getColumnIndexOrThrow("html_url"))
                val location =
                    getString(getColumnIndexOrThrow("location"))
                val login = getString(getColumnIndexOrThrow("login"))
                val name = getString(getColumnIndexOrThrow("name"))
                val nodeId = getString(getColumnIndexOrThrow("node_id"))
                val organizationUrl =
                    getString(getColumnIndexOrThrow("organizations_url"))
                val reposUrl =
                    getString(getColumnIndexOrThrow("repos_url"))
                val siteAdmin =
                    getInt(getColumnIndexOrThrow("site_admin"))
                val twitterUsername =
                    getString(getColumnIndexOrThrow("twitter_username"))
                val type = getString(getColumnIndexOrThrow("type"))
                val url = getString(getColumnIndexOrThrow("url"))
                val updatedAt =
                    getString(getColumnIndexOrThrow("updated_at"))

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

    fun mapCursorToObject(usersCursor: Cursor?): UserDetail {
        var user = UserDetail()

        usersCursor?.apply {
            val id = getInt(getColumnIndexOrThrow("id"))
            val avatar = getString(getColumnIndexOrThrow("avatar"))
            val bio = getString(getColumnIndexOrThrow("bio"))
            val blog = getString(getColumnIndexOrThrow("blog"))
            val company = getString(getColumnIndexOrThrow("company"))
            val createdAt =
                getString(getColumnIndexOrThrow("created_at"))
            val email = getString(getColumnIndexOrThrow("email"))
            val eventsUrl =
                getString(getColumnIndexOrThrow("events_url"))
            val followers =
                getInt(getColumnIndexOrThrow("followers"))
            val following =
                getInt(getColumnIndexOrThrow("following"))
            val hireable = getInt(getColumnIndexOrThrow("hireable"))
            val htmlUrl =
                getString(getColumnIndexOrThrow("html_url"))
            val location =
                getString(getColumnIndexOrThrow("location"))
            val login = getString(getColumnIndexOrThrow("login"))
            val name = getString(getColumnIndexOrThrow("name"))
            val nodeId = getString(getColumnIndexOrThrow("node_id"))
            val organizationUrl =
                getString(getColumnIndexOrThrow("organization_url"))
            val reposUrl =
                getString(getColumnIndexOrThrow("repos_url"))
            val siteAdmin =
                getInt(getColumnIndexOrThrow("site_admin"))
            val twitterUsername =
                getString(getColumnIndexOrThrow("twitter_username"))
            val type = getString(getColumnIndexOrThrow("type"))
            val url = getString(getColumnIndexOrThrow("url"))
            val updatedAt =
                getString(getColumnIndexOrThrow("updated_at"))

            user = UserDetail(
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
        }
        return user
    }
}