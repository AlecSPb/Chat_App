package com.zaqoutabed.github.kotlin_chat.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.zaqoutabed.github.kotlin_chat.Adapters.MessageListAdapter
import com.zaqoutabed.github.kotlin_chat.Models.Message
import com.zaqoutabed.github.kotlin_chat.R
import kotlinx.android.synthetic.main.activity_messages.*

class MessagesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        val items:ArrayList<Message> = ArrayList()
        for (i in 0..100){
            items.add(Message("ArrayList<Message> $i", "name $i", (i%2==0)))
        }

        val adapter:MessageListAdapter = MessageListAdapter(items)
        reyclerview_message_list.adapter = adapter
        val layoutManager:LinearLayoutManager = LinearLayoutManager(this)
        layoutManager.reverseLayout = true

        reyclerview_message_list.layoutManager = layoutManager

        button_chatbox_send.setOnClickListener{
            items.add(0, Message(edittext_chatbox.text.toString(), "abed", false))
            adapter.notifyItemInserted(0)
            reyclerview_message_list.scrollToPosition(0)
        }
    }
}
