package com.example.quizztezz.model

import androidx.room.Embedded
import kotlinx.serialization.Serializable

@Serializable
data class Answers(
    @Embedded
    val listAnswers: ListAnswers,

    val isMultipleCorrectAnswers: Boolean,

    @Embedded
    val listCorrectAnswers: ListCorrectAnswers,

    val explanation: String?,
)

@Serializable
data class ListAnswers (
    val answer_a : String,
    val answer_b : String,
    val answer_c : String,
    val answer_d : String,
    val answer_e : String?,
    val answer_f : String?,
)

@Serializable
data class ListCorrectAnswers(
    val answer_a_correct : Boolean,
    val answer_b_correct : Boolean,
    val answer_c_correct : Boolean,
    val answer_d_correct : Boolean,
    val answer_e_correct : Boolean,
    val answer_f_correct : Boolean,
)