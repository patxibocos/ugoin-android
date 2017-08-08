package com.patxi.ugoin.di.modules

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.patxi.ugoin.di.scopes.PerActivity
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module class NetModule(val baseUrl: String) {

    @Provides @Singleton fun provideGson(): Gson = GsonBuilder().create()

    @Provides @Singleton fun provideOkHttpClient(): OkHttpClient = OkHttpClient()

    @Provides @Singleton fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit =
            Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl(baseUrl)
                    .client(okHttpClient)
                    .build()

}