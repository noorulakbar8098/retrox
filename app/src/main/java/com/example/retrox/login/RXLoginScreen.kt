package com.example.retrox.login

import android.graphics.fonts.FontStyle
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.retrox.R


@Composable
fun RXLoginScreen(
    navController: NavController
) {
    var phoneNumber by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White.copy(alpha = 0.5f)) // Dimming white effect applied here
    ) {
        Image(
            painter = painterResource(id = R.drawable.new_bg_image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()

        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), // Add padding around the content
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top // Align content at the top
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_shoe),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Adjust height as needed
            )

            Text(
                text = "Retrox",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(40.dp)) // Space between title and the next text

            // Subtext
            Text(
                text = "Please Enter the Phone Number To Get into Purchase",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
            )

            PhoneNumberInputField(
                phoneNumber = phoneNumber,
                onPhoneNumberChange = { phoneNumber = it }
            )

            Spacer(modifier = Modifier.height(10.dp)) // Space between input and the next text


            Button(
                onClick = {
                    navController.navigate("otp_screen")
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Get OTP",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                )
            }
                Spacer(modifier = Modifier.height(10.dp)) // Space between Get OTP and Skip

            Text(
                text = "Skip",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                modifier = Modifier.
                clickable {
                    navController.navigate("HomeScreen")
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneNumberInputField(
    phoneNumber: String,
    onPhoneNumberChange: (String) -> Unit
) {
    var isFocused by remember { mutableStateOf(false) }
    OutlinedTextField(
        value = phoneNumber,
        onValueChange = {
            if (it.length <= 10 && it.all { char -> char.isDigit() }) {
                onPhoneNumberChange(it)
            }
        },
        placeholder = { Text("Enter phone number") },
        leadingIcon = { Icon(Icons.Default.Phone, contentDescription = null) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Phone,
            imeAction = ImeAction.Done
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Color.White.copy(alpha = 0.5f),
            focusedTextColor = Color.Black,
            cursorColor = Color.Black,
            focusedBorderColor = Color.LightGray,
            unfocusedBorderColor = Color.LightGray
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .onFocusChanged {
                isFocused = it.isFocused
            }
    )
}



