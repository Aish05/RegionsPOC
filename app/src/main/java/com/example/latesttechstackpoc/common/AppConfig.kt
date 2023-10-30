package com.example.latesttechstackpoc.common

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import javax.inject.Inject
import javax.inject.Singleton

data class FlavorConfig(
    val showGuide: Boolean,
    val showCheckbox: Boolean
)

data class AppConfigJson(
    val us: FlavorConfig,
    val eu: FlavorConfig
)

@Singleton
class AppConfigImpl @Inject constructor() : AppConfig {
    private val flavorConfig: MutableMap<String, FlavorConfig> = mutableMapOf()

    override fun configureFromJsonFile(filePath: String) {
        val jsonConfig = loadConfigFromJson(filePath)
        flavorConfig.putAll(jsonConfig)
    }

    override fun getFlavorConfig(flavor: String): FlavorConfig {
        return flavorConfig[flavor] ?: FlavorConfig(showGuide = false, showCheckbox = false)
    }

    // Load and parse the JSON configuration file here
    // Return a Map from flavor to configuration
    private fun loadConfigFromJson(json: String): Map<String, FlavorConfig> {
        // Use Moshi to parse the JSON data into an AppConfigJson object
        val appConfigJson = parseJson(json)

        // Configure the flavorConfig based on the JSON data
        return appConfigJson?.let {
            mapOf(
                "us" to it.us,
                "eu" to it.eu
            )
        } ?: emptyMap()
    }

    private fun parseJson(json: String): AppConfigJson? {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val adapter: JsonAdapter<AppConfigJson> = moshi.adapter(AppConfigJson::class.java)

        return try {
            adapter.fromJson(json)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}

interface AppConfig {
    fun configureFromJsonFile(filePath: String)
    fun getFlavorConfig(flavor: String): FlavorConfig
}
