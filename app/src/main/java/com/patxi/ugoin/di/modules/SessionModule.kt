package com.patxi.ugoin.di.modules

import com.patxi.ugoin.ui.session.SessionContract
import com.patxi.ugoin.ui.session.SessionPresenter
import dagger.Module
import dagger.Provides

@Module
class SessionModule(val view: SessionContract.View) {

    @Provides
    fun provideView() = view

    @Provides
    fun providePresenter(): SessionContract.Presenter = SessionPresenter(view)

}