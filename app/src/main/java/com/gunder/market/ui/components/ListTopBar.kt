package com.gunder.market.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListTopBar

@Composable
fun ListTopBar(listTopBar: ListTopBar, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(8.dp)
            .height(IntrinsicSize.Min)
    ) {
        Image(
            painter = painterResource(id = listTopBar.imgTopBar),
            contentDescription = null,
            modifier = modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.size(4.dp))
        Column(modifier = modifier.align(Alignment.CenterVertically)) {
            Text(text = stringResource(listTopBar.txtTopBar), fontSize = 14.sp)
            Text(
                text = stringResource(listTopBar.descTopBar),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 8.dp)
                .width(1.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ListTopBarPreview() {
    ListTopBar(
        listTopBar = ListTopBar(
            R.drawable.plus,
            R.string.txt_dummy_discount,
            R.string.txt_subscription
        )
    )
}