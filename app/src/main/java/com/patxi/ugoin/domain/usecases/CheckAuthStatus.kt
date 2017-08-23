package com.patxi.ugoin.domain.usecases

import android.content.SharedPreferences
import javax.inject.Inject

class CheckAuthStatus @Inject constructor() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    fun execute() {

    }

}