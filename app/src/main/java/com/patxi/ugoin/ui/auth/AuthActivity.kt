package com.patxi.ugoin.ui.auth

import android.os.Bundle
import com.patxi.ugoin.R
import com.patxi.ugoin.addFragment
import com.patxi.ugoin.di.components.DaggerAuthComponent
import com.patxi.ugoin.di.modules.AuthModule
import com.patxi.ugoin.ui.BaseActivity
import com.patxi.ugoin.ui.app
import kotlinx.android.synthetic.main.auth_container.*
import javax.inject.Inject

class AuthActivity : BaseActivity() {

    @Inject lateinit var presenter: AuthContract.Presenter

    private val authFragment = AuthFragment()
    private val loginFragment = LoginFragment()
    private val registerFragment = RegisterFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_container)
        addFragment(authFragment, container.id)
        DaggerAuthComponent.builder().appComponent(app.component).authModule(AuthModule(loginFragment, registerFragment)).build().inject(this)
        authFragment.presenter = presenter
        loginFragment.presenter = presenter
        registerFragment.presenter = presenter
        presenter.start()
    }

}