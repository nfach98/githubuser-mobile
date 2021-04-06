package com.nfach98.githubuser.app.main

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuser.R
import com.nfach98.githubuser.app.detail.DetailActivity
import com.nfach98.githubuser.app.favorite.FavoriteActivity
import com.nfach98.githubuser.app.setting.SettingActivity
import com.nfach98.githubuser.databinding.ActivityMainBinding
import com.nfach98.githubuser.model.Item


class MainActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_USER = "extra_user"
    }

    private lateinit var adapter: MainAdapter
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
        setupData()

        binding.loading.visibility = View.GONE
    }

    private fun setupData(){
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        loadSearch("")
    }

    private fun setupView(){
        supportActionBar?.apply {
            setDisplayShowHomeEnabled(true)
            setDisplayUseLogoEnabled(true)
            setLogo(R.drawable.ic_github_logo_24dp)
            title = ""
        }

        adapter = MainAdapter(arrayListOf())

        binding.rvUsers.adapter = adapter

        binding.rvUsers.setHasFixedSize(true)
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_home, menu)

        val sm = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val sv = menu?.findItem(R.id.menu_search)?.actionView as androidx.appcompat.widget.SearchView?

        sv?.setSearchableInfo(sm.getSearchableInfo(componentName))
        sv?.queryHint = resources.getString(R.string.search)

        sv?.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    loadSearch(query)
                    sv.clearFocus()
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })

        /*MenuItemCompat.setOnActionExpandListener(menu?.findItem(R.id.search), object : MenuItemCompat.OnActionExpandListener {
            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                loadSearch("")
                return true
            }

            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                loadSearch("")
                return true
            }
        })*/

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_setting) {
//            startActivity(Intent(Settings.ACTION_LOCALE_SETTINGS))
            startActivity(Intent(this@MainActivity, SettingActivity::class.java))
        }

        else if (item.itemId == R.id.menu_favorite) {
            startActivity(Intent(this@MainActivity, FavoriteActivity::class.java))
        }

        return super.onOptionsItemSelected(item)
    }

    private fun loadSearch(search: String) {
        binding.rvUsers.visibility = View.GONE
        binding.loading.visibility = View.VISIBLE

        viewModel.getSearch(search).observe(this, {
            binding.loading.visibility = View.GONE
            binding.rvUsers.visibility = View.VISIBLE

            if (it != null) {
                adapter = MainAdapter(it.items)
                adapter.setOnItemClickCallback(object : MainAdapter.OnItemActionCallback {
                    override fun onItemClicked(data: Item) {
                        val intent = Intent(this@MainActivity, DetailActivity::class.java)
                        intent.putExtra(EXTRA_USER, data.login)
                        startActivity(intent)
                    }
                })
                binding.rvUsers.adapter = adapter
            }
            else{
                adapter = MainAdapter(arrayListOf())
                binding.rvUsers.adapter = adapter
            }
        })
    }
}