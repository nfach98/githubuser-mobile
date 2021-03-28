package com.nfach98.githubuser.app.detail

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nfach98.githubuser.api.ApiMain
import com.nfach98.githubuser.app.main.MainActivity
import com.nfach98.githubuser.databinding.ActivityDetailBinding
import com.nfach98.githubuser.model.Item
import com.nfach98.githubuser.model.UserResponse
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra<Item>(MainActivity.EXTRA_USER) as Item

        supportActionBar?.title = user.login
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        binding.tvName.text = user.name
//        binding.tvUsername.text = user.login
//        Picasso.get().load(user.avatarUrl).into(binding.ivAvatar)
        load(user.login)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }

    private fun load(username: String) {
        val result = ApiMain().services.getUser(username)

        result.enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if(response.code() == 200) {

                    response.body().also {
                        if (it != null) {
                            binding.tvName.text = it.name
                            binding.tvUsername.text = it.login
                            binding.tvBio.text = it.bio
                            binding.tvFollowers.text = it.followers.toString()
                            binding.tvFollowing.text = it.following.toString()

                            if(it.name == null) binding.tvName.visibility = View.GONE
                            if(it.bio == null) binding.tvBio.visibility = View.GONE

                            Picasso.get().load(it.avatarUrl).into(binding.ivAvatar)
                        }
                    }
                }
            }
            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                t.message?.let { Log.d("API: ", it) }
            }
        })
    }
}