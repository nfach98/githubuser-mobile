package com.nfach98.githubuser

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.nfach98.githubuser.databinding.ActivityDetailBinding
import com.nfach98.githubuser.model.Item
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra<Item>(MainActivity.EXTRA_USER) as Item

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = user.login

//        binding.tvName.text = user.name
        binding.tvUsername.text = user.login
        Picasso.get().load(user.avatarUrl).into(binding.ivAvatar)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}