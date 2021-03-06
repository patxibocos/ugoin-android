package com.patxi.ugoin.di.components

import android.content.SharedPreferences
import com.patxi.ugoin.App
import com.patxi.ugoin.di.modules.AppModule
import com.patxi.ugoin.di.modules.NetModule
import com.patxi.ugoin.domain.network.AuthInterceptor
import com.patxi.ugoin.domain.network.UgoinBackendService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class))
interface AppComponent {

    fun authInterceptor(): AuthInterceptor

    fun ugoinBackendService(): UgoinBackendService

    fun sharedPreferences(): SharedPreferences

    fun app(): App

    fun inject(app: App)

}