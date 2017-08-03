package com.patxi.ugoin.session

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.di.DaggerSessionComponent

class SessionFragment : BaseFragment(), SessionContract.View {

    override var presenter: SessionContract.Presenter? = null

    override fun toggleToRecording() {

    }

    override fun injectDependencies() {
        DaggerSessionComponent.builder().build().inject(this)
    }

}