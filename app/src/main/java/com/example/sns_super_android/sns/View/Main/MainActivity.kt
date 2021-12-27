package com.example.sns_super_android.sns.View.Main

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.sns_super_android.sns.View.Fragment.chatting.ChattingPageFragment
import com.example.sns_super_android.sns.View.Fragment.mainpage.MainPageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.Fragment.mypage.MypageFragment

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private var bottomNavigationView: BottomNavigationView? = null
    private var fragmentManager: FragmentManager? = null
    private var fragment_main: MainPageFragment? = null
    private val chattingPageFragment: ChattingPageFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById<View> (R.id.main_bottom_navigation) as BottomNavigationView
        bottomNavigationView!!.setOnNavigationItemSelectedListener(this)
        bottomNavigationView!!.selectedItemId = R.id.menu_home
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_home ->{
                val mainPageFragment = MainPageFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.framelayout, mainPageFragment)
                    .commit()
                return true
            }
            R.id.menu_mypage ->{
                val mypageFragment = MypageFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.framelayout, mypageFragment)
                    .commit()
                return true
            }
        }
        return false
    }
}
