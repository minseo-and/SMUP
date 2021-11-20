package com.example.sns.login.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.fragment.signup.SignUpFragment

class SignUpActivity : AppCompatActivity() {
    private var btn_skip : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btn_skip = findViewById<View>(R.id.btn_skip) as Button
        btn_skip!!.setOnClickListener{
            setFrag(0)
        }

    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum)
        {
            0 -> {
                ft.replace(R.id.signup_frameLayout, SignUpFragment()).commit()
            }
        }
    }
}