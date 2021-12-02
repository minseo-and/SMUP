package com.example.sns_super_android.sns.notice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.sns_super_android.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class NoticeActivity : AppCompatActivity() {
    private var spinner_timer: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice)
        spinner_timer = findViewById<View>(R.id.timer_set_spinner) as Spinner
        spinner_timer!!.adapter = ArrayAdapter.createFromResource(this, R.array.timer_array, android.R.layout.simple_spinner_dropdown_item)
        spinner_timer!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(position) {
                    0   ->  {

                    }
                    1   ->  {

                    }
                    //...
                    else -> {

                    }
                }
            }

        }
    }
}