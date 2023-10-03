package com.example.quizztezz.screens.playquiz.Quiz.Component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizztezz.theme.Black
import com.example.quizztezz.theme.OnestFont
import com.example.quizztezz.theme.listColor

@Composable
fun ResultNotification(text : String, pairColors: Pair<Color, Color>,){
    Box() {
        Card(
            shape = RoundedCornerShape(0.dp, 0.dp, 30.dp, 30.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(pairColors.first),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = text,
                    fontSize = 30.sp,
                    fontFamily = OnestFont.OnestBoldFamily,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(20.dp))
                Card(
                    shape = RoundedCornerShape(60.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    ) {
                    Box(
                        modifier = Modifier
                            .padding(60.dp, 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = text,
                            fontSize = 20.sp,
                            fontFamily = OnestFont.OnestBoldFamily,
                            color = Black
                        )
                    }
                }
            }
        }
    }
}


@Composable
@Preview
fun ResultNotificationPreview() {
    ResultNotification(
        "Incorrect !",
        pairColors = listColor[0]
    )
}
