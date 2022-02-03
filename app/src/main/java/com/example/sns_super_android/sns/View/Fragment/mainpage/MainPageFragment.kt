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
import androidx.fragment.app.FragmentTransaction
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.StartSelect.StartSelectActivity
import com.example.sns_super_android.sns.View.Timetable.TimeTableActivity
import java.lang.reflect.Array.newInstance
import java.time.LocalTime
import java.util.*
import javax.xml.datatype.DatatypeFactory.newInstance
import kotlin.concurrent.timer

class MainPageFragment : Fragment() {

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

        tv_time = getView()?.findViewById(R.id.tv_real_time)
        main_rg = getView()?.findViewById(R.id.main_radio_group)


        main_rg!!.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {

                R.id.btn_schedule -> {
                    val mainPageScheduleFragment = MainPageScheduleFragment()
                    childFragmentManager.beginTransaction()
                        .replace(R.id.mainpage_frame, mainPageScheduleFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.btn_meal -> {
                    val mainPageMealFragment = MainPageMealFragment()
                    childFragmentManager.beginTransaction()
                        .replace(R.id.mainpage_frame, mainPageMealFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }
        }

    }
}