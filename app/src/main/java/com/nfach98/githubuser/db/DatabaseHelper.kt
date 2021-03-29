package com.nfach98.githubuser.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.nfach98.githubuser.db.DatabaseContract.UserColumns.Companion.TABLE_NAME

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "githubuser"
        private const val DATABASE_VERSION = 1
        private const val SQL_CREATE_TABLE_NOTE = "CREATE TABLE $TABLE_NAME" +
                " (${DatabaseContract.UserColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                " ${DatabaseContract.UserColumns.AVATAR} TEXT," +
                " ${DatabaseContract.UserColumns.BIO} TEXT," +
                " ${DatabaseContract.UserColumns.BLOG} TEXT," +
                " ${DatabaseContract.UserColumns.COMPANY} TEXT," +
                " ${DatabaseContract.UserColumns.CREATED_AT} TEXT," +
                " ${DatabaseContract.UserColumns.EMAIL} TEXT," +
                " ${DatabaseContract.UserColumns.EVENTS_URL} TEXT," +
                " ${DatabaseContract.UserColumns.FOLLOWERS} INTEGER," +
                " ${DatabaseContract.UserColumns.FOLLOWING} INTEGER," +
                " ${DatabaseContract.UserColumns.HIREABLE} INTEGER," +
                " ${DatabaseContract.UserColumns.HTML_URL} TEXT," +
                " ${DatabaseContract.UserColumns.LOCATION} TEXT," +
                " ${DatabaseContract.UserColumns.LOGIN} TEXT," +
                " ${DatabaseContract.UserColumns.NAME} TEXT," +
                " ${DatabaseContract.UserColumns.NODE_ID} TEXT," +
                " ${DatabaseContract.UserColumns.ORGANIZATION_URL} TEXT," +
                " ${DatabaseContract.UserColumns.REPOS_URL} TEXT," +
                " ${DatabaseContract.UserColumns.SITE_ADMIN} INTEGER," +
                " ${DatabaseContract.UserColumns.TWITTER_USERNAME} TEXT," +
                " ${DatabaseContract.UserColumns.TYPE} TEXT," +
                " ${DatabaseContract.UserColumns.UPDATED_AT} TEXT," +
                " ${DatabaseContract.UserColumns.URL} TEXT)"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_TABLE_NOTE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}