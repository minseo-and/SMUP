package com.example.sns.login.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.MainActivity
import com.example.sns_super_android.sns.Network.Request.LoginRequest
import com.example.sns_super_android.sns.login.data.LoginRepository
import com.example.sns_super_android.sns.login.data.SharedPref

class TeacherLoginActivity : AppCompatActivity() {
    private var tv_teacher_go_register : TextView? = null
    private var btn_teacher_login : Button? = null
    private var et_teacher_id : EditText? = null
    private var et_teacher_password : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_login)
        et_teacher_id = findViewById<View>(R.id.et_write_teacher_id) as EditText
        et_teacher_password = findViewById<View>(R.id.et_write_teacher_password) as EditText
        tv_teacher_go_register = findViewById<View>(R.id.tv_go_register_teacher) as TextView
        tv_teacher_go_register!!.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        SharedPref.openSharedPrep(this)
        btn_teacher_login = findViewById<View>(R.id.btn_login_teacher) as Button
        btn_teacher_login!!.setOnClickListener{
            val id = et_teacher_id!!.text.toString().trim()
            val password = et_teacher_password!!.text.toString().trim()

            if (id.isEmpty()){
                et_teacher_id!!.error = "비어있음"
                et_teacher_id!!.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()){
                et_teacher_password!!.error = "비어있음"
                et_teacher_password!!.requestFocus()
                return@setOnClickListener
            }

            else {
//                val loginRequest = LoginRequest(id, password)
//                loginRequest.id
//                loginRequest.password
//                LoginRepository(loginRequest)
            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

