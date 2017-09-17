package com.patxi.ugoin.di.components

import com.patxi.ugoin.di.modules.InitModule
import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.init.InitActivity
import dagger.Component

@PerActivity
@Component(modules = arrayOf(InitModule::class), dependencies = arrayOf(AppComponent::class))
interface InitComponent {

    fun inject(initActivity: InitActivity)

}