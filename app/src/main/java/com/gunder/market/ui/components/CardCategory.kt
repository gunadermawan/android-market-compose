package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListCategory
import com.gunder.market.model.ListItem
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainCategory(listCategory: ListCategory, modifier: Modifier = Modifier) {
    Box {
        Card(
            modifier
                .width(120.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray)
        ) {
            Column(modifier = modifier) {
                Image(
                    painter = painterResource(listCategory.imgCategory),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = modifier
                        .fillMaxWidth()
                        .size(60.dp)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(
                    text = stringResource(listCategory.txtCategory),
                    overflow = TextOverflow.Clip,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.ExtraBold),
                    modifier = modifier
                        .paddingFromBaseline(bottom = 16.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }
        }
    }
}

@Preview
@Composable
fun MainCategoryPreview() {
    MarketTheme {
        MainCategory(
            listCategory = ListCategory(R.drawable.ic_computer, R.string.txt_category_laptop),
            modifier = Modifier.padding(8.dp)
        )
    }
}