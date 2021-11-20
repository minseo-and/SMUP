package com.example.sns_super_android.sns.fragment.mypage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.Mypage.SettingActivity
import com.example.sns_super_android.sns.Mypage.SettingPasswordActivity

class MypageFragment : Fragment() {
    private var btn_setting_account : Button?=null
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mypage, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_setting_account = getView()?.findViewById(R.id.btn_setting_account)
        btn_setting_account!!.setOnClickListener {
            activity.let {
                val intent = Intent(context, SettingActivity::class.java)
                startActivity(intent)
            }
        }
    }
}