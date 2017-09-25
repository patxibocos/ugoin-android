package com.patxi.ugoin.di.modules

import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.auth.AuthContract
import com.patxi.ugoin.ui.auth.AuthPresenter
import dagger.Module
import dagger.Provides

@Module
class AuthModule(private val authView: AuthContract.AuthView, private val loginView: AuthContract.LoginView, private val registerView: AuthContract.RegisterView) {

    @Provides
    @PerActivity
    fun provideAuthView() = authView

    @Provides
    @PerActivity
    fun provideLoginView() = loginView

    @Provides
    @PerActivity
    fun provideRegisterView() = registerView

    @Provides
    @PerActivity
    fun providePresenter(authPresenter: AuthPresenter): AuthContract.Presenter = authPresenter

}