package com.patxi.ugoin.domain.usecases

import android.content.SharedPreferences
import com.patxi.ugoin.domain.network.AuthInterceptor
import javax.inject.Inject

class CheckAuthStatus @Inject constructor(private val sharedPreferences: SharedPreferences, private val authInterceptor: AuthInterceptor) : BaseUseCase<Boolean> {

    companion object {
        const val AUTH_TOKEN_STORED_KEY = "token"
    }

    override fun execute(): Boolean {
        val token = sharedPreferences.getString(AUTH_TOKEN_STORED_KEY, null)
        authInterceptor.authToken = token
        return !token.isNullOrEmpty()
    }

}