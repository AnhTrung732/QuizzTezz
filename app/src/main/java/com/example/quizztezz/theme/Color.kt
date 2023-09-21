package com.example.quizztezz.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val HeartRed = Color(0xFFFF4444)

val Yellow = Color(0xFFFFCC00)
val Gray = Color(0xFFE5E5E5)
val Red = Color(0xFFE35454)
val RedGray = Color(0xFFBF2D49 )
val Cyan = Color(0xFF30B0C7)
val CyanGray = Color(0xFF0093AD)
val YellowOrange = Color(0xFFFF9500)
val YellowOrangeGray = Color(0xFFB97412)
val Green = Color(0xFF3ED684)
val GreenGray = Color(0xFF578F64)
val Black = Color(0xFF000000)
val Purple = Color(0xFF6D5FF6)


val listColor : List<Pair<Color, Color>>
    get() = listOf(
        Pair(Red, RedGray),
        Pair(Cyan, CyanGray),
        Pair(YellowOrange, YellowOrangeGray),
        Pair(Green, GreenGray),
        Pair(Black, Purple)
    )

val Colors.topAppBarContentColor: Color
    get() = if (isLight) Color.White else Color.LightGray

val Colors.topAppBarBackgroundColor: Color
    get() = if (isLight) Purple500 else Color.Black