package com.example.retrox.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.example.retrox.R
import com.global.tryggdevelopment.ui.theme.blackText
import com.global.tryggdevelopment.ui.theme.font_18
import com.global.tryggdevelopment.ui.theme.spacing_8

@Composable
fun TGCommonTopBarView(
    onBackArrowClick: () -> Unit,
    title: String? = null,
    iconText: Int = R.string.back,
    icon: Int = R.drawable.ic_back_arrow_blue,
    modifier: Modifier = Modifier,
    showBackButton: Boolean = true
) {
    Box(
        modifier = modifier
    ) {
        if (showBackButton) {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .clickable {
                        onBackArrowClick()
                    }
            ) {
                RXImageView(
                    modifier = Modifier,
                    image = icon
                )
                RXText(
                    text = stringResource(
                        id = iconText
                    ),
                    modifier = Modifier.padding(start = spacing_8),
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.onTertiary,
                        fontSize = font_18,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
        title?.let {
            RXText(
                modifier = Modifier.align(Alignment.Center),
                text = it,
                style = TextStyle(
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = font_18,
                    fontWeight = FontWeight.Bold
                ),
                softWrap = true,
                maxLines = 1,
                overFlow = TextOverflow.Ellipsis
            )
        }
    }
}