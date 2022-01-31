package com.example.task5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task5.R
import com.example.task5.model.Post

class PostAdapter(private val posts : ArrayList<Post>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = posts[position]

        if(holder is PostViewHolder){
            holder.apply {
                postTV.text = post.post
            }
        }
    }

    override fun getItemCount(): Int = posts.size

    class PostViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var postTV = view.findViewById<TextView>(R.id.tv_post)
    }
}