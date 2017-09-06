package com.patxi.ugoin.domain.network

import com.patxi.ugoin.domain.network.model.Follower
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface UgoinBackendService {

    @FormUrlEncoded
    @POST("/user")
    fun register(@Field("username") username: String, @Field("password") password: String): Call<String>

    @GET("/follows")
    fun getFollows(): Call<List<Follower>>

}