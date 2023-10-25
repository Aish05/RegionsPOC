package com.example.latesttechstackpoc.features.home

import androidx.lifecycle.ViewModel
import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.common.ColorConfig
import com.example.latesttechstackpoc.common.PaymentGatewayConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val paymentGatewayConfig: PaymentGatewayConfig,
    val colorConfig: ColorConfig,
    private val addressValidator: AddressValidator
) : ViewModel() {
    // ViewModel code here
}