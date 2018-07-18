package com.zaqoutabed.github.kotlin_chat.Models.MessageItem

import android.support.v7.widget.RecyclerView

class TextMessage(content:String, isReceived:Boolean):MessageItem {

    var content:String
    var isReceived:Boolean

    init {
        this.content = content
        this.isReceived = isReceived
    }
    override fun getType(): Int {
        return 0
    }

    override fun bindItem(holder: RecyclerView.ViewHolder) {
    }

}