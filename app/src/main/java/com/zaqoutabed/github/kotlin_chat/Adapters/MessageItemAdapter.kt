package com.zaqoutabed.github.kotlin_chat.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import com.zaqoutabed.github.kotlin_chat.Models.MessageItem.MessageItem
import com.zaqoutabed.github.kotlin_chat.R

class MessageItemAdapter(private var items:ArrayList<MessageItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        when(viewType){
            R.layout.row_text_message -> {return TextMessageHolder(view)}
            R.layout.row_image_message -> {return ImageMessageHolder(view)}
            else -> {return VideoMessageHolder(view)}
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        this.items.get(position).bindItem(holder)
    }

    override fun getItemViewType(position: Int): Int {
        return this.items.get(position).getType()
    }

    class TextMessageHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var text_message:TextView = itemView.findViewById(R.id.text_message)
    }
    class ImageMessageHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var image_message:ImageView = itemView.findViewById(R.id.image_message)
    }
    class VideoMessageHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var video_message:VideoView = itemView.findViewById(R.id.video_message)
    }
}