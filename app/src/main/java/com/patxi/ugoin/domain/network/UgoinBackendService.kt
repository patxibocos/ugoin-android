package com.patxi.ugoin.domain.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UgoinBackendService {

    @GET("/test")
    fun test(@Query("a") a: String): Call<Unit>

}