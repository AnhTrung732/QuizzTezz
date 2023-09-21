package com.example.quizztezz.screens.playquiz.Quiz

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.quizztezz.R
import com.example.quizztezz.screens.playquiz.Quiz.Component.CardItem
import com.example.quizztezz.screens.playquiz.Quiz.Component.ContentQuestion
import com.example.quizztezz.screens.playquiz.Quiz.Component.ImageCard
import com.example.quizztezz.screens.playquiz.Quiz.Component.TopBar
import com.example.quizztezz.theme.listColor


@Composable
fun QuizScreen(quizType: QuizType){
//    ConstraintLayout(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        val (topBar, imageCard, contentQuestion, answerCard, nextButton) = createRefs()
//
//        TopBar(modifier = Modifier.constrainAs(topBar) {
//            top.linkTo(parent.top, margin = 16.dp)
//            start.linkTo(parent.start, margin = 16.dp)
//            end.linkTo(parent.end, margin = 16.dp)
//        })
//        ImageCard(
//            painterResource(id = R.drawable.city),
//            "City",
//            modifier = Modifier
//                .height(200.dp)
//                .padding(16.dp)
//                .constrainAs(imageCard)
//                {
//                    top.linkTo(topBar.bottom, margin = 30.dp)
//                    start.linkTo(topBar.start)
//                },
//        )
//        ContentQuestion(
//            quizType.question,
//            modifier = Modifier.constrainAs(contentQuestion){
//                top.linkTo(imageCard.bottom, margin = 30.dp)
//                start.linkTo(topBar.start)
//            }
//        )
//        AnswerCard(quizType, modifier = Modifier.fillMaxHeight(0.7f).constrainAs(answerCard){
//            top.linkTo(contentQuestion.bottom, margin = 30.dp)
//            //bottom.linkTo(nextButton.bottom)
//        })
//        NextOrSubmitButton("Next", modifier = Modifier.constrainAs(nextButton){
//            //bottom.linkTo(parent.bottom )
//            top.linkTo(answerCard.bottom)
//            start.linkTo(topBar.start)
//        })
//    }
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
            quizType.question,
        )
        AnswerCard(quizType, modifier = Modifier.fillMaxHeight(0.7f))
        NextOrSubmitButton("Next")
    }
}

@Composable
fun NextOrSubmitButton(text: String = "Next", modifier: Modifier = Modifier) {
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
        roundedCornerShape = 60.dp
    ) {}
}

@Composable
fun AnswerCard(quizType : QuizType, modifier: Modifier = Modifier) {
    MultipleChoiceQuiz(quizType as QuizType.MultipleChoice, modifier)
}



@Composable
@Preview
fun QuizScreenPreview() {

    val multipleChoiceQuiz = QuizType.MultipleChoice(
        question = "What is the capital of France?",
        options = listOf("Paris Paris Paris Paris Paris", "Berlin Berlin Berlin Berlin Berlin", "Madrid Madrid Madrid Madrid Madrid", "Rome Rome Rome Rome Rome"),
        correctAnswerIndex = 1
    )
    QuizScreen(multipleChoiceQuiz)
}

@Composable
@Preview
fun NextOrSubmitButtonPreview() {
    NextOrSubmitButton()
}