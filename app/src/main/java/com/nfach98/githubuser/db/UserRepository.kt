package com.nfach98.githubuser.db

import androidx.annotation.WorkerThread
import com.nfach98.githubuser.model.UserDetail
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao: UserDao) {

    val allUsers: Flow<List<UserDetail>> = userDao.getAll()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(user: UserDetail) {
        userDao.insert(user)
    }
}
