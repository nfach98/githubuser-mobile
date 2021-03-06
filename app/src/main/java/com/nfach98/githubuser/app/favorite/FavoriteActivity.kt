package com.nfach98.githubuser.app.favorite

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuser.R
import com.nfach98.githubuser.app.detail.DetailActivity
import com.nfach98.githubuser.app.main.MainActivity
import com.nfach98.githubuser.databinding.ActivityFavoriteBinding
import com.nfach98.githubuser.db.UserApplication
import com.nfach98.githubuser.model.UserDetail

class FavoriteActivity : AppCompatActivity() {

    private lateinit var adapter: FavoriteAdapter
    private lateinit var binding: ActivityFavoriteBinding
    private val viewModel: FavoriteViewModel by viewModels {
        FavoriteViewModelFactory(contentResolver, (application as UserApplication).repository)
    }

    companion object {
        private const val EXTRA_STATE = "EXTRA_STATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.favorite)

        adapter = FavoriteAdapter(this@FavoriteActivity)
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
        binding.rvUsers.visibility = View.INVISIBLE
        binding.loading.visibility = View.VISIBLE

        viewModel.getUsers().observe(this@FavoriteActivity, {
            if (it.size > 0) {
                adapter.users = it
                adapter.setOnItemClickCallback(object : FavoriteAdapter.OnItemActionCallback {
                    override fun onItemClicked(data: UserDetail) {
                        val intent = Intent(this@FavoriteActivity, DetailActivity::class.java)
                        intent.putExtra(MainActivity.EXTRA_USER, data.login)
                        startActivity(intent)
                    }
                })
            } else {
                adapter.users = ArrayList()
                binding.ivOctocat.visibility = View.VISIBLE
                binding.tvNothing.visibility = View.VISIBLE
            }

            binding.rvUsers.visibility = View.VISIBLE
            binding.loading.visibility = View.GONE
        })
    }
}