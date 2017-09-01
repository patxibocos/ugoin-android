package com.patxi.ugoin.di.modules

import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.auth.AuthContract
import com.patxi.ugoin.ui.auth.AuthPresenter
import dagger.Module
import dagger.Provides

@Module
class AuthModule(val loginView: AuthContract.LoginView, val registerView: AuthContract.RegisterView) {

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