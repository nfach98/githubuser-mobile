package com.nfach98.githubuserfavorite.app.main

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuserfavorite.app.detail.DetailActivity
import com.nfach98.githubuserfavorite.model.UserDetail
import com.nfach98.githubuserfavoritefavorite.R
import com.nfach98.githubuserfavoritefavorite.databinding.ActivityFavoriteBinding

class MainActivity : AppCompatActivity() {

    companion object {
        private const val EXTRA_STATE = "EXTRA_STATE"
        const val EXTRA_USER = "extra_user"
    }

    private lateinit var adapter: MainAdapter
    private lateinit var binding: ActivityFavoriteBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModelFactory(contentResolver)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.layout_main_action_bar)

        adapter = MainAdapter(this@MainActivity)
        binding.rvUsers.adapter = adapter
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.setHasFixedSize(true)

        if (savedInstanceState == null) {
            loadNotesAsync()
        } else {
            val list = savedInstanceState.getParcelableArrayList<UserDetail>(EXTRA_STATE)
            if (list != null) {
                adapter.users = list
            }
        }
    }

    override fun onStart() {
        super.onStart()
        loadNotesAsync()
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
        viewModel.getUsers().observe(this@MainActivity, {
            binding.rvUsers.visibility = View.VISIBLE
            binding.loading.visibility = View.INVISIBLE

            if (it.size > 0) {
                adapter.users = it
                adapter.setOnItemClickCallback(object : MainAdapter.OnItemActionCallback {
                    override fun onItemClicked(data: UserDetail) {
                        val intent = Intent(this@MainActivity, DetailActivity::class.java)
                        intent.putExtra(EXTRA_USER, data.login)
                        startActivity(intent)
                    }
                })
            } else {
                adapter.users = ArrayList()
            }
        })
    }
}