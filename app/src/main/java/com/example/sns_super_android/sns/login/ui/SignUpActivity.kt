package com.example.sns.login.ui

import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.fragment.signup.SignUpFragment
import kotlin.math.ceil

class SignUpActivity : AppCompatActivity() {
    private var btn_skip : Button? = null
    private var checkbox_view : CheckBox? = null
    private var et_password : EditText? = null
    private var et_password_again : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        et_password = findViewById<View>(R.id.make_password) as EditText
        et_password_again = findViewById<View>(R.id.make_password_again) as EditText
        checkbox_view = findViewById<View>(R.id.view_password) as CheckBox
        checkbox_view!!.setOnCheckedChangeListener { buttonView, isChecked ->
            // 체크박스가 체크 안될 경우.
            if (isChecked) {
                // 입력한 패스워드 문자가 출력됨 (ex . 5456)
                et_password!!.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                // 입력한 패스워드의 문자가 보이지 않음 (ex. ****)
                et_password!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            et_password!!.setSelection(et_password!!.text.length)
        }
        btn_skip = findViewById<View>(R.id.btn_skip) as Button
        btn_skip!!.setOnClickListener{
            val get_password = et_password!!.text.toString()
            val get_password_again = et_password_again!!.text.toString()
            if (et_password!!.length() < 6){
                var t1 = Toast.makeText(this, "비밀번호를 6자 이상 입력해주세요", Toast.LENGTH_SHORT)
                t1.show()
            } else if (get_password != get_password_again){
                var t2 = Toast.makeText(this, "비밀번호가 일치하지 않습니다", Toast.LENGTH_SHORT)
                t2.show()
            }
            else setFrag(0)
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