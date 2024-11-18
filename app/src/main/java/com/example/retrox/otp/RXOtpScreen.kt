package com.example.retrox.otp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.example.retrox.R
import com.example.retrox.R.drawable
import com.example.retrox.common.TGCommonTopBarView
import com.example.retrox.login.PhoneNumberInputField
import com.global.tryggdevelopment.ui.theme.spacing_10
import com.global.tryggdevelopment.ui.theme.spacing_16

@Composable
fun RXOtpScreen(
    navController: NavController,
    otpLength: Int = 4,
) {
    val otpValues = remember { mutableStateListOf(*List(otpLength) { "" }.toTypedArray()) }
    val onUpdateOtpValuesByIndex: (Int, String) -> Unit = { index, value ->
        otpValues[index] = value
    }
    val onOtpInputComplete: () -> Unit = {
        val otp = otpValues.joinToString("")
        navController.navigate("next_screen") {
            popUpTo("otp_screen") { inclusive = true }
        }
    }
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary),
        topBar = {
            TGCommonTopBarView(
                onBackArrowClick = {
                    navController.popBackStack()
                } ,
                title = stringResource(id = R.string.OTP),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onPrimary)
                    .padding(
                        start = spacing_10,
                        end = spacing_10,
                        top = spacing_10,
                        bottom = spacing_10
                    )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.onPrimary)
                .padding(paddingValues)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White.copy(alpha = 0.5f)) // Dimming white effect applied here
            ) {
                Image(
                    painter = painterResource(id = drawable.new_bg_image),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()

                )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Image(
                        painter = painterResource(id = drawable.ic_shoe),
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


                    Text(
                        text = "Please Enter the Otp",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                    )

                    OTPInputTextFields(
                        otpLength = otpLength,
                        onUpdateOtpValuesByIndex = onUpdateOtpValuesByIndex,
                        onOtpInputComplete = onOtpInputComplete,
                        otpValues = otpValues,
                        isError = false // Set true if you want to show error UI for invalid OTP
                    )

                    Spacer(modifier = Modifier.height(10.dp)) // Space between input and the next text


                    Button(
                        onClick = { navController.navigate("HomeScreen") },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Submit",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp)) // Space between Get OTP and Skip

                    Text(
                        text = "Back",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                    )
                }
            }
        }
    }
}

@Composable
fun OTPInputTextFields(
    otpLength: Int,
    onUpdateOtpValuesByIndex: (Int, String) -> Unit,
    onOtpInputComplete: () -> Unit,
    modifier: Modifier = Modifier,
    otpValues: List<String> = List(otpLength) { "" }, // Pass this as default for future reference
    isError: Boolean = false,
) {
    val focusRequesters = List(otpLength) { FocusRequester() }
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
//        horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally)
    ) {
        otpValues.forEachIndexed { index, value ->
            OutlinedTextField(
                modifier = Modifier
                    .weight(1f)
//                    .width(64.dp)
                    .padding(6.dp)
                    .focusRequester(focusRequesters[index])
                    .onKeyEvent { keyEvent ->
                        if (keyEvent.key == Key.Backspace) {
                            if (otpValues[index].isEmpty() && index > 0) {
                                onUpdateOtpValuesByIndex(index, "")
                                focusRequesters[index - 1].requestFocus()
                            } else {
                                onUpdateOtpValuesByIndex(index, "")
                            }
                            true
                        } else {
                            false
                        }
                    },
                value = value,
                onValueChange = { newValue ->
                    // To use OTP code copied from keyboard
                    if (newValue.length == otpLength) {
                        for (i in otpValues.indices) {
                            onUpdateOtpValuesByIndex(
                                i,
                                if (i < newValue.length && newValue[i].isDigit()) newValue[i].toString() else ""
                            )
                        }

                        keyboardController?.hide()
                        onOtpInputComplete() // you should validate the otp values first for, if it is only digits or isNotEmpty
                    } else if (newValue.length <= 1) {
                        onUpdateOtpValuesByIndex(index, newValue)
                        if (newValue.isNotEmpty()) {
                            if (index < otpLength - 1) {
                                focusRequesters[index + 1].requestFocus()
                            } else {
                                keyboardController?.hide()
                                focusManager.clearFocus()
                                onOtpInputComplete()
                            }
                        }
                    } else {
                        if (index < otpLength - 1) focusRequesters[index + 1].requestFocus()
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = if (index == otpLength - 1) ImeAction.Done else ImeAction.Next
                ),
                keyboardActions = KeyboardActions(
                    onNext = {
                        if (index < otpLength - 1) {
                            focusRequesters[index + 1].requestFocus()
                        }
                    },
                    onDone = {
                        keyboardController?.hide()
                        focusManager.clearFocus()
                        onOtpInputComplete()
                    }
                ),
                shape = MaterialTheme.shapes.small,
                isError = isError,
                textStyle = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize
                )
            )

            LaunchedEffect(value) {
                if (otpValues.all { it.isNotEmpty() }) {
                    focusManager.clearFocus()
                    onOtpInputComplete()
                }
            }
        }
    }

    LaunchedEffect(Unit) {
        focusRequesters.first().requestFocus()
    }
}
