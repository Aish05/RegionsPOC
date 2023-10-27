package com.example.latesttechstackpoc

import com.example.latesttechstackpoc.common.GatewayType
import com.example.latesttechstackpoc.common.PaymentGatewayConfig

class EuPaymentGatewayConfig : PaymentGatewayConfig {
    override val gatewayType: Set<GatewayType> = setOf(
        GatewayType.PAYPAL,
        GatewayType.ANDROID_PAY,
        GatewayType.DEBIT_CARD,
        GatewayType.CREDIT_CARD,
        GatewayType.ADYEN
    )
}

class FrPaymentGatewayConfig : PaymentGatewayConfig {
    override val gatewayType: Set<GatewayType> = setOf(
        GatewayType.DEBIT_CARD,
        GatewayType.CREDIT_CARD,
    )
}