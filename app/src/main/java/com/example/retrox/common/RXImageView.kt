package com.example.retrox.common

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun RXImageView(
    modifier: Modifier = Modifier,
    image: Int,
    contentDescription: String? = null,
    colorFilter: ColorFilter? = null,
    contentScale: ContentScale = ContentScale.Crop
) {
    Image(
        modifier = modifier,
        painter = painterResource(image),
        contentDescription = contentDescription,
        contentScale = contentScale,
        colorFilter = colorFilter
    )
}