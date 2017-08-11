package com.patxi.ugoin.domain.network

import com.patxi.ugoin.domain.network.model.Follower
import retrofit2.Call
import retrofit2.http.GET

interface UgoinBackendService {

    @GET("/follows")
    fun getFollows(): Call<List<Follower>>

}