package com.example.sns_super_android.sns.login.ui;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_super_android.R;

public class d extends AppCompatActivity {
    private TextView time;
    Integer minute = 5;
    Integer second = 60;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        time.setText(minute + "");
        String timer = (minute + "" + second);

    }
}
