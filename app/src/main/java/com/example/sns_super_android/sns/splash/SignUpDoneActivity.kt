package com.example.sns_super_android.sns.splash

import android.content.Intent
import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.example.sns.login.ui.LoginActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.MainActivity

class SignUpDoneActivity : AppCompatActivity() {
    private var check_done: ImageView? = null

    var avd: AnimatedVectorDrawableCompat? = null
    var avd2: AnimatedVectorDrawable? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_done)
        check_done = findViewById<View>(R.id.check_anim) as ImageView
        val drawable = check_done!!.getDrawable()
        val handler = Handler()
        if (drawable is AnimatedVectorDrawableCompat) {
            avd = drawable
            avd!!.start()
        } else if (drawable is AnimatedVectorDrawable) {
            avd2 = drawable
            avd2!!.start()
        }
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 800)
    }
}