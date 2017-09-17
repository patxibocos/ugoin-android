package com.patxi.ugoin.di.modules

import com.patxi.ugoin.di.scopes.PerActivity
import com.patxi.ugoin.ui.init.InitContract
import com.patxi.ugoin.ui.init.InitPresenter
import dagger.Module
import dagger.Provides

@Module
class InitModule(val view: InitContract.View) {

    @Provides
    @PerActivity
    fun provideView() = view

    @Provides
    @PerActivity
    fun providePresenter(initPresenter: InitPresenter): InitContract.Presenter = initPresenter

}