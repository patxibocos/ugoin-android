package com.patxi.ugoin.ui.start

import com.patxi.ugoin.Either
import com.patxi.ugoin.domain.usecases.CheckAuthStatus
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import javax.inject.Inject

class StartPresenter @Inject constructor(val view: StartContract.View, private val checkAuthStatus: CheckAuthStatus) : StartContract.Presenter {

    override fun start() {
        doAsync {
            val result = checkAuthStatus.execute()
            uiThread {
                when (result) {
                    is Either.Left -> TODO()
                    is Either.Right -> TODO()
                }
            }
        }
    }

}