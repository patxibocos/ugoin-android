package com.patxi.ugoin.di.components

import android.app.Activity
import com.patxi.ugoin.di.modules.NetModule
import com.patxi.ugoin.di.scopes.PerActivity
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NetModule::class))
interface AppComponent {

    fun inject(activity: Activity)

    fun retrofit(): Retrofit

}