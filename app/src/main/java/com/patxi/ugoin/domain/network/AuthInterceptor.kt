package com.patxi.ugoin.domain.network

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(val authToken: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest = request.newBuilder()
                .addHeader("token", authToken)
                .build()
        return chain.proceed(newRequest)
    }

}