package com.patxi.ugoin.domain.network

import com.patxi.ugoin.domain.network.model.request.LoginUserRequest
import com.patxi.ugoin.domain.network.model.request.RegisterUserRequest
import com.patxi.ugoin.domain.network.model.response.Follower
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface UgoinBackendService {

    @FormUrlEncoded
    @POST("/user/login")
    fun login(@Body body: LoginUserRequest): Call<String>

    @FormUrlEncoded
    @POST("/user")
    fun register(@Body body: RegisterUserRequest): Call<String>

    @GET("/follows")
    fun getFollows(): Call<List<Follower>>

}