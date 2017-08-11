package com.patxi.ugoin.domain.network

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(val authToken: String) : Interceptor {

    companion object {
        const val TOKEN_HEADER_KEY = "token"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest = request.newBuilder()
                .addHeader(TOKEN_HEADER_KEY, authToken)
                .build()
        return chain.proceed(newRequest)
    }

}