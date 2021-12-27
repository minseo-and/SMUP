package com.example.sns_super_android.sns.Model.Network

import com.example.sns_super_android.sns.Model.Network.Request.SignupRequest
import com.example.sns_super_android.sns.Model.Network.Response.TokenResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {

    @POST("/api/auth/signup")
    fun registerUsers(@Body registerRequest: SignupRequest): Call<TokenResponse?>
}