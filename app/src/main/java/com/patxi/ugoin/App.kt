package com.patxi.ugoin

import android.app.Application
import com.patxi.ugoin.di.components.AppComponent
import com.patxi.ugoin.di.components.DaggerAppComponent
import com.patxi.ugoin.di.modules.NetModule

class App : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().netModule(NetModule("http://ugoin-elb-188079356.us-west-2.elb.amazonaws.com")).build()
    }

    override fun onCreate() {
        super.onCreate()
    }

}