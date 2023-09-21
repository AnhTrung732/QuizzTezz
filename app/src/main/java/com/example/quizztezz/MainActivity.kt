package com.example.quizztezz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.quizztezz.screens.StartScreen
import com.example.quizztezz.screens.playquiz.Quiz.MultipleChoiceQuiz
import com.example.quizztezz.screens.playquiz.Quiz.QuizScreen
import com.example.quizztezz.screens.playquiz.Quiz.QuizType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartScreen()
        }
        setContent {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val multipleChoiceQuiz = QuizType.MultipleChoice(
                        question = "What is the capital of France?",
                        options = listOf("Paris Paris Paris Paris Paris Paris Paris Paris Paris Paris Paris Paris Paris Paris", "Berlin Berlin Berlin Berlin Berlin", "Madrid Madrid Madrid Madrid Madrid", "Rome Rome Rome Rome Rome"),
                        correctAnswerIndex = 1
                    )
                    QuizScreen(multipleChoiceQuiz)
                }
            }

    }
}