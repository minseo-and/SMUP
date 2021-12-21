package com.example.sns_super_android.sns.Network.listner

import com.example.sns_super_android.sns.Network.Response.TokenResponse

interface TokenListener {
    fun loadToken(tokenResponse: TokenResponse)
    fun onFail()
}