package com.patxi.ugoin.domain.usecases

import com.patxi.ugoin.domain.network.UgoinBackendService
import com.patxi.ugoin.domain.network.model.request.RegisterUserRequest
import kategory.Either
import javax.inject.Inject

class RegisterUser @Inject constructor(private val ugoinBackendService: UgoinBackendService) {

    fun execute(username: String, password: String): Either<String?, String?> {
        val response = ugoinBackendService.register(RegisterUserRequest(username, password)).execute()
        return when (response.code()) {
            200 -> Either.Right(response.body()?.token)
            else -> Either.Left(response.errorBody()?.string())
        }
    }

}