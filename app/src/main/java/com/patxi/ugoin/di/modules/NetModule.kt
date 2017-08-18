package com.patxi.ugoin.di.modules

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.patxi.ugoin.domain.network.AuthInterceptor
import com.patxi.ugoin.domain.network.UgoinBackendService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(private val baseUrl: String) {

    @Provides
    @Singleton
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(AuthInterceptor("5801f792-701e-470a-850e-6ffc4f2be731")).build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .build()
    }

    @Provides
    @Singleton
    fun provideUgoinBackendService(retrofit: Retrofit): UgoinBackendService = retrofit.create(UgoinBackendService::class.java)

}