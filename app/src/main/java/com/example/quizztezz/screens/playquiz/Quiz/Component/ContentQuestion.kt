package com.example.quizztezz.screens.playquiz.Quiz.Component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quizztezz.theme.OnestFont

@Composable
fun ContentQuestion(question: String = "", modifier: Modifier = Modifier ) {
    LazyColumn(
        modifier = Modifier.height(100.dp),
        contentPadding = PaddingValues(16.dp, 4.dp)
    ) {
        item {
            Text(
                text = question,
                fontFamily = OnestFont.OnestBoldFamily,
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center,
            )
        }
    }
}
