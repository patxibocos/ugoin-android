package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.domain.network.AuthInterceptor
import com.patxi.ugoin.domain.usecases.RegisterUser
import org.funktionale.either.Either
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import javax.inject.Inject

class AuthPresenter @Inject constructor(private val loginView: AuthContract.LoginView, private val registerView: AuthContract.RegisterView, private val registerUser: RegisterUser, private val authInterceptor: AuthInterceptor) : AuthContract.Presenter {

    override fun start() {
        loginView.hide()
        registerView.show()
    }

    override fun register(username: String, password: String) {
        doAsync {
            val result = registerUser.execute(username, password)
            uiThread {
                when (result) {
                    is Either.Left -> registerView.showError(result.left().get())
                    is Either.Right -> {
                        authInterceptor.authToken = result.right().get()
                        // TODO Go to main
                    }
                }
            }
        }

    }

    override fun login(username: String, password: String) {

    }

}