package com.patxi.ugoin.di

import com.patxi.ugoin.session.SessionFragment
import dagger.Component

@Component(modules = arrayOf(SessionModule::class))
interface SessionComponent {
    fun inject(sessionFragment: SessionFragment)
}