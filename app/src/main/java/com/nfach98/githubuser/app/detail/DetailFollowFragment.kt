package com.nfach98.githubuser.app.detail

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.nfach98.githubuser.R
import com.nfach98.githubuser.app.main.MainActivity
import com.nfach98.githubuser.app.main.MainUserAdapter
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
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail_follow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailFollowBinding.inflate(layoutInflater)
        val index = arguments?.getInt(DETAIL_PAGE, 0)
        val username = arguments?.getString(DETAIL_USERNAME)

        val viewModel = ViewModelProvider(this)[DetailViewModel::class.java]

        binding.rvFollow.setHasFixedSize(true)
        binding.rvFollow.layoutManager = LinearLayoutManager(context)

        when(index){
            0 -> {
                if (username != null) {
                    viewModel.getUserFollower(username).observe(this, {
                        if(it != null){
                            val adapter = MainUserAdapter(it)
                            adapter.setOnItemClickCallback(object : MainUserAdapter.OnItemActionCallback {
                                override fun onItemClicked(data: Item) {
                                    val intent = Intent(context, DetailActivity::class.java)
                                    intent.putExtra(MainActivity.EXTRA_USER, data)
                                    startActivity(intent)
                                }
                            })

                            binding.rvFollow.adapter = adapter
                        }
                    })
                }
            }
        }
    }
}