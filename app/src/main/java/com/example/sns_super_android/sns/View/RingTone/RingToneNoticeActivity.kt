package com.example.sns_super_android.sns.View.RingTone

import android.media.Ringtone
import android.media.RingtoneManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ebanx.swipebtn.SwipeButton
import com.example.sns_super_android.R

class RingToneNoticeActivity : AppCompatActivity() {
    private var swipeButton : SwipeButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ring_tone_notice)
        try{
            val notification: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val r1 : Ringtone = RingtoneManager.getRingtone(this, notification)
            r1.play()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        swipeButton = findViewById<View> (R.id.swipe_button) as SwipeButton
        swipeButton!!.setOnStateChangeListener {
            onBackPressed()
        }
    }
}