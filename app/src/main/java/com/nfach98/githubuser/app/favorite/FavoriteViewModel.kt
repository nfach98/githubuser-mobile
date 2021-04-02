package com.nfach98.githubuser.app.favorite

import android.content.ContentResolver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nfach98.githubuser.db.AppDatabase.Companion.CONTENT_URI
import com.nfach98.githubuser.db.MappingHelper
import com.nfach98.githubuser.model.UserDetail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class FavoriteViewModel(private val contentResolver: ContentResolver) : ViewModel() {
    var users = MutableLiveData<ArrayList<UserDetail>>()

    fun getUsers(): LiveData<ArrayList<UserDetail>>{
        GlobalScope.launch(Dispatchers.Main) {
            val deferredUsers = async(Dispatchers.IO) {
                val cursor = contentResolver.query(CONTENT_URI, null, null, null, null)
                MappingHelper.mapCursorToArrayList(cursor)
            }
            val list = deferredUsers.await()
            users.postValue(list)
        }

        return users
    }

    /*val users: LiveData<List<UserDetail>> = repository.allUsers.asLiveData()

    fun getByUsername(username: String): UserDetail?{
        return repository.getByUsername(username)
    }

    fun insert(user: UserDetail) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(user)
    }*/
}

class FavoriteViewModelFactory(private val contentResolver: ContentResolver) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoriteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FavoriteViewModel(contentResolver) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
