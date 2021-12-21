package com.example.sns_super_android.sns.fragment.mainpage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.Mypage.SettingActivity
import com.example.sns_super_android.sns.schedule.Todays_scheduleActivity
import com.example.sns_super_android.sns.timetable.TimeTableActivity

class MainPageFragment : Fragment() {
    private var circle_button : Button?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        circle_button = getView()?.findViewById(R.id.circle_button)
        circle_button!!.setOnClickListener {
            activity.let {
                val intent = Intent(context, TimeTableActivity::class.java)
                startActivity(intent)
            }
        }

    }
}