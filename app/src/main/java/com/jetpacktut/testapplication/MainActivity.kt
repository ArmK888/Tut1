package com.jetpacktut.testapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.FragmentActivity



private const val SELECTED_ITEM_POSITION = "ItemPosition"

class MainActivity : FragmentActivity(){
    private var mPosition = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = MainFragment.newInstance()

        replaceFragment(mainFragment, this, false)
    }


    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState?.putInt(SELECTED_ITEM_POSITION, mPosition)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if (savedInstanceState != null) {
            mPosition = savedInstanceState.getInt(SELECTED_ITEM_POSITION)
        }

    }


}

