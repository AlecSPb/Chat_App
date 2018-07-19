package com.zaqoutabed.github.kotlin_chat.Models.MessageItem

import android.net.Uri
import android.support.v7.widget.RecyclerView
import com.zaqoutabed.github.kotlin_chat.Adapters.MessageItemAdapter
import com.zaqoutabed.github.kotlin_chat.R

class VideoMessage(private var videoUrl:String, private var isReceived:Boolean):MessageItem {

    override fun getType(): Int {
        return R.layout.row_video_message
    }

    override fun bindItem(holder: RecyclerView.ViewHolder) {
        val videoHolder : MessageItemAdapter.VideoMessageHolder = holder as MessageItemAdapter.VideoMessageHolder
        videoHolder.video_message.setVideoURI(Uri.parse(this.videoUrl))
    }
}