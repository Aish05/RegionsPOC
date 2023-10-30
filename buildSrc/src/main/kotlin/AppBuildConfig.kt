package com.example.latesttechstackpoc.flavor


sealed class AppBuildConfig {
    abstract val commonConfig: CommonConfig

    data class US(override val commonConfig: CommonConfig) : AppBuildConfig()
    data class UK(override val commonConfig: CommonConfig) : AppBuildConfig()
    data class EU(override val commonConfig: CommonConfig) : AppBuildConfig()
    data class CA(override val commonConfig: CommonConfig) : AppBuildConfig()
}


interface CommonConfig {
    val mapsKey: String
    val baseUrl: String
}

data class USConfig(
    override val mapsKey: String = "us-maps-key",
    override val baseUrl: String = "us-url",
    // Define other properties specific to the US configuration
) : CommonConfig

data class EUConfig(
    override val mapsKey: String = "eu-maps-key",
    override val baseUrl: String = "eu-url",
    // Define other properties specific to the US configuration
) : CommonConfig

data class UKConfig(
    override val mapsKey: String = "uk-maps-key",
    override val baseUrl: String = "uk-url",
    // Define other properties specific to the UK configuration
) : CommonConfig

data class CAConfig(
    override val mapsKey: String = "ca-maps-key",
    override val baseUrl: String = "ca-url",
    // Define other properties specific to the US configuration
) : CommonConfig


