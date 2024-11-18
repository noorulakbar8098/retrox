package com.example.retrox.common

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import com.global.tryggdevelopment.ui.theme.font_15
import com.global.tryggdevelopment.ui.theme.font_19

@Composable
fun RXText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontWeight: FontWeight? = null,
    fontSize: TextUnit = font_15,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    fontStyle: FontStyle? = FontStyle.Normal,
    lineHeight: TextUnit = font_19,
    overFlow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = LocalTextStyle.current,
    softWrap: Boolean = true
) {
    // Creating the text
    Text(
        text = text,
        modifier = modifier,
        fontSize = fontSize,
        color = color,
        maxLines = maxLines,
        fontStyle = fontStyle,
        textAlign = textAlign,
        fontWeight = fontWeight,
        lineHeight = lineHeight,
        style = style,
        overflow = overFlow,
        softWrap = softWrap
    )
}