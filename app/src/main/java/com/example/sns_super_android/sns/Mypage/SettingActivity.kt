package com.example.sns_super_android.sns.Mypage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R

class SettingActivity : AppCompatActivity() {
    private var tv_password: TextView? = null
    private var et_email: EditText? = null
    private var btn_add_email: Button? = null
    private var email: String? = null
    private var mypage_toolbar : Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        tv_password = findViewById<View>(R.id.tv_password_setting) as TextView
        et_email = findViewById<View>(R.id.et_setting_email) as EditText
        btn_add_email = findViewById<View>(R.id.btn_email_setting) as Button
        mypage_toolbar = findViewById<View>(R.id.mypage_toolbar) as Toolbar

        var a = 0
        et_email!!.isEnabled = false
        btn_add_email!!.setOnClickListener {
            a++
            if (a == 1) {
                et_email!!.isEnabled = true
                email = et_email!!.text.toString()
            } else {
                et_email!!.isEnabled = false
                a = 0
            }
        }
        tv_password!!.setOnClickListener {
            val intent = Intent(this, SettingPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}