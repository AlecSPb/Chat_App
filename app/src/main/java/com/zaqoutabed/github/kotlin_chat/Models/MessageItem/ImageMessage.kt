package com.zaqoutabed.github.kotlin_chat.Models.MessageItem

import android.support.v7.widget.RecyclerView
import com.zaqoutabed.github.kotlin_chat.Adapters.MessageItemAdapter
import com.zaqoutabed.github.kotlin_chat.R

class ImageMessage(imageUrl:String, isReceived:Boolean):MessageItem {

    var imageUrl:String
    var isReceived:Boolean

    init {
        this.imageUrl = imageUrl
        this.isReceived = isReceived
    }

    override fun getType(): Int {
        return R.layout.row_image_message
    }

    override fun bindItem(holder: RecyclerView.ViewHolder) {
        val imageHolder:MessageItemAdapter.ImageMessageHolder = holder as MessageItemAdapter.ImageMessageHolder
        imageHolder.image_message.setImageResource(R.mipmap.ic_launcher)
    }
}