package com.zaqoutabed.github.kotlin_chat.Models.MessageItem

import android.support.v7.widget.RecyclerView

class VideoMessage(videoUrl:String, isReceived:Boolean):MessageItem {

    var videoUrl:String
    var isReceived:Boolean

    init {
        this.videoUrl = videoUrl
        this.isReceived = isReceived
    }
    override fun getType(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindItem(holder: RecyclerView.ViewHolder) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}