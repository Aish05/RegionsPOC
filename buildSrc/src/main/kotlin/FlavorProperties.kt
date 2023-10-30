package com.example.latesttechstackpoc.flavor

enum class Flavor(val country: String) {
    US("us"),
    EU("eu"),
    UK("uk"),
    CA("ca")
}

fun getFlavorProperties(flavorName: String): AppBuildConfig {
    return when (flavorName) {
        Flavor.US.country -> AppBuildConfig.US(USConfig())
        Flavor.EU.country -> AppBuildConfig.EU(EUConfig())
        Flavor.UK.country -> AppBuildConfig.UK(UKConfig())
        Flavor.CA.country -> AppBuildConfig.CA(CAConfig())
        // Add cases for other flavor-specific configurations
        else -> AppBuildConfig.US(USConfig()) // Provide a default implementation
    }
}