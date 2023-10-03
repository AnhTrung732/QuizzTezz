package com.example.quizztezz.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.quizztezz.model.Quiz
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizDao {

    @Query("SELECT * FROM quiz_table")
    fun getAllQuizzesAsFlow(): Flow<List<Quiz>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuizzes(images: List<Quiz>)

    @Query("DELETE FROM quiz_table")
    suspend fun deleteAllQuizzes()

}