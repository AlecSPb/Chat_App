package com.zaqoutabed.github.kotlin_chat.Models.MessageItem

import android.support.v7.widget.RecyclerView

class ImageMessage(imageUrl:String, isReceived:Boolean):MessageItem {

    var imageUrl:String
    var isReceived:Boolean

    init {
        this.imageUrl = imageUrl
        this.isReceived = isReceived
    }

    override fun getType(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindItem(holder: RecyclerView.ViewHolder) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}