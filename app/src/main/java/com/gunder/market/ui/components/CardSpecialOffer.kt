package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListSpecialOffer
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardSpecialOffer(listSpecialOffer: ListSpecialOffer, modifier: Modifier = Modifier) {

    Card(
        modifier = modifier.width(120.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray)
    ) {
        Column(modifier = modifier) {
            Image(
                painter = painterResource(id = listSpecialOffer.image),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = modifier
                    .fillMaxWidth()
                    .size(60.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Text(
                text = stringResource(id = listSpecialOffer.title),
                modifier = modifier
                    .align(androidx.compose.ui.Alignment.CenterHorizontally)
                    .paddingFromBaseline(bottom = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardSpecialOfferPreview() {
    MarketTheme {
        CardSpecialOffer(
            ListSpecialOffer(
                R.drawable.ic_electronic,
                R.string.txt_category_electronic
            )
        )
    }
}