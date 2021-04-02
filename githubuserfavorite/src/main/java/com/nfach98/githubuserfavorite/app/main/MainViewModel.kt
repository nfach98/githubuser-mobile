package com.nfach98.githubuserfavorite.app.main

import android.content.ContentResolver
import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nfach98.githubuserfavorite.db.MappingHelper
import com.nfach98.githubuserfavorite.model.UserDetail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainViewModel(private val contentResolver: ContentResolver) : ViewModel() {
    var users = MutableLiveData<ArrayList<UserDetail>>()

   companion object{
       val CONTENT_URI: Uri = Uri.Builder().scheme("content")
           .authority("com.nfach98.githubuser")
           .appendPath("users")
           .build()
   }

    fun getUsers(): LiveData<ArrayList<UserDetail>> {
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
}