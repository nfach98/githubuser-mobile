package com.nfach98.githubuserfavorite.app.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nfach98.githubuserfavorite.model.UserDetail
import com.nfach98.githubuserfavoritefavorite.databinding.ItemUserBinding
import com.squareup.picasso.Picasso

class MainAdapter(val context: Context) : RecyclerView.Adapter<MainAdapter.UserViewHolder>() {

    var users = ArrayList<UserDetail>()
        set(users) {
            if (users.size > 0) {
                this.users.clear()
            }
            this.users.addAll(users)
            notifyDataSetChanged()
        }

    private var onItemActionCallback: OnItemActionCallback? = null

    fun setOnItemClickCallback(onItemActionCallback: OnItemActionCallback) {
        this.onItemActionCallback = onItemActionCallback
    }

    fun addItem(note: UserDetail) {
        this.users.add(note)
        notifyItemInserted(this.users.size - 1)
    }

    fun updateItem(position: Int, note: UserDetail) {
        this.users[position] = note
        notifyItemChanged(position, note)
    }

    fun removeItem(position: Int) {
        this.users.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, this.users.size)
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
        fun bind(user: UserDetail) {
            itemView.setOnClickListener { onItemActionCallback?.onItemClicked(user) }
            binding.tvName.text = user.login
            Picasso.get().load(user.avatarUrl).into(binding.ivAvatar)
        }
    }

    interface OnItemActionCallback {
        fun onItemClicked(data: UserDetail)
    }
}