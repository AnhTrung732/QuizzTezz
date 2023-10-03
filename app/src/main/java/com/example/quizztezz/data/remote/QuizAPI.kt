package com.example.quizztezz.data.remote

import com.example.quizztezz.BuildConfig
import com.example.quizztezz.model.Quiz
import retrofit2.http.GET
import retrofit2.http.Query

interface QuizAPI {
    @GET("/api/v1/questions")
    suspend fun getAllQuizzes(
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY,
        @Query("limit") limit: Int? = 10,
        @Query("category") category : String?,
        @Query("difficulty") difficulty : String?,
    ): List<Quiz>
}