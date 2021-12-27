package com.example.sns_super_android.sns.View.Fragment.signup

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.Splash.SignUpDoneActivity

class SignUpFragment : Fragment() {
    private var btn_sign_up_done : Button? = null
    private var et_birth : EditText? = null
    private var et_nickname : EditText? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_sign_up_done = getView()?.findViewById(R.id.btn_skip_done)
        et_birth = getView()?.findViewById(R.id.make_birth)
        et_nickname = getView()?.findViewById(R.id.make_nickname)
        val birth = et_birth!!.text.toString().trim()
        val nickname = et_nickname!!.text.toString().trim()
        btn_sign_up_done!!.setOnClickListener {
            if (birth.isEmpty()){
                et_birth!!.error = "비어있음"
                et_birth!!.requestFocus()
                return@setOnClickListener
            }
            if (nickname.isEmpty()){
                et_nickname!!.error = "비어있음"
                et_nickname!!.requestFocus()
                return@setOnClickListener
            }
            val intent = Intent(context, SignUpDoneActivity::class.java)
            startActivity(intent)
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.remove(this)
                ?.commit()
        }
    }
}