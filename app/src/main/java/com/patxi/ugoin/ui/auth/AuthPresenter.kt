package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.domain.usecases.RegisterUser
import javax.inject.Inject

class AuthPresenter @Inject constructor(private val loginView: AuthContract.LoginView, private val registerView: AuthContract.RegisterView, private val registerUser: RegisterUser) : AuthContract.Presenter {

    override fun start() {
        loginView.hide()
        registerView.show()
    }

    override fun register(username: String, password: String) {
        registerUser.execute(username, password)
    }

    override fun login(username: String, password: String) {

    }

}