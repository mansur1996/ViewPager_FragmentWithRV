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
import com.example.task5.adapter.UserAdapter
import com.example.task5.model.Contact
import com.example.task5.model.User

class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        initViews(view)

        return view
    }
    private fun initViews(view : View){
        var recyclerView = view.findViewById<RecyclerView>(R.id.rv_users)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = UserAdapter(prepareUserList())
        recyclerView.adapter = adapter
    }

    private fun prepareUserList() : ArrayList<User>{
        val users = ArrayList<User>()

        for(i in 0..10){
            users.add(User(R.drawable.img_html5, "Html5"))
        }
        return users
    }
}