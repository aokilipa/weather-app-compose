package com.example.weatherapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.theme.pink
import com.example.weatherapp.ui.theme.yellow


@Composable
fun SunShape(size: Dp) {
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
            .clip(CircleShape)
    ) {
        Box(
            modifier = Modifier
                .size(size)
                .background(
                    Brush.radialGradient(
                        colors = listOf(yellow, pink),
                        radius = 300f,
                        center = Offset(50.0f, 0.0f)
                    )
                )
        ) {

        }
    }
}

@Preview
@Composable
fun SunShapePreview(){
    SunShape(size = 100.dp)
}