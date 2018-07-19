package com.zaqoutabed.github.kotlin_chat.Activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.zaqoutabed.github.kotlin_chat.Fragments.AddFriendsFragment
import com.zaqoutabed.github.kotlin_chat.Fragments.ChatsFragment
import com.zaqoutabed.github.kotlin_chat.Fragments.MyFriendsFragment
import kotlinx.android.synthetic.main.activity_home.*
import com.zaqoutabed.github.kotlin_chat.R
import com.zaqoutabed.github.kotlin_chat.R.id.*
import com.zaqoutabed.github.kotlin_chat.Utils.FragmentsUtils

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        if(savedInstanceState == null) run {
            supportActionBar!!.title = "Chat Rooms"
            val chatsFragment = ChatsFragment()
            FragmentsUtils.addFragment(this@HomeActivity, R.id.container, ChatsFragment(), false)
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            nav_chats ->{
                supportActionBar!!.title = "Chat Rooms"
                FragmentsUtils.replaceFragment(this, R.id.container, ChatsFragment(), false)
            }
            nav_my_friends ->{
                supportActionBar!!.title = "My Friends"
                FragmentsUtils.replaceFragment(this, R.id.container, MyFriendsFragment(), false)
            }
            nav_add_friends ->{
                supportActionBar!!.title = "Add Friends"
                FragmentsUtils.replaceFragment(this, R.id.container, AddFriendsFragment(), false)
            }
            nav_settings ->{
                val intent: Intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
            }
            nav_logout ->{
                val intent: Intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
