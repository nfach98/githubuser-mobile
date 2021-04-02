package com.nfach98.githubuser.db

import android.database.Cursor
import androidx.room.*
import com.nfach98.githubuser.model.UserDetail

@Dao
interface UserDao {
    @Query("SELECT * FROM userdetail")
    fun getAll(): Cursor

    @Query("SELECT * FROM userdetail WHERE login = :username")
    fun findByUsername(username: String): UserDetail?

    @Query("SELECT * FROM userdetail WHERE login = :username")
    fun findByUsernameCursor(username: String): Cursor

    @Insert
    fun insert(vararg users: UserDetail)

    @Update
    fun update(vararg users: UserDetail): Int

    @Delete
    fun delete(user: UserDetail): Int
}