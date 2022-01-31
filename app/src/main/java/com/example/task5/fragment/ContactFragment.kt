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
import com.example.task5.model.Contact

class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact_list, container, false)

        initViews(view)

        return view
    }
    private fun initViews(view : View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_contacts)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = ContactAdapter(prepareContactList())
        recyclerView.adapter = adapter
    }

    private fun prepareContactList() : ArrayList<Contact>{
        val contacts = ArrayList<Contact>()

        for(i in 0..10){
            contacts.add(Contact(R.drawable.img_csharf, "C# language", "+9989 99 111 $i$i $i$i"))
        }
        return contacts
    }

}