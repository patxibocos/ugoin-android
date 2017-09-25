package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.BasePresenter
import com.patxi.ugoin.BaseView

class AuthContract {

    interface AuthView : BaseView<Presenter> {
        fun goToLogin()
        fun goToRegister()
    }

    interface LoginView : BaseView<Presenter> {
        fun hide()
        fun show()
        fun showError(error: String?)
    }

    interface RegisterView : BaseView<Presenter> {
        fun hide()
        fun show()
        fun showError(error: String?)
    }

    interface Presenter : BasePresenter {
        fun login()
        fun register()
        fun login(username: String, password: String)
        fun register(username: String, password: String)
    }

}