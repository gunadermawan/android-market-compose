package com.gunder.market.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.gunder.market.R
import com.gunder.market.model.BottomBarItem
import com.gunder.market.navigation.Screen

@Composable
fun BottomBar(navController: NavController, modifier: Modifier = Modifier) {
    NavigationBar(modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            BottomBarItem(
                title = stringResource(id = R.string.txt_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_official_store),
                icon = Icons.Default.ShoppingCart,
                screen = Screen.Store
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_notification),
                icon = Icons.Default.Notifications,
                screen = Screen.Chart
            ), BottomBarItem(
                title = stringResource(id = R.string.txt_profile),
                icon = Icons.Default.Person,
                screen = Screen.Profile
            )
        )
        navigationItems.map {
            NavigationBarItem(
                selected = currentRoute == it.screen.route,
                onClick = {
                    navController.navigate(it.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) }
            )
        }
    }
}