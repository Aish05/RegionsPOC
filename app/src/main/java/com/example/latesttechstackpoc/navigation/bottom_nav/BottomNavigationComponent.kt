package com.example.latesttechstackpoc.navigation.bottom_nav

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navOptions
import com.example.latesttechstackpoc.features.home.navigation.navigateHomeScreen
import com.example.latesttechstackpoc.features.profile.navigation.navigateToProfileGraph
import com.example.latesttechstackpoc.features.shop.navigation.navigateShopScreen

val bottomNavigationItems = listOf(
    MainDestinations.Home,
    MainDestinations.Shop,
    MainDestinations.Profile,
)
@Composable
fun BottomNavigationComponent(
    navController: NavHostController
) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        bottomNavigationItems.forEach { item ->
            BottomNavigationItem(
                icon = { /* Icon for the tab */ },
                label = { Text(text = item.route) },
                selected = currentRoute == item.route,
                onClick = {
                    when(item) {
                        MainDestinations.Home -> navController.navigateHomeScreen()
                        MainDestinations.Profile -> navController.navigateToProfileGraph()
                        MainDestinations.Shop -> navController.navigateShopScreen()
                    }
                },
            )
        }
    }
}
