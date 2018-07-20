package com.zaqoutabed.github.kotlin_chat.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.zaqoutabed.github.kotlin_chat.Models.Message
import com.zaqoutabed.github.kotlin_chat.R

class MessageListAdapter(var items:ArrayList<Message>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        val VIEW_TYPE_MESSAGE_SENT:Int = 1
        val VIEW_TYPE_MESSAGE_RECEIVED:Int = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        lateinit var view:View
        if (viewType == VIEW_TYPE_MESSAGE_SENT){
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_message_sent, parent, false)
            return SentMessageHolder(view)
        } else{
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_message_received, parent, false)
            return ReceivedMessageHolder(view)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message:Message = items.get(position)
        when(holder.itemViewType){
            VIEW_TYPE_MESSAGE_SENT -> {
                (holder as SentMessageHolder).bind(message)
            }
            VIEW_TYPE_MESSAGE_RECEIVED -> {
                (holder as ReceivedMessageHolder).bind(message)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        if (items.get(position).isReceived)
            return VIEW_TYPE_MESSAGE_RECEIVED
        else
            return VIEW_TYPE_MESSAGE_SENT
    }
    class SentMessageHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var text_message_name:TextView = itemView.findViewById(R.id.text_message_name)
        var text_message_body:TextView = itemView.findViewById(R.id.text_message_body)
        fun bind(message:Message){
            text_message_name.text = message.nickname
            text_message_body.text = message.message
        }
    }
    class ReceivedMessageHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var text_message_name:TextView = itemView.findViewById(R.id.text_message_name)
        var text_message_body:TextView = itemView.findViewById(R.id.text_message_body)
        fun bind(message:Message){
            text_message_name.text = message.nickname
            text_message_body.text = message.message
        }
    }
}