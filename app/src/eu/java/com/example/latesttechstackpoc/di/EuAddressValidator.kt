package com.example.latesttechstackpoc.di

import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.model.Address

class EuAddressValidator : AddressValidator {
    override fun validateAddress(address: Address): String {
       return "/^[A-Z]{1,2}[0-9RCHNQ][0-9A-Z]?\\s?[0-9][ABD-HJLNP-UW-Z]{2}$|^[A-Z]{2}-?[0-9]{4}$/"
    }
}