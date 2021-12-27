package com.example.sns_super_android.sns.Model.Network

import com.example.sns_super_android.sns.Model.Data.LoginApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit: Retrofit = Retrofit.Builder().apply {
    baseUrl("http://3.36.108.34:8080")
    addConverterFactory(GsonConverterFactory.create())
}.build()

val LOGIN_API : LoginApi by lazy {
    retrofit.create(LoginApi::class.java)
}
class ApiClient {

    private val userService: UserService

    init {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://3.36.108.34:8080")
            .build()

        userService = retrofit.create(UserService::class.java)
    }


}


