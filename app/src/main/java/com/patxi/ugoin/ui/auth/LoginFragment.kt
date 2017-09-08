package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R
import com.patxi.ugoin.snack

class LoginFragment : BaseFragment(), AuthContract.LoginView {

    override lateinit var presenter: AuthContract.Presenter

    override fun injectDependencies() {

    }

    override fun start() {

    }

    override fun getLayout(): Int {
        return R.layout.login
    }

    override fun hide() {

    }

    override fun show() {

    }

    override fun showError(error: String?) {
        error?.let { view?.snack(it) { } }
    }

}