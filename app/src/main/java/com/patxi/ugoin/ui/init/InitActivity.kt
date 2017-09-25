package com.patxi.ugoin.ui.init

import android.os.Bundle
import com.patxi.ugoin.App
import com.patxi.ugoin.di.components.DaggerInitComponent
import com.patxi.ugoin.di.modules.InitModule
import com.patxi.ugoin.startActivity
import com.patxi.ugoin.ui.BaseActivity
import com.patxi.ugoin.ui.auth.AuthActivity
import com.patxi.ugoin.ui.main.MainActivity
import javax.inject.Inject

class InitActivity : BaseActivity(), InitContract.View {

    @Inject override lateinit var presenter: InitContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appComponent = (application as App).component
        DaggerInitComponent.builder().appComponent(appComponent).initModule(InitModule(this)).build().inject(this)
        presenter.start()
    }

    override fun goToAuthView() {
        startActivity<AuthActivity>()
    }

    override fun goToUserView() {
        startActivity<MainActivity>()
    }

}