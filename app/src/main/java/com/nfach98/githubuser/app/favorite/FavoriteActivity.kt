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

        adapter = FavoriteAdapter()
        binding.rvUsers.adapter = adapter
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.setHasFixedSize(true)

        if (savedInstanceState == null) {
            loadNotesAsync()
            /*viewModel.users.observe(this, {
                it.let {
                    adapter.users = it as ArrayList<UserDetail>
                    adapter.setOnItemClickCallback(object : FavoriteAdapter.OnItemActionCallback {
                        override fun onItemClicked(data: UserDetail) {
                            val intent = Intent(this@FavoriteActivity, DetailActivity::class.java)
                            intent.putExtra(MainActivity.EXTRA_USER, data.login)
                            startActivity(intent)
                        }
                    })
                    binding.loading.visibility = View.GONE
                    binding.rvUsers.visibility = View.VISIBLE
                }
            })*/
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
        viewModel.getUsers().observe(this@FavoriteActivity, {
            binding.rvUsers.visibility = View.VISIBLE
            binding.loading.visibility = View.INVISIBLE

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
            }
        })
    }
}