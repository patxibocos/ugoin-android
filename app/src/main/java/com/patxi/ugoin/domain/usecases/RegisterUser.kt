package com.patxi.ugoin.domain.usecases

import com.patxi.ugoin.domain.network.UgoinBackendService
import org.funktionale.either.Either
import javax.inject.Inject

class RegisterUser @Inject constructor(private val ugoinBackendService: UgoinBackendService) {

    fun execute(username: String, password: String): Either<String?, String?> {
        val response = ugoinBackendService.register(username, password).execute()
        return when (response.code()) {
            200 -> Either.right(response.body())
            else -> Either.left(response.errorBody()?.string())
        }
    }

}