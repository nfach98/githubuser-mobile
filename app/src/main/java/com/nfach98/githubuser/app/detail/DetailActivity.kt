package com.nfach98.githubuser.app.detail

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.tabs.TabLayoutMediator
import com.nfach98.githubuser.R
import com.nfach98.githubuser.app.favorite.FavoriteViewModel
import com.nfach98.githubuser.app.favorite.FavoriteViewModelFactory
import com.nfach98.githubuser.app.main.MainActivity
import com.nfach98.githubuser.databinding.ActivityDetailBinding
import com.nfach98.githubuser.db.UserApplication
import com.nfach98.githubuser.model.Item
import com.nfach98.githubuser.model.UserDetail
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var user: Item
    private lateinit var userDetail: UserDetail

    private lateinit var viewModel: DetailViewModel
    private val favoriteViewModel: FavoriteViewModel by viewModels {
        FavoriteViewModelFactory((application as UserApplication).repository)
    }

    companion object {
        private val TAB_TITLES = intArrayOf(
            R.string.follower,
            R.string.following
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

        binding.btnFavorite.setOnClickListener {
            GlobalScope.launch {
                favoriteViewModel.insert(userDetail)
                /*if (insert.isCompleted) {
                    Toast.makeText(this@DetailActivity, "Berhasil menambah data", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@DetailActivity, "Gagal menambah data", Toast.LENGTH_SHORT).show()
                }*/
            }
        }
    }

    private fun load(username: String) {
        viewModel.getUser(username).observe(this, {
            if(it != null){
                userDetail = it

                binding.loading.visibility = View.GONE
                binding.layoutDetail.visibility = View.VISIBLE

                binding.tvName.text = it.name
                binding.tvUsername.text = it.login
                binding.tvBio.text = it.bio

                if(it.name == null) binding.tvName.visibility = View.GONE
                if(it.bio == null) binding.tvBio.visibility = View.GONE

                Picasso.get().load(it.avatarUrl).into(binding.ivAvatar)

                val pagerAdapter = DetailFollowPagerAdapter(this, user.login)
                binding.viewPager.adapter = pagerAdapter

                TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
                    when(position){
                        0 -> tab.text = "${resources.getString(TAB_TITLES[position])} (${it.followers})"
                        1 -> tab.text = "${resources.getString(TAB_TITLES[position])} (${it.following})"
                    }
                }.attach()
            }
        })
    }
}