package com.example.sns_super_android.sns.Network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient{

    lateinit var retrofitService: UserService
        init {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient =
                OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://3.36.108.34:8080")
                .build()

            var server = retrofit.create(UserService::class.java)
        }


    }


