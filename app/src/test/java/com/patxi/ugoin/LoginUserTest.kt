package com.patxi.ugoin

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import com.patxi.ugoin.domain.network.UgoinBackendService
import com.patxi.ugoin.domain.network.model.response.LoginUserResponse
import com.patxi.ugoin.domain.usecases.LoginUser
import okhttp3.ResponseBody
import org.amshove.kluent.shouldEqual
import org.funktionale.either.Either
import org.junit.Before
import org.junit.Test
import retrofit2.Call
import retrofit2.Response

class LoginUserTest {

    private lateinit var loginUser: LoginUser

    private val ugoinBackendService: UgoinBackendService = mock()
    private val response: Call<LoginUserResponse> = mock()

    @Before
    fun setUp() {
        loginUser = LoginUser(ugoinBackendService)
    }

    @Test
    fun successfulLogin() {
        val username = "username"
        val password = "password"
        val token = "token"
        whenever(response.execute()).thenReturn(Response.success(LoginUserResponse(token)))
        whenever(ugoinBackendService.login(any())).thenReturn(response)
        val result = loginUser.execute(username, password)
        result shouldEqual Either.right(token)
    }

    @Test
    fun failedLogin() {
        val error = "error"
        whenever(response.execute()).thenReturn(Response.error(401, ResponseBody.create(null, error)))
        whenever(ugoinBackendService.login(any())).thenReturn(response)
        val result = loginUser.execute("", "")
        result shouldEqual Either.left(error)
    }

}