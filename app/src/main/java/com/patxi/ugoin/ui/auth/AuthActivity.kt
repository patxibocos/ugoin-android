package com.patxi.ugoin.ui.auth

import android.os.Bundle
import com.patxi.ugoin.R
import com.patxi.ugoin.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : BaseActivity() {

    @Inject lateinit var presenter: AuthContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        // TODO Inject dependencies for this activity
        loginFragment.presenter = presenter
        registerFragment.presenter = presenter
        presenter.start()
    }

}