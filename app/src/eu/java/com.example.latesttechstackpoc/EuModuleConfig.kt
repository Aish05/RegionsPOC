package com.example.latesttechstackpoc

import android.graphics.Color
import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.common.ColorConfig
import com.example.latesttechstackpoc.common.PaymentGatewayConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object EuModuleConfig {

    @Provides
    fun providePaymentGatewayConfig(): PaymentGatewayConfig {
        return EuPaymentGatewayConfig()
    }

    @Provides
    fun provideColorConfig(): ColorConfig {
        return ColorConfig(Color.RED, Color.BLUE)
    }

    @Provides
    fun provideAddressValidationConfig(): AddressValidator {
        return EuAddressValidator()
    }
}
