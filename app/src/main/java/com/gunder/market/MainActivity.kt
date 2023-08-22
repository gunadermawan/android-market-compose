package com.gunder.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.model.dummyListBanner
import com.gunder.market.model.dummyListBottomCategory
import com.gunder.market.model.dummyListCardForYou
import com.gunder.market.model.dummyListDiscount
import com.gunder.market.model.dummyListTopBar
import com.gunder.market.model.dummyListTopCategory
import com.gunder.market.ui.components.CardBanner
import com.gunder.market.ui.components.CardDiscount
import com.gunder.market.ui.components.CardSpecialForYou
import com.gunder.market.ui.components.CardSpecialOffer
import com.gunder.market.ui.components.DrawCircle
import com.gunder.market.ui.components.ListBottomCategory
import com.gunder.market.ui.components.ListTopBar
import com.gunder.market.ui.components.ListTopCategory
import com.gunder.market.ui.components.MainTopBar
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
        MainTopBar()
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
        items(dummyListTopCategory) {
            ListTopCategory(it)
        }
    }
}

@Composable
fun CategoryBottomItem(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dummyListBottomCategory) {
            ListBottomCategory(it)
        }
    }
}

@Preview
@Composable
fun CategoryItemPreview() {
    MarketTheme {
        CategoryItem()
    }
}

@Composable
fun ListTopBar(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dummyListTopBar) {
            ListTopBar(it)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    MarketTheme {
        Box {
            ListTopBar()
        }
    }
}

@Preview
@Composable
fun CategoryBottomItemPreview() {
    MarketTheme {
        CategoryBottomItem()
    }
}


@Composable
fun MainBanner(modifier: Modifier = Modifier) {
    LazyRow(modifier = modifier.padding(8.dp)) {
        items(dummyListBanner) {
            CardBanner(listBanner = it)
        }
    }
}

@Preview
@Composable
fun MainBannerPreview() {
    MarketTheme {
        MainBanner()
    }
}

@Composable
fun DiscountBanner(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dummyListDiscount) { item ->
            CardDiscount(item)
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
fun SpecialOffer() {
    CardSpecialOffer()
}

@Preview
@Composable
fun SpecialOfferPreview() {
    MarketTheme {
        SpecialOffer()
    }
}

@Composable
fun CardSpecial(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dummyListCardForYou) {
            CardSpecialForYou(it)
        }
    }
}

@Preview
@Composable
fun CardSpecialYouPreview() {
    MarketTheme {
        CardSpecial()
    }
}

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        TopBanner()
        ListTopBar()
        CategoryItem()
        MainBanner()
        CategoryBottomItem()
        SpecialOffer()
        CardSpecial()
    }
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketTheme {
        MarketApp()
    }
}