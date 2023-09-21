package com.example.quizztezz.screens.playquiz.Quiz

sealed class QuizType {
    abstract val question: String // Common property for all quiz types

    data class MultipleChoice(
        override val question: String,
        val options: List<String>,
        val correctAnswerIndex: Int
    ) : QuizType()

    data class MultipleResponse(
        override val question: String,
        val options: List<String>,
        val correctAnswerIndices: List<Int>
    ) : QuizType()

    data class TrueFalse(
        override val question: String,
        val isTrue: Boolean
    ) : QuizType()

    data class ShortAnswer(
        override val question: String,
        val trueAnswer: List<String>
    ) : QuizType()

    data class DragDrop(
        override val question: String,
        val trueOrder: List<String>
    ) : QuizType()

    // Add more quiz types as needed
}