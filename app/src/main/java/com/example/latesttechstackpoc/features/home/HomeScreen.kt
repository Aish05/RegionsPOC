package com.example.latesttechstackpoc.features.home
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.latesttechstackpoc.BuildConfig

@Composable
fun HomeScreen() {

    val viewModel: HomeViewModel = hiltViewModel()

    val flavorConfig = viewModel.appConfig.getFlavorConfig(BuildConfig.FLAVOR)
    val showGuide = flavorConfig.showGuide
    val showCheckbox = flavorConfig.showCheckbox
    Log.d("Flavor config showGuide", "${BuildConfig.FLAVOR} $showGuide")

    val colorConfig = viewModel.colorConfig
    Column {
        Text(
            text = "Home Screen!",
            color = Color(colorConfig.primaryColor)
        )
        Text(
            text = "Aishwarya",
            color = Color(colorConfig.primaryColor)
        )
    }

}
