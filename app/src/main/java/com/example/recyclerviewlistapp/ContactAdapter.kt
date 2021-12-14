package com.example.recyclerviewlistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contacts: List<Contact>):
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_view_list, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    override fun getItemCount(): Int {
        return contacts.size
    }


    class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(data: Contact){
            with(itemView){
                val txtInitial = findViewById<TextView>(R.id.initialTV)
                val txtName = findViewById<TextView>(R.id.nameTV)
                val txtPhone = findViewById<TextView>(R.id.phoneTV)

                txtInitial.text = data.name.first().toString()
                txtName.text = data.name
                txtPhone.text = data.phoneNumber
            }
        }
    }
}