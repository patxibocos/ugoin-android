package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R

class AuthFragment : BaseFragment(), AuthContract.AuthView {

    override lateinit var presenter: AuthContract.Presenter

    override fun injectDependencies() {

    }

    override fun start() {

    }

    override fun getLayout(): Int {
        return R.layout.auth
    }

    override fun goToLogin() {

    }

    override fun goToRegister() {

    }

}