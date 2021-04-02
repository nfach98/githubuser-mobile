package com.nfach98.githubuserfavorite.app.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nfach98.githubuserfavoritefavorite.databinding.ItemUserBinding
import com.nfach98.githubuserfavoritefavorite.model.Item
import com.squareup.picasso.Picasso

class MainAdapter(private val users: ArrayList<Item>) : RecyclerView.Adapter<MainAdapter.UserViewHolder>() {

    private var onItemActionCallback: OnItemActionCallback? = null

    fun setOnItemClickCallback(onItemActionCallback: OnItemActionCallback) {
        this.onItemActionCallback = onItemActionCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int = users.size

    inner class UserViewHolder(private val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: Item) {
            itemView.setOnClickListener { onItemActionCallback?.onItemClicked(user) }
            binding.tvName.text = user.login
            Picasso.get().load(user.avatarUrl).into(binding.ivAvatar)
        }
    }

    interface OnItemActionCallback {
        fun onItemClicked(data: Item)
    }
}