package com.nfach98.githubuserfavorite.app.main

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuserfavorite.model.UserDetail
import com.nfach98.githubuserfavoritefavorite.R
import com.nfach98.githubuserfavoritefavorite.databinding.ActivityFavoriteBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainAdapter
    private lateinit var binding: ActivityFavoriteBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModelFactory(contentResolver)
    }

    companion object {
        private const val EXTRA_STATE = "EXTRA_STATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.favorite)

        adapter = MainAdapter(this@MainActivity)
        binding.rvUsers.adapter = adapter
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.setHasFixedSize(true)

        /*val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {

                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                noteViewModel.delete(noteAdapter.getNoteAt(viewHolder.adapterPosition))
                Toast.makeText(
                    this@MainActivity,
                    getString(R.string.note_deleted),
                    Toast.LENGTH_SHORT
                ).show()
            }

        })
        itemTouchHelper.attachToRecyclerView(binding.rvUsers)*/

        if (savedInstanceState == null) {
            loadNotesAsync()
        } else {
            val list = savedInstanceState.getParcelableArrayList<UserDetail>(EXTRA_STATE)
            if (list != null) {
                adapter.users = list
            }
        }
    }

    override fun onStart() {
        super.onStart()
        loadNotesAsync()
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
        viewModel.getUsers().observe(this@MainActivity, {
            binding.rvUsers.visibility = View.VISIBLE
            binding.loading.visibility = View.INVISIBLE

            if (it.size > 0) {
                adapter.users = it
                /*adapter.setOnItemClickCallback(object : MainActivity.OnItemActionCallback {
                    override fun onItemClicked(data: UserDetail) {
                        val intent = Intent(this@MainActivity, DetailActivity::class.java)
                        intent.putExtra(MainActivity.EXTRA_USER, data.login)
                        startActivity(intent)
                    }
                })*/
            } else {
                adapter.users = ArrayList()
            }
        })
    }
}