package com.patxi.ugoin.ui.auth

import javax.inject.Inject

class AuthPresenter @Inject constructor(val loginView: AuthContract.LoginView, val registerView: AuthContract.RegisterView) : AuthContract.Presenter {

    override fun start() {

    }

}