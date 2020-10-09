package com.jetpacktut.testapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun replaceFragment(fragment : Fragment,activity: FragmentActivity?, addToBackStack : Boolean){

    activity?.let {
        val transaction = it.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        if (addToBackStack){
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }




}