package com.example.latesttechstackpoc.features.profile.navigation

sealed class ProfileDestinations(val route: String) {
    object Details : ProfileDestinations("details_route")
}
