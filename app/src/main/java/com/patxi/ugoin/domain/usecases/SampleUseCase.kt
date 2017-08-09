package com.patxi.ugoin.domain.usecases

import retrofit2.Retrofit
import javax.inject.Inject

class SampleUseCase @Inject constructor() {

    @Inject lateinit var retrofit: Retrofit

}