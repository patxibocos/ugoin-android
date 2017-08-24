package com.patxi.ugoin.domain.usecases

import android.content.SharedPreferences
import com.patxi.ugoin.Either
import javax.inject.Inject

class CheckAuthStatus @Inject constructor() : BaseUseCase<String>() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun execute(): Either<String, String> {
        return Either.Right("All right")
    }

}