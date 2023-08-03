package com.gunder.market.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CircleShape(modifier: Modifier = Modifier) {
    val circleColor = Color.White
    Canvas(modifier = modifier.fillMaxSize(), onDraw = {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val radius = (canvasWidth / 4f)
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
        CircleShape()
    }
}