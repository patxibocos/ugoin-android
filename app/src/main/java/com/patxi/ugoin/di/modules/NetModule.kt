package com.patxi.ugoin.di.modules

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.patxi.ugoin.App
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module class NetModule(val baseUrl: String) {

    @Provides @Singleton fun provideSharedPreferences(app: App): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)

    @Provides @Singleton fun provideGson(): Gson = GsonBuilder().create()

    @Provides @Singleton fun provideOkHttpClient(): OkHttpClient = OkHttpClient()

    @Provides @Singleton fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit =
            Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl(baseUrl)
                    .client(okHttpClient)
                    .build()

}