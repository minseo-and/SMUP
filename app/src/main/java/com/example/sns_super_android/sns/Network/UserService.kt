package com.example.sns_super_android.sns.Network

import com.example.sns_super_android.sns.Network.Request.SignupRequest
import com.example.sns_super_android.sns.Network.Response.TokenResponse
import com.saehyun.trigris_android.feature.login.model.LoginRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {

    @POST("/api/auth/signup")
    fun registerUsers(@Body registerRequest: SignupRequest): Call<TokenResponse?>
}