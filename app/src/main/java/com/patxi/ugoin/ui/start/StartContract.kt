package com.patxi.ugoin.ui.start

import com.patxi.ugoin.BasePresenter
import com.patxi.ugoin.BaseView

interface StartContract {

    interface View : BaseView<Presenter> {
        fun goToAuthView()
        fun goToUserView()
    }

    interface Presenter : BasePresenter {

    }

}