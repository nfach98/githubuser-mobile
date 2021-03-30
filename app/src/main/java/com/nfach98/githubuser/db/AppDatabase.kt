package com.nfach98.githubuser.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nfach98.githubuser.model.UserDetail
import kotlinx.coroutines.CoroutineScope

@Database(entities = [UserDetail::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "users"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }

}