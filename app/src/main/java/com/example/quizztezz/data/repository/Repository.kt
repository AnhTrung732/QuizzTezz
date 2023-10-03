package com.example.quizztezz.data.repository

import androidx.lifecycle.ViewModel
import androidx.paging.ExperimentalPagingApi
import com.example.quizztezz.BuildConfig
import com.example.quizztezz.data.local.dao.QuizDatabase
import com.example.quizztezz.data.remote.QuizAPI
import com.example.quizztezz.model.Quiz
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val quizAPI : QuizAPI,
    private val quizDatabase: QuizDatabase,
)
{
    // Fetch quizzes from the remote API and store them in the local database.
    suspend fun refreshQuizzes(limit: Int?, category: String?, difficulty: String?) {
        val quizzes = quizAPI.getAllQuizzes( apiKey = BuildConfig.API_KEY, limit = limit, category = category, difficulty = difficulty)
        quizDatabase.quizDao().insertQuizzes(quizzes)
    }

    // Get quizzes as a Flow from the local database.
    fun getQuizzes(): Flow<List<Quiz>> {
        return quizDatabase.quizDao().getAllQuizzesAsFlow()
    }
}