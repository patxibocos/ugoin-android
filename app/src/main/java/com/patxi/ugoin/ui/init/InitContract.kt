package com.patxi.ugoin.ui.init

import com.patxi.ugoin.BasePresenter
import com.patxi.ugoin.BaseView

interface InitContract {

    interface View : BaseView<Presenter> {
        fun goToAuthView()
        fun goToUserView()
    }

    interface Presenter : BasePresenter {

    }

}