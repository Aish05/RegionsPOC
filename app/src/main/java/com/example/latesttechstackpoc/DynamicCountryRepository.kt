package com.example.latesttechstackpoc

import com.example.latesttechstackpoc.common.CountryRepository
import com.example.latesttechstackpoc.model.Country

class DynamicCountryRepository : CountryRepository {
    override fun getCountry(): Country {
        // Implement logic to fetch the country dynamically
        return if(BuildConfig.FLAVOR == "us") {
            Country(code = "US")
        } else {
            Country(code = "UK")
        }
    }
}
