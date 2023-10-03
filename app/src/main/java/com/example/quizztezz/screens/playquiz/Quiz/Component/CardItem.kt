package com.example.quizztezz.screens.playquiz.Quiz.Component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizztezz.theme.OnestFont
import com.example.quizztezz.theme.listColor

@Composable
fun CardItem(
    modifier: Modifier = Modifier,
    text: String,
    pairColors: Pair<Color, Color>,
    fillMaxWidthFraction: Float = 0.96f,
    fillMaxHeightFraction: Float = 0.98f,
    roundedCornerShape: Dp = 15.dp,
    fontSize: TextUnit = 20.sp,
    onButtonClick: () -> Unit
){
    Box(modifier = modifier.fillMaxSize()
    )
    {
        Box(modifier = Modifier.align(Alignment.BottomEnd).fillMaxWidth(fillMaxWidthFraction).fillMaxHeight(fillMaxHeightFraction)){
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                shape = RoundedCornerShape(roundedCornerShape ?: 15.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(pairColors.second)
            ) {}
        }
        Box(modifier = Modifier.align(Alignment.TopStart).fillMaxSize(fillMaxWidthFraction).fillMaxHeight(fillMaxHeightFraction)) {
            Card(
                modifier = Modifier
                    .clickable { onButtonClick() },
                shape = RoundedCornerShape(roundedCornerShape ?: 15.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(pairColors.first),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    LazyColumn(
                        modifier = Modifier.height(100.dp),
                    ) {
                        item {
                            Text(
                                text = text,
                                fontSize = fontSize,
                                fontFamily = OnestFont.OnestRegularFamily,
                                color = Color.White
                            )
                        }
                    }

                }
            }
        }
    }
}

@Composable
@Preview
fun CardItemPreview() {
    CardItem(
        modifier = Modifier

            .padding(4.dp, 0.dp),
        text = "Test",
        pairColors = listColor[1]
    ) {}
}
