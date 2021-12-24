package com.example.sns_super_android.sns.fragment.mypage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.sns.login.ui.LoginActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.Mypage.SettingActivity
import com.example.sns_super_android.sns.notice.ui.NoticeActivity

class MypageFragment : Fragment() {
    private var btn_setting_account : Button?=null
    private var btn_setting_school : Button?=null
    private var btn_setting_notice : Button?=null
    private var btn_logout : Button?=null
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mypage, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_setting_account = getView()?.findViewById(R.id.btn_setting_account_2)
        btn_setting_account!!.setOnClickListener {
            activity.let {
                val intent = Intent(context, SettingActivity::class.java)
                startActivity(intent)
            }
        }

        btn_setting_notice = getView()?.findViewById(R.id.btn_setting_notice_2)
        btn_setting_notice!!.setOnClickListener {
            activity.let {
                val intent = Intent(context, NoticeActivity::class.java)
                startActivity(intent)
            }
        }

        btn_logout = getView()?.findViewById(R.id.btn_logout)
        btn_logout!!.setOnClickListener {
            activity.let {
                val intent = Intent(context, LoginActivity::class.java)
                startActivity(intent)
                activity?.finish()
            }
        }
    }
}