package com.example.sns_super_android.sns.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R
import com.example.sns.login.ui.LoginActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class IntroActivity : AppCompatActivity() {
    private var anim01: Animation? = null
    private var anim02: Animation? = null
    private var smallStick: View? = null
    private var bigStick: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        smallStick = findViewById<View>(R.id.last_stick_1)
        anim02 = AnimationUtils.loadAnimation(this, R.anim.intro_anim_2)
        smallStick!!.startAnimation(anim02)

        bigStick = findViewById<View>(R.id.first_stick_1)
        anim01 = AnimationUtils.loadAnimation(this, R.anim.intro_anim)
        bigStick!!.startAnimation(anim01)
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }, 3000)
    }
}