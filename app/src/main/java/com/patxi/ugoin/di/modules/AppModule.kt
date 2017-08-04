package com.patxi.ugoin.di.modules

import com.patxi.ugoin.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module class AppModule(val app: App) {

    @Provides @Singleton fun provideApp() = app

}