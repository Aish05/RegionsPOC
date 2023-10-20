package com.example.latesttechstackpoc.flavor

enum class Flavor(val country: String) {
    US("us"),
    EU("eu"),
    UK("uk"),
    CA("ca")
}

fun getFlavorProperties(flavorName: String): AppConfig {
    return when (flavorName) {
        Flavor.US.country -> AppConfig.US(USConfig())
        Flavor.EU.country -> AppConfig.EU(EUConfig())
        Flavor.UK.country -> AppConfig.UK(UKConfig())
        Flavor.CA.country -> AppConfig.CA(CAConfig())
        // Add cases for other flavor-specific configurations
        else -> AppConfig.US(USConfig()) // Provide a default implementation
    }
}