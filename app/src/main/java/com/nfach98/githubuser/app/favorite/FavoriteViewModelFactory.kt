package com.nfach98.githubuser.app.favorite

import android.content.ContentResolver
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nfach98.githubuser.db.UserRepository

class FavoriteViewModelFactory(private val contentResolver: ContentResolver, private val repository: UserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoriteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FavoriteViewModel(contentResolver, repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}