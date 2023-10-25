package com.example.latesttechstackpoc.common

interface PaymentGatewayConfig {
    val gatewayType: Set<GatewayType>
}