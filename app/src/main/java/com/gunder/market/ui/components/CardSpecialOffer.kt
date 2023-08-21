package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardSpecialOffer(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(16.dp)
    ) {
        Column {
            Card(
                modifier = modifier
                    .width(120.dp)
                    .padding(4.dp)
                    .heightIn(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_1),
                    contentDescription = null
                )
            }
            Card(
                modifier = modifier
                    .width(120.dp)
                    .padding(4.dp)
                    .heightIn(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_2),
                    contentDescription = null
                )
            }
        }
        Column {
            Card(
                modifier = modifier
                    .width(120.dp)
                    .padding(4.dp)
                    .heightIn(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_3),
                    contentDescription = null
                )
            }
            Card(
                modifier = modifier
                    .width(120.dp)
                    .padding(4.dp)
                    .heightIn(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_4),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardSpecialOfferPreview() {
    MarketTheme {
        CardSpecialOffer()
    }
}