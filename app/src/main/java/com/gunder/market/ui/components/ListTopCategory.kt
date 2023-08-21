package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListCategory
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun ListTopCategory(listCategory: ListCategory, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(listCategory.imgTopCategory),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .size(40.dp)
        )
        Text(
            text = stringResource(listCategory.txtTopCategory),
            overflow = TextOverflow.Clip,
            style = MaterialTheme.typography.bodySmall,
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Preview
@Composable
fun ListTopCategoryPreview() {
    MarketTheme {
        ListTopCategory(
            listCategory = ListCategory(R.drawable.promo, R.string.txt_promo_tokopedia),
            modifier = Modifier.padding(8.dp)
        )
    }
}