package com.example.sns_super_android.sns.Model.Network

import com.example.sns_super_android.sns.Model.Data.LoginApi
import com.example.sns_super_android.sns.Model.Data.RegisterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl("http://3.36.108.34:8080")
    .build()

val LOGIN_API : LoginApi by lazy {
    retrofit.create(LoginApi::class.java)
}

val REGISTER_API : RegisterApi by lazy {
    retrofit.create(RegisterApi::class.java)
}


