package com.example.sns_super_android.sns.View.Fragment.mainpage

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.Timetable.TimeTableActivity

class MainPageFragment : Fragment() {
    private var circle_button : Button?=null
    private var tv_week : TextView?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val color = ContextCompat.getColor(R.color.tv_purple_2)
        val str1 = "Black"
        val str2 = "Purple"
        val spannable = SpannableString("$str1$str2")
//        spannable.setSpan(ForegroundColorSpan(color), str1.length, str1.length + str2.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
//        tv_week!!.setText(spannable, TextView.BufferType.SPANNABLE)
        circle_button = getView()?.findViewById(R.id.circle_button)
        circle_button!!.setOnClickListener {
            activity.let {
                val intent = Intent(context, TimeTableActivity::class.java)
                startActivity(intent)
            }
        }

    }

}