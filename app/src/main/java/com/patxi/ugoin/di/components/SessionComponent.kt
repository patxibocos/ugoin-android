package com.patxi.ugoin.di.components

import com.patxi.ugoin.di.modules.SessionModule
import com.patxi.ugoin.ui.session.SessionFragment
import dagger.Component

@Component(modules = arrayOf(SessionModule::class))
interface SessionComponent {

    fun inject(sessionFragment: SessionFragment)

}