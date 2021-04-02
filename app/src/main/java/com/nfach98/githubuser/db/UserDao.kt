package com.nfach98.githubuser.db

import android.database.Cursor
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.nfach98.githubuser.model.UserDetail
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Query("SELECT * FROM userdetail")
    fun getAll(): Flow<List<UserDetail>>

    @Query("SELECT * FROM userdetail")
    fun getAllCursor(): Cursor

    @Query("SELECT * FROM userdetail WHERE id = :id")
    fun findById(id: Int): UserDetail?

    @Query("SELECT * FROM userdetail WHERE login = :username")
    fun findByUsername(username: String): UserDetail?

    @Query("SELECT * FROM userdetail WHERE login = :username")
    fun findByUsernameCursor(username: String): Cursor

    @Insert
    fun insert(vararg users: UserDetail)

    @Delete
    fun delete(user: UserDetail)
}