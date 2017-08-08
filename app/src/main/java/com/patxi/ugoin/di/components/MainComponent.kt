package com.patxi.ugoin.di.components

import com.patxi.ugoin.di.modules.MainModule
import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.main.MainActivity
import dagger.Component

@PerActivity
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(AppComponent::class))
interface MainComponent {

    fun inject(mainActivity: MainActivity)

}