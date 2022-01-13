package com.example.sns_super_android.sns.View.StartSelect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.sns_super_android.sns.View.Login.LoginActivity
import com.example.sns_super_android.sns.View.SignUp.SignUpActivity
import com.example.sns_super_android.sns.View.Login.TeacherLoginActivity
import com.example.sns_super_android.R

class StartSelectActivity : AppCompatActivity() {
    private var go_login : Button ?= null
    private var go_signup : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_select)
        go_login= findViewById<View>(R.id.btn_go_login) as Button
        go_signup = findViewById<View>(R.id.btn_go_signup) as Button

        go_login!!.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        go_signup!!.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}