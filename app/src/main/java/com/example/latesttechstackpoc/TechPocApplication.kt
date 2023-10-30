package com.example.latesttechstackpoc

import android.app.Application
import com.example.latesttechstackpoc.common.AppConfig
import com.example.latesttechstackpoc.common.JsonAssetLoader
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class TechPocApplication : Application() {

    @Inject
    lateinit var appConfig: AppConfig


    @Inject
    lateinit var jsonAssetLoader: JsonAssetLoader

    override fun onCreate() {
        super.onCreate()

        try {
            // Load JSON data from assets
            val json = jsonAssetLoader.loadJsonFromAssets("config.json")

            // Configure AppConfigImpl with the JSON data
            appConfig.configureFromJsonFile(json)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}