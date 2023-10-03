package com.example.quizztezz.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.quizztezz.util.Constants.QUIZ_TABLE
import kotlinx.serialization.Serializable


@Serializable
@Entity(tableName = QUIZ_TABLE)
data class Quiz (
    @PrimaryKey(autoGenerate = false)
    val id : String,
    @Embedded
    val question: Question,
    @Embedded
    val answer: Answers,
    @Embedded
    val tag : QuizTag,
)


