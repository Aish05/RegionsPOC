package com.example.latesttechstackpoc.navigation.bottom_nav

sealed class MainDestinations(val route: String) {
    object Home : MainDestinations("home_route")
    object Shop : MainDestinations("shop_route")
    object Profile : MainDestinations("profile_route")
}
