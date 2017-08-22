package com.patxi.ugoin.di.modules

import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.start.StartContract
import com.patxi.ugoin.ui.start.StartPresenter
import dagger.Module
import dagger.Provides

@Module
class StartModule(val view: StartContract.View) {

    @Provides
    @PerActivity
    fun provideView() = view

    @Provides
    @PerActivity
    fun providePresenter(startPresenter: StartPresenter): StartContract.Presenter = startPresenter

}