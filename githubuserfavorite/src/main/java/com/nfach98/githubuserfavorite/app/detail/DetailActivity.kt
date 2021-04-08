package com.nfach98.githubuserfavorite.app.detail

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.nfach98.githubuserfavorite.app.main.MainActivity
import com.nfach98.githubuserfavorite.model.UserDetail
import com.nfach98.githubuserfavoritefavorite.R
import com.nfach98.githubuserfavoritefavorite.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var username: String
    private lateinit var userDetail: UserDetail

    private lateinit var viewModel: DetailViewModel
//    private val favoriteViewModel: FavoriteViewModel by viewModels {
//        FavoriteViewModelFactory(contentResolver, (application as UserApplication).repository)
//    }

    private var isUserOnDb = false

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
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }

    private fun setupData() {
        username = intent.getStringExtra(MainActivity.EXTRA_USER).toString()
        viewModel = ViewModelProvider(this)[DetailViewModel::class.java]

//        lifecycleScope.launch(Dispatchers.IO) {
//            isUserOnDb = favoriteViewModel.getByUsername(username) != null
//            setFab(isUserOnDb)
//        }
        load(username)
    }

    private fun setupView(){
        supportActionBar?.title = ""
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.home.setOnClickListener {
            finish()
        }

//        binding.btnFavorite.setOnClickListener {
//            if(isUserOnDb){
//                lifecycleScope.launch(Dispatchers.IO) {
//                    val delete = favoriteViewModel.delete(userDetail)
//                    delete.join()
//                    withContext(Dispatchers.Main){
//                        if (delete.isCompleted) {
//                            Toast.makeText(this@DetailActivity, "${userDetail.login} berhasil dihapus dari favorit", Toast.LENGTH_SHORT).show()
//                            isUserOnDb = false
//                            setFab(isUserOnDb)
//                        } else {
//                            Toast.makeText(this@DetailActivity, "Gagal menghapus data", Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                }
//            }
//            else{
//                lifecycleScope.launch(Dispatchers.IO) {
//                    val insert = favoriteViewModel.insert(userDetail)
//                    insert.join()
//                    withContext(Dispatchers.Main){
//                        if (insert.isCompleted) {
//                            Toast.makeText(this@DetailActivity, "Berhasil menambah data", Toast.LENGTH_SHORT).show()
//                            isUserOnDb = true
//                            setFab(isUserOnDb)
//                        } else {
//                            Toast.makeText(this@DetailActivity, "Gagal menambah data", Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                }
//            }
//        }
    }

    private fun load(username: String) {
        viewModel.getUser(username).observe(this, {
            if(it != null){
                userDetail = it

                binding.loading.visibility = View.GONE
                if(it.location != null) binding.tvLocation.visibility = View.VISIBLE
                if(it.bio == null) binding.tvBio.visibility = View.GONE
                if(it.name == null) {
                    binding.tvName.text = it.login
                    binding.tvUsername.visibility = View.GONE
                }
                else{
                    binding.tvName.text = it.name
                    binding.tvUsername.text = it.login
                }

                binding.tvLocation.text = it.location
                binding.tvBio.text = it.bio

                Picasso.get().load(it.avatarUrl).into(binding.ivAvatar)

                val pagerAdapter = DetailFollowPagerAdapter(this, username)
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