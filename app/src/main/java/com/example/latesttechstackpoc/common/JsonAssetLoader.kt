package com.example.latesttechstackpoc.common

import android.content.Context
import javax.inject.Inject

class JsonAssetLoader @Inject constructor(private val context: Context) {
    fun loadJsonFromAssets(filename: String): String {
        try {
            context.assets.open(filename).use { inputStream ->
                return inputStream.bufferedReader().use {
                    it.readText()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return ""
        }
    }
}
