package com.example.latesttechstackpoc.features.home
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.latesttechstackpoc.model.Country

@Composable
fun HomeScreen() {

    val viewModel: HomeViewModel = hiltViewModel()
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
