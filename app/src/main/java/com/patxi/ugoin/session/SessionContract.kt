package com.patxi.ugoin.session

import com.patxi.ugoin.BasePresenter
import com.patxi.ugoin.BaseView

interface SessionContract {

    interface View : BaseView<Presenter> {
        fun toggleToRecording()
    }

    interface Presenter: BasePresenter {
        fun startRecording()
    }

}