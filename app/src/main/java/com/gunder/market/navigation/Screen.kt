package com.gunder.market.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Store : Screen("cart")
    object Chart : Screen("chart")
    object Profile : Screen("profile")
}