package com.zaqoutabed.github.kotlin_chat.Models.MessageItem

import android.support.v7.widget.RecyclerView
import com.zaqoutabed.github.kotlin_chat.Adapters.MessageItemAdapter
import com.zaqoutabed.github.kotlin_chat.R

class TextMessage(private var content:String, private var isReceived:Boolean):MessageItem {

    override fun getType(): Int {
        return R.layout.row_text_message
    }

    override fun bindItem(holder: RecyclerView.ViewHolder) {
        val textHolder: MessageItemAdapter.TextMessageHolder = holder as MessageItemAdapter.TextMessageHolder
        textHolder.text_message.text = this.content
    }

}