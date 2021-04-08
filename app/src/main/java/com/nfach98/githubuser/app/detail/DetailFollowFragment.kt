package com.nfach98.githubuser.app.detail

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuser.app.main.MainActivity
import com.nfach98.githubuser.app.main.MainAdapter
import com.nfach98.githubuser.databinding.FragmentDetailFollowBinding
import com.nfach98.githubuser.model.Item

class DetailFollowFragment : Fragment() {

    companion object {
        private const val DETAIL_PAGE = "page"
        private const val DETAIL_USERNAME = "username"

        @JvmStatic
        fun newInstance(index: Int, username: String) =
            DetailFollowFragment().apply {
                arguments = Bundle().apply {
                    putInt(DETAIL_PAGE, index)
                    putString(DETAIL_USERNAME, username)
                }
            }
    }

    private lateinit var binding: FragmentDetailFollowBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentDetailFollowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val index = arguments?.getInt(DETAIL_PAGE, 0)
        val username = arguments?.getString(DETAIL_USERNAME)

        val viewModel = ViewModelProvider(this)[DetailViewModel::class.java]

        binding.rvFollow.setHasFixedSize(true)
        binding.rvFollow.layoutManager = LinearLayoutManager(context)

        if (username != null) {
            when(index){
                0 -> {
                    viewModel.getUserFollower(username).observe(viewLifecycleOwner, {
                        if(it != null){
                            val adapter = MainAdapter(it)
                            adapter.setOnItemClickCallback(object : MainAdapter.OnItemActionCallback {
                                override fun onItemClicked(data: Item) {
                                    val intent = Intent(context, DetailActivity::class.java)
                                    intent.putExtra(MainActivity.EXTRA_USER, data.login)
                                    startActivity(intent)
                                }
                            })

                            binding.loading.visibility = View.GONE
                            binding.rvFollow.adapter = adapter
                        }
                    })
                }
                1 -> {
                    viewModel.getUserFollowing(username).observe(viewLifecycleOwner, {
                        if(it != null){
                            val adapter = MainAdapter(it)
                            adapter.setOnItemClickCallback(object : MainAdapter.OnItemActionCallback {
                                override fun onItemClicked(data: Item) {
                                    val intent = Intent(context, DetailActivity::class.java)
                                    intent.putExtra(MainActivity.EXTRA_USER, data.login)
                                    startActivity(intent)
                                }
                            })

                            binding.loading.visibility = View.GONE
                            binding.rvFollow.adapter = adapter
                        }
                    })
                }
            }
        }
    }
}