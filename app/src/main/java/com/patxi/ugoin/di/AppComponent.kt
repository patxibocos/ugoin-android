package com.patxi.ugoin.di

import com.patxi.ugoin.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class))
interface AppComponent {

    fun inject(mainActivity: MainActivity)

}