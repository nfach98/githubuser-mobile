package com.nfach98.githubuser.app.detail

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.nfach98.githubuser.api.ApiMain
import com.nfach98.githubuser.app.main.MainActivity
import com.nfach98.githubuser.app.main.MainViewModel
import com.nfach98.githubuser.databinding.ActivityDetailBinding
import com.nfach98.githubuser.model.Item
import com.nfach98.githubuser.model.UserResponse
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var viewModel: DetailViewModel
    private lateinit var user: Item

    companion object {
        private val TAB_TITLES = arrayOf(
            "Follower",
            "Following"
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupData()
        setupView()

        load(user.login)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }

    private fun setupData() {
        user = intent.getParcelableExtra<Item>(MainActivity.EXTRA_USER) as Item
        viewModel = ViewModelProvider(this)[DetailViewModel::class.java]
    }

    private fun setupView(){
        supportActionBar?.title = user.login
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pagerAdapter = DetailFollowPagerAdapter(this)
        binding.viewPager.adapter = pagerAdapter

        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            tab.text = TAB_TITLES[position]
        }.attach()
    }

    private fun load(username: String) {
        viewModel.getUser(username).observe(this, {
            if(it != null){
                binding.loading.visibility = View.GONE
                binding.layoutDetail.visibility = View.VISIBLE

                binding.tvName.text = it.name
                binding.tvUsername.text = it.login
                binding.tvBio.text = it.bio
                binding.tvFollowers.text = it.followers.toString()
                binding.tvFollowing.text = it.following.toString()

                if(it.name == null) binding.tvName.visibility = View.GONE
                if(it.bio == null) binding.tvBio.visibility = View.GONE

                Picasso.get().load(it.avatarUrl).into(binding.ivAvatar)
            }
        })
    }
}