package com.example.retrox.homeScreen

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.retrox.common.RXNavItems
import com.example.retrox.common.TGCommonTopBarView
import com.global.tryggdevelopment.ui.theme.advisoryBackgroundColor
import com.global.tryggdevelopment.ui.theme.blackText
import com.global.tryggdevelopment.ui.theme.spacing_10
import com.global.tryggdevelopment.ui.theme.spacing_20


@Composable
fun RXHomeScreen(
    navController: NavController
) {
    val navItemsList = listOf(
        RXNavItems("Home", Icons.Default.Home),
        RXNavItems("Cart", Icons.Default.ShoppingCart),
        RXNavItems("Setting", Icons.Default.Settings),
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary),
        topBar = {
            TGCommonTopBarView(
                onBackArrowClick = { } ,
                title = "Retrox",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.blackText)
                    .padding(
                        start = spacing_10,
                        end = spacing_10,
                        top = spacing_20,
                        bottom = spacing_20
                    ),
                showBackButton = false
            )
        },
        bottomBar = {
            NavigationBar {
                navItemsList.forEachIndexed { index, rxNavItems ->
                    NavigationBarItem(
                        selected = true, // Adjust the selection logic
                        onClick = { /* Handle navigation */ },
                        icon = { Icon(imageVector = rxNavItems.icon, contentDescription = "Icon") },
                        label = {
                            Text(text = rxNavItems.label)
                        },
                        interactionSource = remember { MutableInteractionSource() } // Explicitly provide this
                    )
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.advisoryBackgroundColor)
                .padding(paddingValues)
        ) {

        }
    }
}