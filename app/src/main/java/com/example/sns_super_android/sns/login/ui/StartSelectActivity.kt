package com.example.sns_super_android.sns.login.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.sns.login.ui.LoginActivity
import com.example.sns.login.ui.SignUpActivity
import com.example.sns.login.ui.TeacherLoginActivity
import com.example.sns_super_android.R

class StartSelectActivity : AppCompatActivity() {
    private var tv_user : TextView? = null
    private var tv_no_user : TextView? = null
    private var tv_teacher : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_select)
        tv_user = findViewById<View>(R.id.tv_go_login) as TextView
        tv_no_user = findViewById<View>(R.id.tv_go_sign_up) as TextView
        tv_teacher = findViewById<View>(R.id.tv_teacher_check) as TextView

        tv_user!!.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        tv_no_user!!.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        tv_teacher!!.setOnClickListener {
            val intent = Intent(this, TeacherLoginActivity::class.java)
            startActivity(intent)
        }
    }
}