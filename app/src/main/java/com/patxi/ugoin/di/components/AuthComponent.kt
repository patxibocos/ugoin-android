package com.patxi.ugoin.di.components

import com.patxi.ugoin.di.modules.AuthModule
import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.auth.AuthActivity
import dagger.Component

@PerActivity
@Component(modules = arrayOf(AuthModule::class), dependencies = arrayOf(AppComponent::class))
interface AuthComponent {

    fun inject(authActivity: AuthActivity)

}