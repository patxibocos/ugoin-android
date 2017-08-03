package com.patxi.ugoin.di

import com.patxi.ugoin.session.SessionContract
import com.patxi.ugoin.session.SessionPresenter
import dagger.Module
import dagger.Provides

@Module class SessionModule(val view: SessionContract.View) {

    @Provides fun provideView() = view

    @Provides fun providePresenter(view: SessionContract.View) = SessionPresenter(view)

}