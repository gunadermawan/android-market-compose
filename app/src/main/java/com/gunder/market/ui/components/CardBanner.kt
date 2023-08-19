package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardBanner(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .widthIn(200.dp)
            .padding(16.dp)
            .heightIn(48.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = androidx.compose.ui.graphics.Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.banner1),
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun CardBannerPreview() {
    MarketTheme {
        CardBanner()
    }
}