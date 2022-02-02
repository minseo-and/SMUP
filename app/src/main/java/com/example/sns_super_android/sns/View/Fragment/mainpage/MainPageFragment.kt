package com.example.sns_super_android.sns.View.Fragment.mainpage

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.SpannableString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.StartSelect.StartSelectActivity
import com.example.sns_super_android.sns.View.Timetable.TimeTableActivity
import java.time.LocalTime
import java.util.*
import kotlin.concurrent.timer

class MainPageFragment : Fragment() {
    private var CurrentProgress = 0
    private var progressBar: ProgressBar? = null
    private var tv_time : TextView ?= null
    private var main_rg : RadioGroup ?= null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        progressBar = getView()?.findViewById(R.id.circle_progressbar)
        tv_time = getView()?.findViewById(R.id.tv_real_time)
        main_rg = getView()?.findViewById(R.id.main_radio_group)

        val anim = AnimationUtils.loadAnimation(context, // Fragmet에서 사용이 안되는 함수는 뺴버리고 context로 대체
            // getApplicationContext(),  // 현재 화면의 제어권자
            R.anim.rotate_anim
        ) // 설정한 애니메이션 파일

        main_rg!!.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.btn_schedule -> {
                   val mainPageScheduleFragment = MainPageScheduleFragment()


                }
            }
        }

        val timer = Timer()


        val timerTask: TimerTask = object : TimerTask() {
            override fun run() {

                CurrentProgress = CurrentProgress + 1
                progressBar!!.setProgress(CurrentProgress)
                progressBar!!.setMax(60)
                if (CurrentProgress >= 60) {
                    CurrentProgress = 0
                }
            }
        }
        timer.schedule(timerTask, 0, 1000)
    }
}