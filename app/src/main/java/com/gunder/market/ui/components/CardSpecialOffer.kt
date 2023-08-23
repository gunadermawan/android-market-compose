package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardSpecialOffer(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row {
            Card(
                modifier = modifier
                    .width(IntrinsicSize.Max)
                    .padding(bottom = 8.dp, top = 8.dp)
                    .height(IntrinsicSize.Max),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Green)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_1),
                    contentDescription = null
                )
            }
            Card(
                modifier = modifier
                    .width(IntrinsicSize.Max)
                    .padding(bottom = 8.dp, top = 8.dp, start = 16.dp)
                    .height(IntrinsicSize.Max),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Green)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_2),
                    contentDescription = null
                )
            }
        }
        Row {
            Card(
                modifier = modifier
                    .width(IntrinsicSize.Max)
                    .padding(bottom = 8.dp, top = 8.dp, start = 4.dp)
                    .height(IntrinsicSize.Max),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Green)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_3),
                    contentDescription = null,
                )
            }
            Card(
                modifier = modifier
                    .width(IntrinsicSize.Max)
                    .padding(bottom = 8.dp, top = 8.dp, start = 16.dp)
                    .height(IntrinsicSize.Max),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Green)
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