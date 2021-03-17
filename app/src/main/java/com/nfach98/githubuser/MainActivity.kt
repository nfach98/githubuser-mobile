package com.nfach98.githubuser

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuser.api.ApiMain
import com.nfach98.githubuser.databinding.ActivityMainBinding
import com.nfach98.githubuser.model.Item
import com.nfach98.githubuser.model.UserSearchResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_USER = "extra_user"
    }

    private var users = arrayListOf<Item>()
    private lateinit var adapter: UserAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        load("nfach")

        adapter = UserAdapter(arrayListOf())

        binding.rvUsers.adapter = adapter

        binding.rvUsers.setHasFixedSize(true)
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_home, menu)

        val sm = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val sv = menu?.findItem(R.id.search)?.actionView as androidx.appcompat.widget.SearchView?

        sv?.setSearchableInfo(sm.getSearchableInfo(componentName))
        sv?.queryHint = resources.getString(R.string.search)
        sv?.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    load(query)
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })

        return true
    }

    private fun load(search: String) {
        val result = ApiMain().services.search(search)

        result.enqueue(object : Callback<UserSearchResponse> {
            override fun onResponse(call: Call<UserSearchResponse>, response: Response<UserSearchResponse>) {
                if(response.code() == 200) {

                    val body = response.body()
                    adapter = body?.items?.let { UserAdapter(it) }!!
                    adapter.setOnItemClickCallback(object : UserAdapter.OnItemActionCallback{
                        override fun onItemClicked(data: Item) {
                            val intent = Intent(this@MainActivity, DetailActivity::class.java)
                            intent.putExtra(EXTRA_USER, data)
                            startActivity(intent)
                        }
                    })
                    binding.rvUsers.adapter = adapter
                }
            }
            override fun onFailure(call: Call<UserSearchResponse>, t: Throwable) {
                t.message?.let { Log.d("API: ", it) }
            }
        })
    }
}