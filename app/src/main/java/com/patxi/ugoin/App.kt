package com.patxi.ugoin

import android.app.Application
import com.patxi.ugoin.di.components.AppComponent
import com.patxi.ugoin.di.components.DaggerAppComponent
import com.patxi.ugoin.di.modules.AppModule
import com.patxi.ugoin.di.modules.NetModule

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .netModule(NetModule("http://ugoin-elb-188079356.us-west-2.elb.amazonaws.com/"))
                .build()
    }

}