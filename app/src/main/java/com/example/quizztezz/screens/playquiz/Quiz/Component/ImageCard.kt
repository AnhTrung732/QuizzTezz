package com.example.quizztezz.screens.playquiz.Quiz.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String? = "",
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp),
    ) {
        Image(
            painter = painter,
            contentDescription = contentDescription ?: "",
            contentScale = ContentScale.Crop
        )
    }
}