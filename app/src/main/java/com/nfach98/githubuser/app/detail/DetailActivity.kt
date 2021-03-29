package com.nfach98.githubuser.app.detail

import android.content.ContentValues
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.nfach98.githubuser.R
import com.nfach98.githubuser.app.main.MainActivity
import com.nfach98.githubuser.databinding.ActivityDetailBinding
import com.nfach98.githubuser.db.DatabaseContract
import com.nfach98.githubuser.db.UserHelper
import com.nfach98.githubuser.model.Item
import com.nfach98.githubuser.model.UserDetail
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var viewModel: DetailViewModel
    private lateinit var user: Item
    private lateinit var userDetail: UserDetail

    private lateinit var userHelper: UserHelper

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

        userHelper = UserHelper.getInstance(applicationContext)
    }

    private fun setupView(){
        supportActionBar?.title = user.login
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnFavorite.setOnClickListener {
            userHelper.open()

            val values = ContentValues()
            values.put(DatabaseContract.UserColumns._ID, userDetail.id)
            values.put(DatabaseContract.UserColumns.AVATAR, userDetail.avatarUrl)
            values.put(DatabaseContract.UserColumns.BIO, userDetail.bio)
            values.put(DatabaseContract.UserColumns.BLOG, userDetail.blog)
            values.put(DatabaseContract.UserColumns.COMPANY, userDetail.company)
            values.put(DatabaseContract.UserColumns.CREATED_AT, userDetail.createdAt)
            values.put(DatabaseContract.UserColumns.EMAIL, userDetail.email)
            values.put(DatabaseContract.UserColumns.EVENTS_URL, userDetail.eventsUrl)
            values.put(DatabaseContract.UserColumns.FOLLOWERS, userDetail.followers)
            values.put(DatabaseContract.UserColumns.FOLLOWING, userDetail.following)
            values.put(DatabaseContract.UserColumns.HIREABLE, if(userDetail.hireable) 1 else 0)
            values.put(DatabaseContract.UserColumns.HTML_URL, userDetail.htmlUrl)
            values.put(DatabaseContract.UserColumns.LOCATION, userDetail.location)
            values.put(DatabaseContract.UserColumns.LOGIN, userDetail.login)
            values.put(DatabaseContract.UserColumns.NAME, userDetail.name)
            values.put(DatabaseContract.UserColumns.NODE_ID, userDetail.nodeId)
            values.put(DatabaseContract.UserColumns.ORGANIZATION_URL, userDetail.organizationsUrl)
            values.put(DatabaseContract.UserColumns.REPOS_URL, userDetail.reposUrl)
            values.put(DatabaseContract.UserColumns.SITE_ADMIN, if(userDetail.siteAdmin) 1 else 0)
            values.put(DatabaseContract.UserColumns.TWITTER_USERNAME, userDetail.twitterUsername)
            values.put(DatabaseContract.UserColumns.TYPE, userDetail.type)
            values.put(DatabaseContract.UserColumns.UPDATED_AT, userDetail.updatedAt)
            values.put(DatabaseContract.UserColumns.URL, userDetail.url)

            val result = userHelper.insert(values)
            if (result > 0) {
                Toast.makeText(this@DetailActivity, "Berhasil menambah data", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@DetailActivity, "Gagal menambah data", Toast.LENGTH_SHORT).show()
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