package com.nfach98.githubuser.db

import androidx.annotation.WorkerThread
import com.nfach98.githubuser.model.UserDetail

class UserRepository(private val userDao: UserDao) {

    fun getByUsername(username: String): UserDetail? {
        return userDao.findByUsername(username)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(user: UserDetail) {
        userDao.insert(user)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun delete(user: UserDetail) {
        userDao.delete(user)
    }
}
