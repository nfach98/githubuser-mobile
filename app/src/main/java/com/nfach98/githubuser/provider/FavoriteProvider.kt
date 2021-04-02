package com.nfach98.githubuser.provider

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri
import com.nfach98.githubuser.db.AppDatabase
import com.nfach98.githubuser.db.AppDatabase.Companion.AUTHORITY
import com.nfach98.githubuser.db.AppDatabase.Companion.TABLE_NAME
import com.nfach98.githubuser.db.UserDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class FavoriteProvider : ContentProvider() {

    companion object {
        private const val FAV = 1
        private const val FAV_USERNAME = 2
        private val sUriMatcher = UriMatcher(UriMatcher.NO_MATCH)
        private var userDao: UserDao? = null
        init {
            sUriMatcher.addURI(AUTHORITY, TABLE_NAME, FAV)
            sUriMatcher.addURI(AUTHORITY, "$TABLE_NAME/#", FAV_USERNAME)
        }
    }

    override fun onCreate(): Boolean {
        val applicationScope = CoroutineScope(SupervisorJob())

        val database by lazy { context?.let { AppDatabase.getDatabase(it, applicationScope) } }
        userDao = database?.userDao()
        return true
    }

    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? {
        var cursor: Cursor? = null

        when (sUriMatcher.match(uri)) {
            FAV -> {
                cursor = userDao?.getAllCursor()
                cursor?.setNotificationUri(context?.contentResolver, uri)
            }
            FAV_USERNAME -> {
                cursor = userDao?.findByUsernameCursor(uri.lastPathSegment.toString())
                cursor?.setNotificationUri(context?.contentResolver, uri)
            }
        }

        return cursor
    }

    override fun getType(uri: Uri): String? {
        return null
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        return null
    }

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        return 0
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        return 0
    }
}