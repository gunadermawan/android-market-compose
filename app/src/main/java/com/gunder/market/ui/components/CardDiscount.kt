package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListDiscount
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardDiscount(listDiscount: ListDiscount, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .widthIn(120.dp)
            .heightIn(60.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Gray)
    ) {
        Row(
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(4.dp)
        ) {
            Text(text = stringResource(id = listDiscount.txtDiscount), fontSize = 48.sp)
            Spacer(modifier = modifier.size(8.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_discount),
                contentDescription = null,
                modifier = modifier
                    .size(48.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}


@Preview(showBackground = true, device = Devices.PIXEL_3_XL)
@Composable
fun CardDiscountPreview() {
    MarketTheme {
        CardDiscount(
            listDiscount = ListDiscount(R.drawable.ic_discount, R.string.txt_dummy_discount_10),
            modifier = Modifier.padding(8.dp)
        )
    }
}