package com.example.latesttechstackpoc.features.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.latesttechstackpoc.features.home.GalleryPhotos
import com.example.latesttechstackpoc.features.home.GalleryVideos
import com.example.latesttechstackpoc.features.home.HomeScreen
import com.example.latesttechstackpoc.navigation.bottom_nav.MainDestinations

fun NavController.navigateHomeScreen(navOptions: NavOptions? = null) {
    this.navigate(MainDestinations.Home.route, navOptions)
}

fun NavController.navigateHomeDetails(navOptions: NavOptions? = null) {
    navigate(HomeDestinations.Details.route, navOptions)
}

fun NavController.navigateHomePhotos(navOptions: NavOptions? = null) {
    navigate(HomeDestinations.Photos.route, navOptions)
}

fun NavController.navigateHomeGallery(navOptions: NavOptions? = null) {
    navigate(HomeDestinations.Gallery.route, navOptions)
}

fun NavController.navigateHomeVideos(navOptions: NavOptions? = null) {
    navigate(HomeDestinations.Videos.route, navOptions)
}

fun NavGraphBuilder.homeScreen() {

    composable(
        route = MainDestinations.Home.route
    ) { homeNavBackStackEntry ->
        HomeScreen()
    }

    composable(
        route = HomeDestinations.Details.route,
    ) { navBackStackEntry ->
        DetailsScreen()
    }

    // Add sections for gallery
    navigation(
        route = HomeDestinations.Gallery.route,
        startDestination = HomeDestinations.Photos.route,
    ) {
        composable(
            route = HomeDestinations.Photos.route,
            // Add deep link and argument configurations if needed
        ) { galleryPhotosBackStackEntry ->
            // Gallery,Photos  composable content
            GalleryPhotos()
        }
        composable(
            route = HomeDestinations.Videos.route,
            // Add deep link and argument configurations if needed
        ) { galleryVideosBackStackEntry ->
            // Gallery, Videos composable content
            GalleryVideos()
        }
    }
}
