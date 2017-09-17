package com.patxi.ugoin.ui.init

import com.patxi.ugoin.domain.usecases.CheckAuthStatus
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import javax.inject.Inject

class InitPresenter @Inject constructor(val view: InitContract.View, private val checkAuthStatus: CheckAuthStatus) : InitContract.Presenter {

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