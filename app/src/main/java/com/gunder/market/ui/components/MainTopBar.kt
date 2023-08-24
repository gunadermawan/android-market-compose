package com.gunder.market.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(start = 8.dp, end = 16.dp)
            .width(IntrinsicSize.Min)
    ) {
        Row {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                },
                placeholder = { Text(stringResource(R.string.txt_search_here), fontSize = 14.sp) },
                modifier = Modifier
                    .padding(16.dp)
                    .widthIn(min = 200.dp)
                    .height(48.dp)

                )
            Spacer(modifier = modifier.size(4.dp))
            Icon(
                Icons.Outlined.Email,
                contentDescription = null,
                modifier = modifier
                    .size(24.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = modifier.size(8.dp))
            Icon(
                Icons.Outlined.ShoppingCart,
                contentDescription = null,
                modifier = modifier
                    .size(24.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = modifier.size(8.dp))
            Icon(
                Icons.Outlined.Notifications,
                contentDescription = null,
                modifier = modifier
                    .size(24.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = modifier.size(8.dp))
            Icon(
                Icons.Outlined.Menu,
                contentDescription = null,
                modifier = modifier
                    .size(24.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = modifier.size(8.dp))
        }
        Row {
            Text(
                text = "Dikirim ke alamat",
                modifier = modifier.padding(start = 16.dp, bottom = 16.dp),
                fontSize = 12.sp
            )
            Spacer(modifier = modifier.size(4.dp))
            Text(text = "Rumah Guna Dermawan", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                modifier = modifier
                    .size(24.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    MarketTheme {
        MainTopBar()
    }
}