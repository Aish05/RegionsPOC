package com.example.latesttechstackpoc.features.shop.navigation

sealed class ShopDestinations(val route: String) {
    object Details : ShopDestinations("details_route")
}
