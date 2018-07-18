package com.zaqoutabed.github.kotlin_chat.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.zaqoutabed.github.kotlin_chat.Fragments.LoginFragment
import com.zaqoutabed.github.kotlin_chat.Fragments.SignupFragment

class LoginFragmentPagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {
    private var fragments = arrayOf(LoginFragment(), SignupFragment())
    private var titles = arrayOf("Login", "Sign up")

    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return fragments[position]
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }
}