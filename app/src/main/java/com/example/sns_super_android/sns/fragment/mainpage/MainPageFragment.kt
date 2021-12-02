package com.example.sns.fragment.mainpage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.notice.ui.NoticeViewActivity
import com.example.sns_super_android.sns.schedule.Todays_scheduleActivity

class MainPageFragment : Fragment() {
    private var today_view : View? = null
    private var noticeBell : ImageView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        noticeBell = getView()?.findViewById(R.id.notice_bell)
        noticeBell!!.setOnClickListener {
            val intent_bell = Intent(context, NoticeViewActivity::class.java)
            startActivity(intent_bell)
        }

        today_view = getView()?.findViewById(R.id.main_list)
        today_view!!.setOnClickListener {
            activity.let {
                val intent = Intent(context, Todays_scheduleActivity::class.java)
                startActivity(intent)
            }
        }
    }
}