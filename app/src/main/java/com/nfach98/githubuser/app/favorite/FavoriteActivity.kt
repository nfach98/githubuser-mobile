package com.nfach98.githubuser.app.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuser.R
import com.nfach98.githubuser.databinding.ActivityFavoriteBinding
import com.nfach98.githubuser.db.UserApplication
import com.nfach98.githubuser.model.UserDetail

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding
    private val viewModel: FavoriteViewModel by viewModels {
        FavoriteViewModelFactory((application as UserApplication).repository)
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

        val adapter = FavoriteAdapter(arrayListOf())
        binding.rvUsers.adapter = adapter
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.setHasFixedSize(true)

        viewModel.users.observe(this, {
            it.let {
                binding.rvUsers.adapter = FavoriteAdapter(it as ArrayList<UserDetail>)
            }
        })

       /* if (savedInstanceState == null) {
            loadNotesAsync()
        } else {
            val list = savedInstanceState.getParcelableArrayList<UserDetail>(EXTRA_STATE)
            if (list != null) {
                adapter.users = list
            }
        }*/
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putParcelableArrayList(EXTRA_STATE, adapter.users)
//    }
}