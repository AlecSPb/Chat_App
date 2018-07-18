package com.zaqoutabed.github.kotlin_chat.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zaqoutabed.github.kotlin_chat.Adapters.LoginFragmentPagerAdapter
import com.zaqoutabed.github.kotlin_chat.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = LoginFragmentPagerAdapter(supportFragmentManager)
        tabs.setupWithViewPager(viewPager)
    }
}