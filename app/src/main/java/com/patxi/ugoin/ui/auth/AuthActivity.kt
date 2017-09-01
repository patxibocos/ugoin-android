package com.patxi.ugoin.ui.auth

import android.os.Bundle
import com.patxi.ugoin.R
import com.patxi.ugoin.di.components.DaggerAuthComponent
import com.patxi.ugoin.di.modules.AuthModule
import com.patxi.ugoin.ui.BaseActivity
import com.patxi.ugoin.ui.app
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : BaseActivity() {

    @Inject lateinit var presenter: AuthContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        DaggerAuthComponent.builder().appComponent(app.component).authModule(AuthModule(loginFragment, registerFragment)).build().inject(this)
        loginFragment.presenter = presenter
        registerFragment.presenter = presenter
        presenter.start()
    }

}