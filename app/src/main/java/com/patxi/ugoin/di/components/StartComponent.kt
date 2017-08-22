package com.patxi.ugoin.di.components

import com.patxi.ugoin.di.modules.StartModule
import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.start.StartActivity
import dagger.Component

@PerActivity
@Component(modules = arrayOf(StartModule::class), dependencies = arrayOf(AppComponent::class))
interface StartComponent {

    fun inject(startActivity: StartActivity)

}