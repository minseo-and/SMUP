package com.example.sns_super_android.sns.Model.Network.listner

import com.example.sns_super_android.sns.Model.Network.model.token.TokenResponse

interface TokenListener {
    fun loadToken(tokenResponse: TokenResponse)
    fun onFail()
}