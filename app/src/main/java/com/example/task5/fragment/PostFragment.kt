package com.example.task5.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task5.R
import com.example.task5.adapter.ContactAdapter
import com.example.task5.adapter.PostAdapter
import com.example.task5.model.Contact
import com.example.task5.model.Post

class PostFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_post, container, false)

        initViews(view)

        return view
    }
    private fun initViews(view : View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_posts)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = PostAdapter(preparePostList())
        recyclerView.adapter = adapter
    }

    private fun preparePostList() : ArrayList<Post>{
        val posts = ArrayList<Post>()

        for(i in 0..10){
            posts.add(Post("Post $i"))
        }
        return posts
    }
}