package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListBottomCategory
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun ListBottomCategory(listBottomCategory: ListBottomCategory, modifier: Modifier = Modifier) {
    Column(modifier = modifier.widthIn(min = 32.dp)) {
        Image(
            painter = painterResource(listBottomCategory.imgBottomCategory),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .size(40.dp)
        )
        Text(
            text = stringResource(listBottomCategory.txtBottomCategory),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodySmall,
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ListBottomCategoryPreview() {
    MarketTheme {
        ListBottomCategory(
            listBottomCategory = ListBottomCategory(
                R.drawable.handphone,
                R.string.txt_smartphone
            ),
            modifier = Modifier.padding(8.dp)
        )
    }
}