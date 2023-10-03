package com.example.quizztezz.model

import kotlinx.serialization.Serializable


@Serializable
data class Question(
    val questionString: String,
    val description : String?,
)
