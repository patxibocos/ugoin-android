package com.patxi.ugoin.activity

import com.patxi.ugoin.BasePresenter
import com.patxi.ugoin.BaseView

interface ActivityContract {

    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter {

    }

}