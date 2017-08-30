package com.patxi.ugoin.ui.auth

import android.os.Bundle
import com.patxi.ugoin.ui.BaseActivity
import javax.inject.Inject

class AuthActivity : BaseActivity() {

    @Inject lateinit var presenter: AuthContract.Presenter
    lateinit var loginFragment: LoginFragment
    lateinit var registerFragment: RegisterFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO Inject dependencies for this activity
        // TODO Create fragments and set presenters
        /*loginFragment.presenter = presenter
        registerFragment.presenter = presenter*/
    }

}