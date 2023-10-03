package com.example.quizztezz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.ExperimentalPagingApi
import com.example.quizztezz.screens.StartScreen
import com.example.quizztezz.screens.playquiz.Quiz.MultipleChoiceQuiz
import com.example.quizztezz.screens.playquiz.Quiz.QuizScreen
import com.example.quizztezz.screens.playquiz.Quiz.QuizScreenViewModel
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagingApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val quizScreenViewModel: QuizScreenViewModel = hiltViewModel()
                    QuizScreen(quizScreenViewModel)
                }
            }

    }
}