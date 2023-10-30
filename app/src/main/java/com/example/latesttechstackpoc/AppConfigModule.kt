package com.example.latesttechstackpoc

import com.example.latesttechstackpoc.common.AppConfig
import com.example.latesttechstackpoc.common.AppConfigImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {
    @Binds
    fun bindAppConfig(appConfig: AppConfigImpl): AppConfig
}
