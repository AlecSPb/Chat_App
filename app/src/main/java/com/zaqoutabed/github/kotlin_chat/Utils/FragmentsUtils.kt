package com.zaqoutabed.github.kotlin_chat.Utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction
import com.zaqoutabed.github.kotlin_chat.Activities.HomeActivity

class FragmentsUtils {

    companion object {
        public fun addFragment(fragmentActivity: FragmentActivity, container:Int, fragment: Fragment, addToBackStack:Boolean){
            val transaction:FragmentTransaction = fragmentActivity.supportFragmentManager.beginTransaction()
            transaction.add(container, fragment)
            if (addToBackStack){
                transaction.addToBackStack(null)
            }
            transaction.commit()

        }

        public fun replaceFragment(fragmentActivity: FragmentActivity, container:Int, fragment: Fragment, addToBackStack:Boolean){
            val transaction:FragmentTransaction = fragmentActivity.supportFragmentManager.beginTransaction()
            transaction.replace(container, fragment)
            if (addToBackStack){
                transaction.addToBackStack(null)
            }
            transaction.commit()
        }
    }
}