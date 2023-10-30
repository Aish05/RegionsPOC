package com.example.latesttechstackpoc.us.di

import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.model.Address

class UsAddressValidator : AddressValidator {
    override fun validateAddress(address: Address): String {
        return "^\\\\d{5}(-{0,1}\\\\d{4})?\$"
    }
}