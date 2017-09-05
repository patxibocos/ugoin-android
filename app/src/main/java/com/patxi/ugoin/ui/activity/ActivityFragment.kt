package com.patxi.ugoin.ui.activity

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R
import javax.inject.Inject

class ActivityFragment : BaseFragment(), ActivityContract.View {

    @Inject override lateinit var presenter: ActivityContract.Presenter

    override fun injectDependencies() {

    }

    override fun start() {

    }

    override fun getLayout() = R.layout.activity

}