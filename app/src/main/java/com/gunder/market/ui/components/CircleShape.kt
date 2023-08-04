package com.gunder.market.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme



@Composable
fun DrawCircle(modifier: Modifier = Modifier) {
    val circleColor = Color.White
    Canvas(modifier = modifier.size(200.dp), onDraw = {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val radius = (canvasWidth / 2f)
//        center the canvas
        val centerX = canvasWidth / 2f
        val centerY = canvasHeight / 2f
        drawCircle(color = circleColor, radius = radius, center = Offset(centerX, centerY))
    })
}

@Preview
@Composable
fun CircleShapePreview() {
    MarketTheme {
        DrawCircle()
    }
}