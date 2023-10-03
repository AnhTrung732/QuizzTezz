package com.example.quizztezz.screens.playquiz.Quiz

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.ExperimentalPagingApi
import com.example.quizztezz.R
import com.example.quizztezz.model.Quiz
import com.example.quizztezz.screens.playquiz.Quiz.Component.*
import com.example.quizztezz.theme.listColor


@OptIn(ExperimentalPagingApi::class)
@Composable
fun QuizScreen(quizScreenViewModel: QuizScreenViewModel = hiltViewModel()){
    var visible by remember { mutableStateOf(false) }
    var result by remember { mutableStateOf(true) }
    val quizzes = quizScreenViewModel.quizzes
    val first_quiz = quizzes[0]

    Box {
        Box {
            Column() {
                TopBar()
                ImageCard(
                    painterResource(id = R.drawable.city),
                    "City",
                    modifier = Modifier
                        .height(200.dp)
                        .padding(16.dp)
                )
                ContentQuestion(
                    first_quiz.question.questionString,
                )
                AnswerCard(first_quiz, modifier = Modifier.fillMaxHeight(0.7f))
                NextOrSubmitButton("Next", nextButtonClicked = { visible = !visible })
            }
        }
        Box(modifier = Modifier.fillMaxHeight(0.25f)){
            AnimatedVisibility(visible = visible) {
                ResultNotification("Incorrect !", pairColors = listColor[0])
            }
        }
    }

}

@Composable
fun NextOrSubmitButton(text: String = "Next",nextButtonClicked : () -> Unit, modifier: Modifier = Modifier) {
    CardItem(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(50.dp),
        text = text,
        fontSize = 15.sp,
        fillMaxWidthFraction = 0.99f,
        fillMaxHeightFraction = 0.8f,
        pairColors = listColor[4],
        roundedCornerShape = 60.dp,
        onButtonClick = nextButtonClicked,
    )
}


@Composable
fun AnswerCard(quiz : Quiz, modifier: Modifier = Modifier) {
    MultipleChoiceQuiz(quiz, modifier)
}



@Composable
@Preview
fun QuizScreenPreview() {
}

@Composable
@Preview
fun NextOrSubmitButtonPreview() {
    //NextOrSubmitButton()
    ResultNotification("Incorrect !", pairColors = listColor[0])
}