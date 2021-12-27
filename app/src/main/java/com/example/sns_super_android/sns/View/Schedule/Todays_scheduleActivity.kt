package com.example.sns_super_android.sns.View.Schedule

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.View.Schedule.model.TodayDecorator
import com.prolificinteractive.materialcalendarview.MaterialCalendarView

class Todays_scheduleActivity : AppCompatActivity() {
    private var calendarView: MaterialCalendarView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todays_schedule)
        calendarView = findViewById<View>(R.id.calender) as MaterialCalendarView
        val todayDecorator = TodayDecorator(this)
    }
}