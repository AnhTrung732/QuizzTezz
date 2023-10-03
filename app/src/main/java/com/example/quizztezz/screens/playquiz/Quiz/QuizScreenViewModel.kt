package com.example.quizztezz.screens.playquiz.Quiz

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.ExperimentalPagingApi
import com.example.quizztezz.data.repository.Repository
import com.example.quizztezz.model.Quiz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalPagingApi
@HiltViewModel
class QuizScreenViewModel @Inject constructor(
    private val quizRepository: Repository
): ViewModel()
{
    // Use MutableState to represent the state of quizzes
    var quizzes by mutableStateOf(emptyList<Quiz>())

    // Function to refresh quizzes (fetch from the API and store in the database).
    suspend fun refreshQuizzes(limit: Int?, category: String?, difficulty: String?) {
        quizRepository.refreshQuizzes(limit, category, difficulty)
    }

    // Function to observe quizzes using Flow and update the MutableState
    fun observeQuizzes() {
        viewModelScope.launch {
            quizRepository.getQuizzes().collect { quizzesList ->
                quizzes = quizzesList
            }
        }
    }
}