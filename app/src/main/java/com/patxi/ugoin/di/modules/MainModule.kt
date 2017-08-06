package com.patxi.ugoin.di.modules

import com.patxi.ugoin.ui.main.MainContract
import com.patxi.ugoin.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module class MainModule(val view: MainContract.View) {

    @Provides fun provideView() = view

    @Provides fun providePresenter(): MainContract.Presenter = MainPresenter(view)

}