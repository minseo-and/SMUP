package com.saehyun.trigris_android.feature.login.model
data class LoginRequest(
    var deviceToken: String,
    var id: String,
    var password: String
)
