package com.example.latesttechstackpoc.di

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

@Module
@InstallIn(SingletonComponent::class)
object EuModuleConfig {

    @Provides
    fun providePaymentGatewayConfig(country: CountryRepository): PaymentGatewayConfig {
        return when(country.getCountry().code) {
            "FR" -> FrPaymentGatewayConfig()
            "UK" -> EuPaymentGatewayConfig()
            "DE" -> EuPaymentGatewayConfig()
            else -> {
                EuPaymentGatewayConfig()
            }
        }
    }

    @Provides
    fun provideColorConfig(country: CountryRepository): ColorConfig {
        return when(country.getCountry().code) {
            "FR" -> ColorConfig(Color.CYAN, Color.RED)
            "UK" -> ColorConfig(Color.RED, Color.RED)
            "DE" -> ColorConfig(Color.YELLOW, Color.RED)
            else -> {
                ColorConfig(Color.CYAN, Color.RED)
            }
        }
    }

    @Provides
    fun provideAddressValidationConfig(country: CountryRepository): AddressValidator {
        return when(country.getCountry().code) {
            "FR" -> EuAddressValidator()
            "UK" -> EuAddressValidator()
            "DE" -> EuAddressValidator()
            else -> {
                EuAddressValidator()
            }
        }
    }

    @Provides
    fun provideCountryRepository(): CountryRepository {
        return DynamicCountryRepository()
    }
}
