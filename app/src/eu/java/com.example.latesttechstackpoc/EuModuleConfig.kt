package com.example.latesttechstackpoc

import android.graphics.Color
import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.common.ColorConfig
import com.example.latesttechstackpoc.common.CountryRepository
import com.example.latesttechstackpoc.common.PaymentGatewayConfig
import com.example.latesttechstackpoc.model.Country
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object EuModuleConfig {

    @Provides
    fun providePaymentGatewayConfig(country: CountryRepository): PaymentGatewayConfig {
        return when(country.getCountry().code) {
            "FR" -> EuPaymentGatewayConfig()
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
