package com.patxi.ugoin.ui.start

import com.patxi.ugoin.domain.usecases.CheckAuthStatus
import javax.inject.Inject

class StartPresenter @Inject constructor(val view: StartContract.View, val checkAuthStatus: CheckAuthStatus) : StartContract.Presenter {

    override fun start() {
        checkAuthStatus.execute()
    }

}