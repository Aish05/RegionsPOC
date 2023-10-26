package com.example.latesttechstackpoc.common

import com.example.latesttechstackpoc.model.Country

interface CountryRepository {
    fun getCountry(): Country

    fun setCountry(country: Country)
}
