package com.gunder.market

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gunder.market.component.BottomBar
import com.gunder.market.navigation.Screen
import com.gunder.market.state.rememberMarketState
import com.gunder.market.ui.screen.ChartScreen
import com.gunder.market.ui.screen.HomeScreen
import com.gunder.market.ui.screen.ProfileScreen
import com.gunder.market.ui.screen.StoreScreen
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MarketApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val marketState = rememberMarketState()
    Scaffold(
        snackbarHost = { SnackbarHost(marketState.snackBarHostState) },
        bottomBar = { BottomBar(navController) })
    { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screen.Home.route) {
                HomeScreen()
            }
            composable(Screen.Store.route) {
                StoreScreen()
            }
            composable(Screen.Chart.route) {
                ChartScreen()
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
        }
    }
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketTheme {
        MarketApp()
    }
}