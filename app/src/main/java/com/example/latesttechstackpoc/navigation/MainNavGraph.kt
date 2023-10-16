package com.example.latesttechstackpoc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.latesttechstackpoc.features.home.navigation.homeScreen
import com.example.latesttechstackpoc.features.profile.navigation.profileScreen
import com.example.latesttechstackpoc.features.shop.navigation.shopScreen
import com.example.latesttechstackpoc.navigation.bottom_nav.MainDestinations

@Composable
fun MainNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = MainDestinations.Home.route,
    ) {
        homeScreen()
        profileScreen()
        shopScreen()

    }
}
