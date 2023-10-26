package com.example.latesttechstackpoc

import com.example.latesttechstackpoc.common.CountryRepository
import com.example.latesttechstackpoc.model.Country
import java.util.Random

class DynamicCountryRepository : CountryRepository {

    private var selectedCountry: Country = Country(null)

    override fun getCountry(): Country {
        // Implement logic to fetch the country dynamically
        return if(BuildConfig.FLAVOR == "us") {
            selectedCountry = Country(code = "US")
            selectedCountry
        } else {
            val euCountries = listOf(
                Country("FR"),
                Country("UK"),
                Country("DE"),
                // Add other EU countries as needed
            )
            val random = Random()
            val randomIndex = random.nextInt(euCountries.size)
            selectedCountry = euCountries[randomIndex]
            selectedCountry
        }
    }

    override fun setCountry(country: Country) {
       selectedCountry = country
    }
}
