package com.example.sns_super_android.sns.View.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.StartSelect.StartSelectActivity

class IntroActivity : AppCompatActivity() {
    private var anim01: Animation? = null
    private var anim02: Animation? = null
    private var smallStick: View? = null
    private var bigStick: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, StartSelectActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}