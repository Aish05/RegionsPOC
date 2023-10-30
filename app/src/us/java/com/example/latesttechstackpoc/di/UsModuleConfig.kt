package com.example.latesttechstackpoc.us.di

import android.graphics.Color
import com.example.latesttechstackpoc.DynamicCountryRepository
import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.common.ColorConfig
import com.example.latesttechstackpoc.common.CountryRepository
import com.example.latesttechstackpoc.common.PaymentGatewayConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UsModuleConfig {

    @Provides
    fun providePaymentGatewayConfig(): PaymentGatewayConfig {
        return USPaymentGatewayConfig()
    }

    @Provides
    fun provideColorConfig(): ColorConfig {
        return ColorConfig(Color.BLUE, Color.BLUE)
    }

    @Provides
    fun provideAddressValidationConfig(): AddressValidator {
        return UsAddressValidator()
    }

    @Provides
    fun provideCountryRepository(): CountryRepository {
        return DynamicCountryRepository()
    }
}
