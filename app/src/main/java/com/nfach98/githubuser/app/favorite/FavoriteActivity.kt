package com.nfach98.githubuser.app.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuser.R
import com.nfach98.githubuser.databinding.ActivityFavoriteBinding
import com.nfach98.githubuser.db.MappingHelper
import com.nfach98.githubuser.db.UserHelper
import com.nfach98.githubuser.model.UserDetail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class FavoriteActivity : AppCompatActivity() {

    private lateinit var adapter: FavoriteAdapter
    private lateinit var binding: ActivityFavoriteBinding

    companion object {
        private const val EXTRA_STATE = "EXTRA_STATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.favorite)

        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.setHasFixedSize(true)
        binding.rvUsers.adapter = FavoriteAdapter(arrayListOf())

        if (savedInstanceState == null) {
            loadNotesAsync()
        } else {
            val list = savedInstanceState.getParcelableArrayList<UserDetail>(EXTRA_STATE)
            if (list != null) {
                adapter.users = list
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelableArrayList(EXTRA_STATE, adapter.users)
    }

    private fun loadNotesAsync() {
        val userHelper = UserHelper.getInstance(applicationContext)
        userHelper.open()

        GlobalScope.launch(Dispatchers.Main) {
            binding.loading.visibility = View.VISIBLE
            val deferredUsers = async(Dispatchers.IO) {
                val cursor = userHelper.queryAll()
                MappingHelper.mapCursorToArrayList(cursor)
            }
            binding.loading.visibility = View.INVISIBLE
            val users = deferredUsers.await()
            Log.d("nama", users.toString())
            if (users.size > 0) {
                binding.rvUsers.adapter = FavoriteAdapter(users)
            }
            else {
                binding.rvUsers.adapter = FavoriteAdapter(arrayListOf())
            }
        }
    }
}