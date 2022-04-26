package com.subhambikash.recyclerview_exam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewAdapter(val context: Context, val empDetails: ArrayList<EmpModel>) :
    RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val id: TextView = itemView.findViewById(R.id.id)
        val gender: TextView = itemView.findViewById(R.id.gender)
        val phone: TextView = itemView.findViewById(R.id.phone)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val detailsList = empDetails[position]
        holder.name.text = detailsList.empName
        holder.gender.text = detailsList.gender
        holder.id.text = detailsList.id
        holder.phone.text = detailsList.phone
    }

    override fun getItemCount(): Int {
        return empDetails.size
    }


}