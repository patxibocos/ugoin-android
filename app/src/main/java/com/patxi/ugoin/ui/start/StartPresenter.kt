package com.patxi.ugoin.ui.start

import com.patxi.ugoin.domain.usecases.CheckAuthStatus
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import javax.inject.Inject

class StartPresenter @Inject constructor(val view: StartContract.View, private val checkAuthStatus: CheckAuthStatus) : StartContract.Presenter {

    override fun start() {
        doAsync {
            val userAuthenticated = checkAuthStatus.execute()
            uiThread {
                if (userAuthenticated) {
                    view.goToUserView()
                } else {
                    view.goToAuthView()
                }
            }
        }
    }

}