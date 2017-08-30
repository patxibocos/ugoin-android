package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R

class RegisterFragment() : BaseFragment(), AuthContract.LoginView {

    override lateinit var presenter: AuthContract.Presenter

    override fun injectDependencies() {

    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

}