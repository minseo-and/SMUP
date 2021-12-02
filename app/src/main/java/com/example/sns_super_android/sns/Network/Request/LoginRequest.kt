package com.example.sns_super_android.sns.Network.Request

data class LoginRequest(
    var deviceToken: String,
    var id: String,
    var password: String
)
