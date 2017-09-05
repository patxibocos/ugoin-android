package com.patxi.ugoin.ui.session

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R
import com.patxi.ugoin.di.components.DaggerSessionComponent
import com.patxi.ugoin.di.modules.SessionModule
import javax.inject.Inject

class SessionFragment : BaseFragment(), SessionContract.View {

    @Inject override lateinit var presenter: SessionContract.Presenter

    override fun start() {

    }

    override fun toggleToRecording() {

    }

    override fun injectDependencies() {
        DaggerSessionComponent.builder().sessionModule(SessionModule(this)).build().inject(this)
    }

    override fun getLayout() = R.layout.session

}