package com.zaqoutabed.github.kotlin_chat.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.zaqoutabed.github.kotlin_chat.Adapters.LoginFragmentPagerAdapter
import com.zaqoutabed.github.kotlin_chat.R

class MainActivity : AppCompatActivity() {

    private lateinit var tabs: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabs = findViewById(R.id.tabs)
        viewPager = findViewById(R.id.view_pager)

        viewPager.adapter = LoginFragmentPagerAdapter(supportFragmentManager)

        tabs.setupWithViewPager(viewPager)
    }
}