package com.zaqoutabed.github.kotlin_chat.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zaqoutabed.github.kotlin_chat.R
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Settings"
    }
}
