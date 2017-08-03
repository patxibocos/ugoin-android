package com.patxi.ugoin.session

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.di.DaggerSessionComponent
import com.patxi.ugoin.di.SessionModule
import javax.inject.Inject

class SessionFragment : BaseFragment(), SessionContract.View {

    @Inject override lateinit var presenter: SessionContract.Presenter

    override fun toggleToRecording() {

    }

    override fun injectDependencies() {
        DaggerSessionComponent.builder().sessionModule(SessionModule(this)).build().inject(this)
    }

}