package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.domain.network.AuthInterceptor
import com.patxi.ugoin.domain.usecases.LoginUser
import com.patxi.ugoin.domain.usecases.RegisterUser
import org.funktionale.either.Either
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import javax.inject.Inject

class AuthPresenter @Inject constructor(private val loginView: AuthContract.LoginView, private val registerView: AuthContract.RegisterView, private val loginUser: LoginUser, private val registerUser: RegisterUser, private val authInterceptor: AuthInterceptor) : AuthContract.Presenter {

    override fun start() {
    }

    override fun register(username: String, password: String) {
        doAsync {
            val response = registerUser.execute(username, password)
            uiThread {
                handleRegisterUserResponse(response)
            }
        }
    }

    override fun login(username: String, password: String) {
        doAsync {
            val response = loginUser.execute(username, password)
            uiThread {
                handleLoginUserResponse(response)
            }
        }
    }

    private fun handleRegisterUserResponse(response: Either<String?, String?>) {
        when (response) {
            is Either.Left -> registerView.showError(response.left().get())
            is Either.Right -> {
                authInterceptor.authToken = response.right().get()
                goToMain()
            }
        }
    }

    private fun handleLoginUserResponse(response: Either<String?, String?>) {
        when (response) {
            is Either.Left -> loginView.showError(response.left().get())
            is Either.Right -> {
                authInterceptor.authToken = response.right().get()
                goToMain()
            }
        }
    }

    private fun goToMain() {
        // TODO Go to main
    }

}