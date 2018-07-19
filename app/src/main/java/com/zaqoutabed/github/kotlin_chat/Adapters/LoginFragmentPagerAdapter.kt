package com.zaqoutabed.github.kotlin_chat.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.zaqoutabed.github.kotlin_chat.Fragments.LoginFragment
import com.zaqoutabed.github.kotlin_chat.Fragments.SignupFragment

class LoginFragmentPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    private var fragments: ArrayList<Fragment> = ArrayList<Fragment>()
    private var titles: ArrayList<String> = ArrayList<String>()

    init {
        fragments.add(LoginFragment())
        fragments.add(SignupFragment())
        titles.add("Log in")
        titles.add("Sign up")
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }

}