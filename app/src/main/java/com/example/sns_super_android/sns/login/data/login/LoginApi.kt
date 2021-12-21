package com.saehyun.trigris_android.data.login

import com.example.sns_super_android.sns.Network.Response.TokenResponse
import com.saehyun.trigris_android.feature.login.model.LoginRequest
import com.saehyun.trigris_android.feature.login.model.LoginResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface LoginApi {

    // 로그인
    @POST("/api/auth/login")
    fun loginUser(@Body loginRequest: LoginRequest): Call<TokenResponse?>

    // 회원정보 불러오기
    @GET("user")
    fun getInfo(
        @Header("Authorization") accessToken: String) : Call<Response<LoginResponse>>
}