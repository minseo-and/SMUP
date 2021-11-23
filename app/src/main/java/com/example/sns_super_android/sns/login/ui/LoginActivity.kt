package com.example.sns.login.ui

import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.WindowManager.*
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.MainActivity
import com.example.sns_super_android.sns.RingTone.RingToneNoticeActivity

class LoginActivity : AppCompatActivity() {
    private var tv_go_register : TextView? = null
    private var btn_login : Button? = null
    private var backKeyPressedTime: Long = 0
    private var toast: Toast? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tv_go_register = findViewById<View>(R.id.tv_go_register) as TextView
        tv_go_register!!.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        btn_login = findViewById<View>(R.id.btn_login) as Button
        btn_login!!.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}