package com.nfach98.githubuser.app.favorite

import androidx.lifecycle.*
import com.nfach98.githubuser.db.UserRepository
import com.nfach98.githubuser.model.UserDetail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FavoriteViewModel(private val repository: UserRepository) : ViewModel() {
    val users: LiveData<List<UserDetail>> = repository.allUsers.asLiveData()

    fun getByUsername(username: String): UserDetail?{
        return repository.getByUsername(username)
    }

    fun insert(user: UserDetail) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(user)
    }

}

class FavoriteViewModelFactory(private val repository: UserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoriteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FavoriteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
