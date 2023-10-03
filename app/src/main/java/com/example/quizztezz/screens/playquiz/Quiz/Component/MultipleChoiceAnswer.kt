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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.ExperimentalPagingApi
import com.example.quizztezz.model.Quiz
import com.example.quizztezz.screens.playquiz.Quiz.Component.CardItem
import com.example.quizztezz.theme.OnestFont
import com.example.quizztezz.theme.listColor
import kotlinx.coroutines.flow.first
import javax.inject.Inject

@Composable
fun MultipleChoiceQuiz(quiz: Quiz, modifier : Modifier = Modifier) {
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
                text = quiz.answer.listAnswers.answer_a,
                pairColors = listColor[0]

            ) {}
            CardItem(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp, 0.dp),
                text = quiz.answer.listAnswers.answer_b,
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
                text = quiz.answer.listAnswers.answer_c,
                pairColors = listColor[2]
            ) {}

            CardItem(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp, 0.dp),
                text = quiz.answer.listAnswers.answer_d,
                pairColors = listColor[3]
            ) {}
        }
    }
}



@OptIn(ExperimentalPagingApi::class)
@Composable
@Preview
fun AnswerTypePreview(quizScreenViewModel: QuizScreenViewModel = hiltViewModel()) {

}
