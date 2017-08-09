package com.patxi.ugoin.ui.main

import com.patxi.ugoin.BasePresenter
import com.patxi.ugoin.BaseView

interface MainContract {

    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter {
        fun whatever()
    }

}