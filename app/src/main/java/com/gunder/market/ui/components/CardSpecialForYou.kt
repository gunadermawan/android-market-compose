package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListCardForYou
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardSpecialForYou(listCardForYou: ListCardForYou, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        RoundedCornerShape(8.dp)
    ) {
        Image(
            painter = painterResource(id = listCardForYou.imgCard),
            contentDescription = listCardForYou.txtDesc.toString(),
        )
    }
}

@Preview
@Composable
fun CardSpecialForYouPreview() {
    MarketTheme {
        CardSpecialForYou(
            listCardForYou = ListCardForYou(
                R.drawable.banner_vertikal1,
                R.string.txt_desc_first_banner
            )
        )
    }
}