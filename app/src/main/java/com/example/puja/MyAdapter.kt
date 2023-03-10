package com.example.puja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val pujaList:ArrayList<Detail>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.activity_list_item,parent,false)
        return MyViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem=pujaList[position]
        holder.titleImage.setImageResource(currentitem.titleImage)
        holder.heading.text=currentitem.heading
        holder.discription.text=currentitem.discreption
        holder.cost.text=currentitem.cost

    }

    override fun getItemCount(): Int {
        return pujaList.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val titleImage : ImageView=itemView.findViewById(R.id.TitleImage)
        val heading: TextView=itemView.findViewById(R.id.PujaHeading)
        val discription: TextView=itemView.findViewById(R.id.Discription)
        val cost: TextView=itemView.findViewById(R.id.Cost)

    }


}