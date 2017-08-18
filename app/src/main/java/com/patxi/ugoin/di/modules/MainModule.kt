package com.patxi.ugoin.di.modules

import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.main.MainContract
import com.patxi.ugoin.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule(val view: MainContract.View) {

    @Provides
    @PerActivity
    fun provideView() = view

    @Provides
    @PerActivity
    fun providePresenter(mainPresenter: MainPresenter): MainContract.Presenter = mainPresenter

}