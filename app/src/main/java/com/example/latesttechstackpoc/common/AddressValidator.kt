package com.example.latesttechstackpoc.common

import com.example.latesttechstackpoc.model.Address

interface AddressValidator {
    fun validateAddress(address: Address): String
}