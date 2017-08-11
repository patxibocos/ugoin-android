package com.patxi.ugoin.domain.usecases

import com.patxi.ugoin.domain.network.UgoinBackendService
import com.patxi.ugoin.domain.network.model.Follower
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class SampleUseCase @Inject constructor() {

    @Inject lateinit var ugoinBackendService: UgoinBackendService

    fun bla() {
        ugoinBackendService.getFollows().enqueue(object :Callback<List<Follower>> {
            override fun onFailure(call: Call<List<Follower>>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<List<Follower>>?, response: Response<List<Follower>>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

}