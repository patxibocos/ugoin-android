package com.patxi.ugoin.di.components

import com.patxi.ugoin.di.modules.AppModule
import com.patxi.ugoin.di.modules.NetModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class))
interface AppComponent {


}