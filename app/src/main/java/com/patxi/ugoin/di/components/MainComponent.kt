package com.patxi.ugoin.di.components

import com.patxi.ugoin.ui.main.MainActivity
import com.patxi.ugoin.di.modules.MainModule
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent {

    fun inject(mainActivity: MainActivity)

}