package com.zaqoutabed.github.kotlin_chat.Models.MessageItem

import android.support.v7.widget.RecyclerView

interface MessageItem {
    fun getType():Int
    fun bindItem(holder: RecyclerView.ViewHolder)
}