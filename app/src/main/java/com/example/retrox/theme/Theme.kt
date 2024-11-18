package com.global.tryggdevelopment.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = white,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    onPrimary = white,
    onSecondary = primaryColor,
    onTertiary = blue,
    surface = toggleWhite,
    onSurface = toggleGreen,
    primaryContainer = lineColor
)

private val LightColorScheme = lightColorScheme(
    primary = white,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    onPrimary = white,
    onSecondary = primaryColor,
    onTertiary = blue,
    surface = toggleWhite,
    onSurface = toggleGreen,
    primaryContainer = lineColor

    /* Other default colors to override
                background = Color(0xFFFFFBFE),
                surface = Color(0xFFFFFBFE),
                onPrimary = Color.White,
                onSecondary = Color.White,
                onTertiary = Color.White,
                onBackground = Color(0xFF1C1B1F),
                onSurface = Color(0xFF1C1B1F),
*/
)

// Extra colors with material theme
val ColorScheme.textGray: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkGray else darkGray

val ColorScheme.panicRed: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkRed else darkRed

val ColorScheme.menuBackground: Color
    @Composable
    get() = if (isSystemInDarkTheme()) backgroundWhite else backgroundWhite
val ColorScheme.blackText: Color
    @Composable
    get() = if (isSystemInDarkTheme()) black else black
val ColorScheme.blueLinkColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) linkBlueColor else linkBlueColor


val ColorScheme.grayIncidentText: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentGray else incidentGray

val ColorScheme.white70: Color
    @Composable
    get() = if (isSystemInDarkTheme()) whiteAlpha70 else whiteAlpha70

val ColorScheme.white80: Color
    @Composable
    get() = if (isSystemInDarkTheme()) whiteAlpha80 else whiteAlpha80

val ColorScheme.white60: Color
    @Composable
    get() = if (isSystemInDarkTheme()) whiteAlpha60 else whiteAlpha60

val ColorScheme.incidentYellowColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentYellow else incidentYellow

val ColorScheme.editProfileShowHideColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) editProfileShowHide else editProfileShowHide


val ColorScheme.incidentBlueColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentBlue else incidentBlue

val ColorScheme.forgotButtonColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) forgotBlueButton else forgotBlueButton

val ColorScheme.loginButtonColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) loginButton else loginButton


val ColorScheme.incidentRedColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentRed else incidentRed

val ColorScheme.incidentTextRedColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentTextRed else incidentTextRed

val ColorScheme.incidentTextYellowColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentTextYellow else incidentTextYellow
val ColorScheme.incidentTextBlueColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentTextBlue else incidentTextBlue

val ColorScheme.editTextBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) editTextBorder else editTextBorder

val ColorScheme.editTextBackgroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) editTextBackground else editTextBackground

val ColorScheme.buttonTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) buttonText else buttonText

val ColorScheme.buttonDarkGrayColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) buttonDarkGray else buttonDarkGray

val ColorScheme.menuBackGroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) menuBackGround else menuBackGround

val ColorScheme.menuLineColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) menuLine else menuLine

val ColorScheme.grayTextAlpha70Color: Color
    @Composable
    get() = if (isSystemInDarkTheme()) grayTextAlpha70 else grayTextAlpha70

val ColorScheme.grayColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) gray else gray

val ColorScheme.grayAlphaColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) grayTextColorAlpha70 else grayTextColorAlpha70

val ColorScheme.panicCloseBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) panicCloseBorder else panicCloseBorder

val ColorScheme.plusGrayColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) grayCheckBox else grayCheckBox

val ColorScheme.lightRedColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightRed else lightRed

val ColorScheme.panicDetailTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) panicDetailText else panicDetailText

val ColorScheme.panicTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) panicText else panicText

val ColorScheme.panicBackGroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) panicBackGround else panicBackGround

val ColorScheme.greenBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) greenBorder else greenBorder

val ColorScheme.greenColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) green else green

val ColorScheme.greenTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) greenText else greenText

val ColorScheme.greenTextAlphaColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) greenTextAlpha else greenTextAlpha

val ColorScheme.whiteTextAlphaColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) whiteTextAlpha else whiteTextAlpha

val ColorScheme.incidentLightRed: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightRedIncident else lightRedIncident

val ColorScheme.incidentLightYellow: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightYellowIncident else lightYellowIncident

val ColorScheme.incidentLightBlue: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightBlueIncident else lightBlueIncident

val ColorScheme.incidentSelectBgColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) grayLightColor  else grayLightColor

val ColorScheme.noDataAvailableColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentNoAlertGrayColor  else incidentNoAlertGrayColor

val ColorScheme.incidentDotColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) incidentDotBorderColor  else incidentDotBorderColor

val ColorScheme.lightYellowColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightYellow else lightYellow

val ColorScheme.hintTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) hint_color else hint_color

val ColorScheme.darkYellowColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkYellow else darkYellow

val ColorScheme.emergencyLightRedColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) emergencyLightRed else emergencyLightRed

val ColorScheme.lightGreenColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightGreen else lightGreen

val ColorScheme.darkRedPanicColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkRedPanic else darkRedPanic

val ColorScheme.userDetailLineColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) userDetailLine else userDetailLine

val ColorScheme.grayVerifiedColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) grayVerified else grayVerified

val ColorScheme.filterOrangeColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) filterOrange else filterOrange

val ColorScheme.filterGrayColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) filterGray else filterGray

val ColorScheme.filterUserColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) filterUser else filterUser

val ColorScheme.onGoingGreenColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) onGoingGreen else onGoingGreen

val ColorScheme.textGreenColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) textGreen else textGreen

val ColorScheme.noDataGrayColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) noDataGray else noDataGray

val ColorScheme.darkBlueTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkBlueText else darkBlueText

val ColorScheme.journeyLocationTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) journeyLocationText else journeyLocationText

val ColorScheme.darkOrangeColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkOrange else darkOrange

val ColorScheme.lightBlackColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightBlack else lightBlack

val ColorScheme.lightOrangeColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) lightOrange else lightOrange

val ColorScheme.conversationReceiverTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) conversationReceiverText else conversationReceiverText

val ColorScheme.semiTransparentBlackColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) semiTransparentBlack else semiTransparentBlack

val ColorScheme.offlineDeleteTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) offlineDeleteText else offlineDeleteText

val ColorScheme.offlineDeleteLineColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) offlineDeleteLine else offlineDeleteLine

val ColorScheme.regionAlertTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) regionAlertText else regionAlertText

val ColorScheme.darkRedBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkRedBorder else darkRedBorder

val ColorScheme.darkYellowBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkYellowBorder else darkYellowBorder

val ColorScheme.darkBlueBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) darkBlueBorder else darkBlueBorder

val ColorScheme.panicViewUserColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) panicViewUser else panicViewUser

val ColorScheme.notificationBlueColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) notificationBlue else notificationBlue

val ColorScheme.advisoryGreenColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) advisoryGreen else advisoryGreen

val ColorScheme.notificationBackgroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) notificationBackground else notificationBackground

val ColorScheme.advisoryBackgroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) advisoryBackground else advisoryBackground

val ColorScheme.notificationBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) notificationBorder else notificationBorder

val ColorScheme.advisoryBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) advisoryBorder else advisoryBorder

val ColorScheme.notificationTitleColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) notificationTitle else notificationTitle

val ColorScheme.notificationDetailColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) notificationDetail else notificationDetail

val ColorScheme.advisoryTitleColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) advisoryTitle else advisoryTitle

val ColorScheme.advisoryDetailColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) advisoryDetail else advisoryDetail

@Composable
fun TryggAndroidRevampTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}
