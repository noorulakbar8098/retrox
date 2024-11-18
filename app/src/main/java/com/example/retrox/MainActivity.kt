package com.example.retrox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.retrox.homeScreen.RXHomeScreen
import com.example.retrox.login.RXLoginScreen
import com.example.retrox.otp.RXOtpScreen
import com.example.retrox.ui.theme.RetroxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetroxTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login_screen", builder = {
                    composable("login_screen") {
                        RXLoginScreen(navController = navController)
                    }

                    composable("otp_screen") {
                        RXOtpScreen(navController = navController)
                    }

                    composable("homeScreen") {
                        RXHomeScreen(navController = navController)
                    }
                } )
            }
        }
    }
}