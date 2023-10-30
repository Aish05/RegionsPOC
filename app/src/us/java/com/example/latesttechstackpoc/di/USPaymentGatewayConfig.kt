package com.example.latesttechstackpoc.us.di

import com.example.latesttechstackpoc.common.GatewayType
import com.example.latesttechstackpoc.common.PaymentGatewayConfig

class USPaymentGatewayConfig : PaymentGatewayConfig {
    override val gatewayType: Set<GatewayType> = setOf(
        GatewayType.PAYPAL,
        GatewayType.ANDROID_PAY,
        GatewayType.DEBIT_CARD
    )
}