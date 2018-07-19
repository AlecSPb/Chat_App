package com.zaqoutabed.github.kotlin_chat.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.zaqoutabed.github.kotlin_chat.Models.RoomItem
import com.zaqoutabed.github.kotlin_chat.R

class RoomItemAdapter(private var roomItems: ArrayList<RoomItem>): RecyclerView.Adapter<RoomItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_room_item, parent, false))
    }

    override fun getItemCount(): Int {
        return this.roomItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.img_room_icon.setImageResource(R.mipmap.ic_launcher)
        holder.tv_title.text = roomItems.get(position).roomName
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var img_room_icon:ImageView = itemView.findViewById(R.id.img_room_icon)
        var tv_title:TextView = itemView.findViewById(R.id.tv_title)
    }
}