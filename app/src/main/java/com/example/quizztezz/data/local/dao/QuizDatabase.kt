package com.example.quizztezz.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.quizztezz.util.TagListConverter
import com.example.quizztezz.model.Quiz

@Database(entities = [Quiz::class], version = 2)
@TypeConverters(TagListConverter::class) // Specify your TypeConverter here
abstract class QuizDatabase : RoomDatabase() {
    abstract fun quizDao(): QuizDao
}