package com.patxi.ugoin.domain.usecases

import com.patxi.ugoin.domain.network.UgoinBackendService
import com.patxi.ugoin.domain.network.model.request.LoginUserRequest
import org.funktionale.either.Either
import javax.inject.Inject

class LoginUser @Inject constructor(private val ugoinBackendService: UgoinBackendService) {

    fun execute(username: String, password: String): Either<String?, String?> {
        val response = ugoinBackendService.login(LoginUserRequest(username, password)).execute()
        return when (response.code()) {
            200 -> Either.right(response.body()?.token)
            else -> Either.left(response.errorBody()?.string())
        }
    }

}