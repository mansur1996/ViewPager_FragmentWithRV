package com.example.task5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task5.R
import com.example.task5.model.Contact

class ContactAdapter(val contacts : ArrayList<Contact>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contact = contacts[position]

        if(holder is ContactViewHolder){
            holder.apply {
                image.setImageResource(contact.image)
                name.text = contact.fullName
                number.text = contact.number
            }
        }

    }

    override fun getItemCount(): Int = contacts.size

    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var image = view.findViewById<ImageView>(R.id.iv_image_contact)
        var name = view.findViewById<TextView>(R.id.tv_name_contact)
        var number = view.findViewById<TextView>(R.id.tv_number_contact)
    }
}