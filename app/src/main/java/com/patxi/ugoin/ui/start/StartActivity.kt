package com.patxi.ugoin.ui.start

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.patxi.ugoin.App
import com.patxi.ugoin.di.components.DaggerStartComponent
import com.patxi.ugoin.di.modules.StartModule
import javax.inject.Inject

class StartActivity : AppCompatActivity(), StartContract.View {

    @Inject override lateinit var presenter: StartContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appComponent = (application as App).component
        DaggerStartComponent.builder().appComponent(appComponent).startModule(StartModule(this)).build().inject(this)
    }

}