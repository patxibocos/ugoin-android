package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R

class RegisterFragment() : BaseFragment(), AuthContract.RegisterView {

    override lateinit var presenter: AuthContract.Presenter

    override fun injectDependencies() {

    }

    override fun getLayout(): Int {
        return R.layout.register
    }

    override fun hide() {

    }

    override fun show() {

    }

}