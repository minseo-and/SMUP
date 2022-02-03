package com.example.sns_super_android.sns.View.Fragment.mainpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ProgressBar
import com.example.sns_super_android.R
import java.util.*

class MainPageScheduleFragment : Fragment() {
    private var CurrentProgress = 0
    private var progressBar: ProgressBar? = null
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_page_schedule, container, false)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val timer = Timer()
        progressBar = getView()?.findViewById(R.id.circle_progressbar)

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