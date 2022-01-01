package com.example.sns_super_android.sns.Model.Network

import com.example.sns_super_android.sns.Model.Network.model.signup.SignupRequest
import com.example.sns_super_android.sns.Model.Network.model.token.TokenResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {

    @POST("/api/auth/signup")
    fun registerUsers(@Body registerRequest: SignupRequest): Call<TokenResponse?>
}