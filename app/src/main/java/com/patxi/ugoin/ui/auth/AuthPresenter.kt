package com.patxi.ugoin.ui.auth

import javax.inject.Inject

class AuthPresenter @Inject constructor(val loginView: AuthContract.LoginView, val registerView: AuthContract.RegisterView) : AuthContract.Presenter {

    override fun start() {
        loginView.hide()
        registerView.show()
        // TODO Set register fragment as active
        // TODO Set login fragment as inactive
    }

    override fun register(username: String, password: String) {
        // TODO Do request, get token, set interceptor token, go to user activity
    }

    override fun login(username: String, password: String) {

    }

}