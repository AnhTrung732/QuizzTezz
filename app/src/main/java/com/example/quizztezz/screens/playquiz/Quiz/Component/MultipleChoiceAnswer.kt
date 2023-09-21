package com.example.quizztezz.screens.playquiz.Quiz

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizztezz.screens.playquiz.Quiz.Component.CardItem
import com.example.quizztezz.theme.OnestFont
import com.example.quizztezz.theme.listColor

@Composable
fun MultipleChoiceQuiz(quizType: QuizType.MultipleChoice, modifier : Modifier = Modifier) {
    // Implement the UI for rendering a multiple-choice quiz here
    Column(
        modifier = modifier
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            CardItem(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp,0.dp),
                text = quizType.options[0],
                pairColors = listColor[0]

            ) {}
            CardItem(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp, 0.dp),
                text = quizType.options[1],
                pairColors = listColor[1]
            ) {}
        }


        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            CardItem(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp, 0.dp),
                text = quizType.options[2],
                pairColors = listColor[2]
            ) {}

            CardItem(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp, 0.dp),
                text = quizType.options[3],
                pairColors = listColor[3]
            ) {}
        }
    }
}



@Composable
@Preview
fun AnswerTypePreview() {
    val multipleChoiceQuiz = QuizType.MultipleChoice(
        question = "What is the capital of France?",
        options = listOf("Paris", "Berlin", "Madrid", "Rome"),
        correctAnswerIndex = 1
    )
    MultipleChoiceQuiz(multipleChoiceQuiz)
}
