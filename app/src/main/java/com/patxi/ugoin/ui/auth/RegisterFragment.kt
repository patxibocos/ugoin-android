package com.patxi.ugoin.ui.auth

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R
import kotlinx.android.synthetic.main.register.*
import org.jetbrains.anko.support.v4.toast

class RegisterFragment : BaseFragment(), AuthContract.RegisterView {

    override lateinit var presenter: AuthContract.Presenter

    override fun injectDependencies() {

    }

    override fun start() {
        register.setOnClickListener {
            presenter.register(username.text.toString(), password.text.toString())
        }
    }

    override fun getLayout(): Int {
        return R.layout.register
    }

    override fun hide() {

    }

    override fun show() {

    }

    override fun showError(error: String?) {
        error?.let { toast(it) }
    }

}