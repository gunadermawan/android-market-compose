package com.gunder.market

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.component.BottomBar
import com.gunder.market.component.MainBannerVertical
import com.gunder.market.component.MainBottomCategory
import com.gunder.market.component.MainCardCategory
import com.gunder.market.component.MainImageCategory
import com.gunder.market.component.MainTopBar
import com.gunder.market.component.MainTopCategory
import com.gunder.market.component.TopMenu
import com.gunder.market.model.dummyListBanner
import com.gunder.market.model.dummyListBottomCategory
import com.gunder.market.model.dummyListCardForYou
import com.gunder.market.model.dummyListTopCategory
import com.gunder.market.model.dummyListTopMenus
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { MainTopBar(onMenuClick = {}) },
        bottomBar = { BottomBar() })
    { paddingValues ->
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
//        your code compose here
            MainTopMenu()
            MainCategoryTop()
            MainCategoryCard()
            MainCategoryBottom()
            MainImageCategory()
            MainVerticalBanner()
        }
    }

}


@Composable
fun MainCategoryCard() {
    LazyRow {
        items(dummyListBanner) {
            MainCardCategory(listBanner = it)
        }
    }
}

@Composable
fun MainCategoryTop() {
    LazyRow {
        items(dummyListTopCategory) {
            MainTopCategory(listTopCategory = it)
        }
    }
}

@Composable
fun MainVerticalBanner() {
    LazyRow {
        items(dummyListCardForYou) {
            MainBannerVertical(listBanner = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainCategoryTopPreview() {
    MarketTheme {
        MainCategoryTop()
    }
}

@Composable
fun MainCategoryBottom() {
    LazyRow {
        items(dummyListBottomCategory) {
            MainBottomCategory(listBottomCategory = it)
        }
    }
}


@Composable
fun MainTopMenu() {
    LazyRow {
        items(dummyListTopMenus) {
            TopMenu(listTopMenu = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopMenuPreview() {
    MarketTheme {
        MainTopMenu()
    }
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketTheme {
        MarketApp()
    }
}