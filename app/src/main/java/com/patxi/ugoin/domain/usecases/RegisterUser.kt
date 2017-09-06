package com.patxi.ugoin.domain.usecases

import com.patxi.ugoin.domain.network.UgoinBackendService
import org.funktionale.either.Either
import javax.inject.Inject

class RegisterUser @Inject constructor(private val ugoinBackendService: UgoinBackendService) {

    fun execute(username: String, password: String): Either<String?, String?> {
        val result = ugoinBackendService.register(username, password).execute()
        return when (result.code()) {
            200 -> Either.right(result.body())
            400 -> Either.left(result.errorBody()?.string())
            else -> {
                Either.left("Error")
            }
        }
    }

}