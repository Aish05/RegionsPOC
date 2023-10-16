package com.example.latesttechstackpoc.features.profile.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.latesttechstackpoc.features.home.navigation.DetailsScreen
import com.example.latesttechstackpoc.features.profile.ProfileScreen
import com.example.latesttechstackpoc.navigation.bottom_nav.MainDestinations

const val PROFILE_GRAPH_ROUTE = "profile"
fun NavController.navigateToProfileGraph(navOptions: NavOptions? = null) {
    this.navigate(PROFILE_GRAPH_ROUTE)
}

fun NavController.navigateDetailsScreen(navOptions: NavOptions? = null) {
    this.navigate(ProfileDestinations.Details.route, navOptions)
}

fun NavGraphBuilder.profileScreen() {
    navigation(
        route = PROFILE_GRAPH_ROUTE,
        startDestination = MainDestinations.Profile.route,
    ) {
        composable(route = MainDestinations.Profile.route) { profileBackStackEntry ->
            ProfileScreen()
        }

        composable(route = ProfileDestinations.Details.route) { navBackStackEntry ->
            DetailsScreen()
        }
    }
}
