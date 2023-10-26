package com.example.latesttechstackpoc.features.home

import androidx.lifecycle.ViewModel
import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.common.ColorConfig
import com.example.latesttechstackpoc.common.CountryRepository
import com.example.latesttechstackpoc.common.PaymentGatewayConfig
import com.example.latesttechstackpoc.model.Country
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val paymentGatewayConfig: PaymentGatewayConfig,
    var colorConfig: ColorConfig,
    private val addressValidator: AddressValidator,
    private val countryRepository: CountryRepository,
) : ViewModel() {
    // ViewModel code here
    private var country: Country = countryRepository.getCountry()

}