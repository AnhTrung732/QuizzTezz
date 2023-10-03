package com.example.quizztezz.model

import kotlinx.serialization.Serializable

@Serializable
data class QuizTag(
    val tags : List<TagName>,
    val category: Category,
    val difficulty: Difficulty,
)

@Serializable
data class TagName(
    val name: String,
)

enum class Category(
    val Linux: String = "Linux",
    val DevOps: String = "DevOps",
    val Networking: String = "Networking",
    val Code: String = "Code",
    val Cloud: String = "Cloud",
    val Docker: String = "Docker",
    val Kubernetes: String = "Kubernetes",
    val None: String = "",
)
enum class Difficulty (
    val Easy: String = "Easy",
    val Medium: String = "Medium",
    val Hard: String = "Hard",
)

