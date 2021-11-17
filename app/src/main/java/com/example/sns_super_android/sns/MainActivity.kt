package com.example.sns

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.sns.fragment.chatting.ChattingPageFragment
import com.example.sns.fragment.mainpage.MainPageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.sns_super_android.R

class MainActivity : AppCompatActivity() {
    private var bottomNavigationView: BottomNavigationView? = null
    private var fragmentManager: FragmentManager? = null
    private var fragment_main: MainPageFragment? = null
    private val chattingPageFragment: ChattingPageFragment? = null
    private var transaction: FragmentTransaction? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView =
            findViewById<View>(R.id.main_bottom_navigation) as BottomNavigationView
        fragmentManager = supportFragmentManager
        fragment_main = MainPageFragment()
        transaction = fragmentManager!!.beginTransaction()
        transaction!!.replace(R.id.framelayout, fragment_main!!).commitAllowingStateLoss()
        bottomNavigationView!!.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    Log.i(ContentValues.TAG, "home")
                    supportFragmentManager.beginTransaction().replace(
                        R.id.framelayout,
                        fragment_main!!
                    )
                        .commitAllowingStateLoss()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.chat -> {
                    Log.i(ContentValues.TAG, "chat")
                    supportFragmentManager.beginTransaction().replace(
                        R.id.framelayout,
                        chattingPageFragment!!
                    )
                        .commitAllowingStateLoss()
                    return@OnNavigationItemSelectedListener true
                }
            }
            true
        })
    }
}