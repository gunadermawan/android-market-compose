package com.gunder.market.component

import android.widget.Toast
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.state.rememberMarketState
import com.gunder.market.ui.theme.MarketTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(onMenuClick: () -> Unit, modifier: Modifier = Modifier) {
    val marketState = rememberMarketState()
    marketState.HandleBottomSheet()

    TopAppBar(modifier = Modifier.padding(8.dp), title = { /*TODO*/ },
        navigationIcon = {
            Row(
                modifier = Modifier
                    .padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    modifier = modifier
                        .widthIn(max = 180.dp)
                        .padding(end = 8.dp),
                    value = marketState.query,
                    onValueChange = { newName ->
                        marketState.query = newName
                    },
                    leadingIcon = {
                        IconButton(onClick = {
                            marketState.scope.launch {
                                Toast.makeText(
                                    marketState.context,
                                    "performSearch: ${marketState.query}",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                        }) {
                            Icon(
                                imageVector = Icons.Outlined.Search,
                                contentDescription = "Search",
                                modifier = modifier.size(24.dp)
                            )
                        }
                    },
                    placeholder = { Text(text = "Search here") }
                )
            }
        }, actions = {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = null,
                    modifier = modifier.size(24.dp)
                )
            }
            BadgedBox(modifier = Modifier,
                badge = {
                    Badge {
                        Text(text = "10")
                    }
                }
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.ShoppingCart,
                        contentDescription = null,
                        modifier = modifier.size(24.dp)
                    )
                }
            }
            BadgedBox(modifier = Modifier,
                badge = {
                    Badge {
                        Text(text = "2")
                    }
                }
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = null,
                        modifier = modifier.size(24.dp)
                    )
                }
            }

            IconButton(onClick = { marketState.showBottomSheet() }) {
                Icon(
                    imageVector = Icons.Outlined.Menu,
                    contentDescription = null,
                    modifier = modifier.size(24.dp)
                )
            }
        })
}


@Preview(showBackground = true)
@Composable
fun MainTopBarPreview() {
    MarketTheme {
        MainTopBar(onMenuClick = {})
    }
}