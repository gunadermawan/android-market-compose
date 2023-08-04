package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListItem
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainCategory(item: ListItem, modifier: Modifier = Modifier) {
    Box {
        Card(
            modifier
                .width(140.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background)
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.ic_computer),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Column(
                    modifier = modifier

                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = item.title,
                        maxLines = 2,
                        overflow = TextOverflow.Clip,
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.ExtraBold)
                    )
                    Text(text = item.price, style = MaterialTheme.typography.titleSmall)
                }
            }
        }
    }
}

@Preview
@Composable
fun MainCategoryPreview() {
    MarketTheme {
        MainCategory(
            item = ListItem(R.drawable.ic_computer, "Laptop MSI", "Rp. 12.000.000"),
            modifier = Modifier.padding(8.dp)
        )
    }
}