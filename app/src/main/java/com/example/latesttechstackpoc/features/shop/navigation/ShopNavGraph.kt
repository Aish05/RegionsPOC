package com.example.latesttechstackpoc.features.shop.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.latesttechstackpoc.features.home.DetailsScreen
import com.example.latesttechstackpoc.features.shop.ShopScreen
import com.example.latesttechstackpoc.navigation.bottom_nav.MainDestinations

fun NavController.navigateShopScreen(navOptions: NavOptions? = null) {
    this.navigate(MainDestinations.Shop.route, navOptions)
}

fun NavController.navigateDetailsScreen(navOptions: NavOptions? = null) {
    this.navigate(ShopDestinations.Details.route, navOptions)
}

fun NavGraphBuilder.shopScreen() {
    composable(
        route = MainDestinations.Shop.route,
    ) { navBackStackEntry ->
        ShopScreen()
    }

    composable(
        route = ShopDestinations.Details.route,
    ) { navBackStackEntry ->
        DetailsScreen()
    }
}
