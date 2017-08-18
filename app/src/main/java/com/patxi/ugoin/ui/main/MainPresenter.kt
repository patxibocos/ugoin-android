package com.patxi.ugoin.ui.main

import com.patxi.ugoin.domain.usecases.SampleUseCase
import javax.inject.Inject

class MainPresenter @Inject constructor(val view: MainContract.View, val sampleUseCase: SampleUseCase) : MainContract.Presenter {

    override fun start() {

    }

    override fun whatever() {
        sampleUseCase.bla()
    }

}