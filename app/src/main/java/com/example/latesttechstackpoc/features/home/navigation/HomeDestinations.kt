package com.example.latesttechstackpoc.features.home.navigation

sealed class HomeDestinations(val route: String) {
    object Details : HomeDestinations("details_route")
    object Gallery : HomeDestinations("gallery_route")
    object Photos : HomeDestinations("photos_route")
    object Videos : HomeDestinations("videos_route")
}
