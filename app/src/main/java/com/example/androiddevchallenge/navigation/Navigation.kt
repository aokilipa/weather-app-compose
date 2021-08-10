package com.example.androiddevchallenge.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androiddevchallenge.ui.component.NavigationItem
import com.example.androiddevchallenge.ui.dashboard.FavoriteScreen
import com.example.androiddevchallenge.ui.dashboard.HomeScreen
import com.example.androiddevchallenge.ui.dashboard.ProfileScreen

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