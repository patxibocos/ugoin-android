package com.patxi.ugoin.di.modules

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.patxi.ugoin.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {

    @Provides
    @Singleton
    fun provideApp() = app

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)

}