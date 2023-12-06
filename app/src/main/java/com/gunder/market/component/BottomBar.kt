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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.R
import com.gunder.market.model.BottomBarItem
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    NavigationBar(modifier) {
        val bottomNavigation = listOf(
            BottomBarItem(
                title = stringResource(id = R.string.txt_home),
                icon = Icons.Default.Home
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_official_store),
                icon = Icons.Default.ShoppingCart
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_notification),
                icon = Icons.Default.Notifications
            ), BottomBarItem(
                title = stringResource(id = R.string.txt_profile),
                icon = Icons.Default.Person
            )
        )
        bottomNavigation.map {
            NavigationBarItem(
                selected = it.title == bottomNavigation[0].title,
                onClick = { },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) })
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    MarketTheme {
        BottomBar()
    }
}