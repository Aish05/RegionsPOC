@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.latesttechstackpoc

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController
import com.example.latesttechstackpoc.navigation.bottom_nav.BottomNavigationComponent
import com.example.latesttechstackpoc.navigation.MainNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationComponent(navController) },
        content = { _ -> MainNavGraph(navController) },
    )
}
