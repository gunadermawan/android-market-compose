package com.gunder.market.component

import android.util.Log
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
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.ui.theme.MarketTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(onMenuClick: () -> Unit, modifier: Modifier = Modifier) {
    val coroutineScope = rememberCoroutineScope()
    var query by remember {
        mutableStateOf("")
    }
    var isBottomSheetVisible by remember {
        mutableStateOf(false)
    }
    if (isBottomSheetVisible) {
        BottomSheet() {
            isBottomSheetVisible = false
        }
    }
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
                    value = query,
                    onValueChange = { newName ->
                        query = newName
                    },
                    leadingIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                performSearch(query)
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

            IconButton(onClick = { isBottomSheetVisible = true }) {
                Icon(
                    imageVector = Icons.Outlined.Menu,
                    contentDescription = null,
                    modifier = modifier.size(24.dp)
                )
            }
        })
}

fun performSearch(query: String) {
    Log.d("ktx", "performSearch: $query")
}

@Preview(showBackground = true)
@Composable
fun MainTopBarPreview() {
    MarketTheme {
        MainTopBar(onMenuClick = {})
    }
}