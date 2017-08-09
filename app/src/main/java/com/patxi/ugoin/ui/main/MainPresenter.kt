package com.patxi.ugoin.ui.main

import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.domain.usecases.SampleUseCase
import javax.inject.Inject

@PerActivity
class MainPresenter(val view: MainContract.View) : MainContract.Presenter {

    @Inject lateinit var sampleUseCase: SampleUseCase

    override fun start() {

    }

}