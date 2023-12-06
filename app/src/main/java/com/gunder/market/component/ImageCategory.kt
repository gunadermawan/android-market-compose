package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainImageCategory(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), modifier = modifier.padding(8.dp)) {
            Card(modifier = modifier, shape = RoundedCornerShape(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_1),
                    contentDescription = null
                )
            }
            Card(modifier = modifier) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_2),
                    contentDescription = null
                )
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), modifier = modifier.padding(8.dp)) {
            Card(shape = RoundedCornerShape(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.banner_horizontal_3),
                    contentDescription = null
                )
            }
            Card(shape = RoundedCornerShape(8.dp)) {
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
fun MainImageCategoryPreview() {
    MarketTheme {
        MainImageCategory()
    }
}