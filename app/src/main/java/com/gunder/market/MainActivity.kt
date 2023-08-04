package com.gunder.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.model.dummyListCategory
import com.gunder.market.model.dummyListDiscount
import com.gunder.market.ui.components.CardDiscount
import com.gunder.market.ui.components.DrawCircle
import com.gunder.market.ui.components.MainCategory
import com.gunder.market.ui.components.SearchBar
import com.gunder.market.ui.theme.MarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MarketApp()
                }
            }
        }
    }
}

@Composable
fun TopBanner(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = "Banner Top Image",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.height(160.dp)
        )
        SearchBar()
    }
}

@Preview(showBackground = true)
@Composable
fun TopBannerPreview() {
    MarketTheme {
        TopBanner()
    }
}

@Composable
fun ProductCategory(modifier: Modifier = Modifier) {
    Box(modifier = modifier.requiredSize(120.dp), contentAlignment = Alignment.Center) {
        DrawCircle()
        Icon(
            painter = painterResource(R.drawable.ic_computer),
            contentDescription = null,
            modifier = modifier
                .size(40.dp),
            tint = Color.DarkGray
        )
    }
}

@Preview
@Composable
fun ProductCategoryPreview() {
    MarketTheme {
        ProductCategory()
    }
}

@Composable
fun CategoryItem(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dummyListCategory, key = { it.txtCategory }) {
            MainCategory(it)
        }
    }
}

@Preview
@Composable
fun CategoryItemPrev() {
    MarketTheme {
        CategoryItem()
    }
}

@Composable
fun DiscountBanner(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dummyListDiscount, key = { it.txtDiscount }) {
            CardDiscount(it)
        }
    }
}


@Preview
@Composable
fun DiscountBannerPreview() {
    MarketTheme {
        DiscountBanner()
    }
}

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        TopBanner()
        CategoryItem()
        DiscountBanner()
    }
}

@Preview(device = Devices.PIXEL_3_XL, showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketTheme {
        MarketApp()
    }
}