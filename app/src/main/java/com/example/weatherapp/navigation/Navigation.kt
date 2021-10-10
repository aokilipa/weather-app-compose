package com.example.weatherapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.weatherapp.ui.component.NavigationItem
import com.example.weatherapp.ui.dashboard.FavoriteScreen
import com.example.weatherapp.ui.dashboard.HomeScreen
import com.example.weatherapp.ui.dashboard.ProfileScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationItem.Home.route
    ) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }

        composable(NavigationItem.Favorite.route) {
            FavoriteScreen()
        }

        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
    }
}