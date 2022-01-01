package com.example.sns_super_android.sns.View.Login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.sns.View.SignUp.SignUpActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.Main.MainActivity
import com.example.sns_super_android.sns.Model.Network.model.login.LoginRequest
import com.example.sns_super_android.sns.ViewModel.Login.LoginViewModel


class LoginActivity : AppCompatActivity() {

    private var tv_go_register: TextView? = null
    private var et_id: EditText? = null
    private var et_password: EditText? = null

    private val vm: LoginViewModel = LoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        observe()

        et_id = findViewById<View>(R.id.et_write_id) as EditText
        et_password = findViewById<View>(R.id.et_write_password) as EditText
        tv_go_register = findViewById<View>(R.id.tv_go_register) as TextView
        tv_go_register!!.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.btn_login).setOnClickListener {
            login()
//            val id = et_id!!.text.toString().trim()
//            val password = et_password!!.text.toString().trim()
//
//            if (id.isEmpty()){
//                et_id!!.error = "비어있음"
//                et_id!!.requestFocus()
//                return@setOnClickListener
//            }
//            if (password.isEmpty()){
//                et_password!!.error = "비어있음"
//                et_password!!.requestFocus()
//                return@setOnClickListener
//            }
//
//             else if (TextUtils.isEmpty(et_id!!.text.toString()) ||
//                TextUtils.isEmpty(et_password!!.text.toString())
//            ) {
//
//            } else {
//
//            }

        }
    }

    private fun login() {
        val id = et_id!!.text.toString().trim()
        val password = et_password!!.text.toString().trim()

        if (id.isEmpty()) {
            et_id!!.error = "비어있음"
            et_id!!.requestFocus()
        } else if (password.isEmpty()) {
            et_password!!.error = "비어있음"
            et_password!!.requestFocus()
        } else if (id.isNotEmpty() && password.isNotEmpty()) {
            vm.login(LoginRequest("DEVICE_TOKEN", id, password))
        } else {
            val message = "빈칸을 채워주세요"
            Toast.makeText(this@LoginActivity, message, Toast.LENGTH_LONG).show()
        }
    }

    private fun observe() {
        vm.success.observe(this, {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        })

        vm.failed.observe(this, {
            Toast.makeText(applicationContext, "error", Toast.LENGTH_SHORT).show()
        })
    }
}

