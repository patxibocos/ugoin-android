package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R
import kotlinx.android.synthetic.main.auth.*

class AuthFragment : BaseFragment() {

    lateinit var presenter: AuthContract.Presenter

    override fun injectDependencies() {

    }

    override fun start() {
        login_button.setOnClickListener { presenter.login() }
        register_button.setOnClickListener { presenter.register() }
    }

    override fun getLayout(): Int {
        return R.layout.auth
    }

}