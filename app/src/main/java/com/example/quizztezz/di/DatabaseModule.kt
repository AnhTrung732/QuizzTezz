package com.example.quizztezz.di

import android.content.Context
import androidx.room.Room
import com.example.quizztezz.data.local.dao.QuizDatabase
import com.example.quizztezz.util.Constants.QUIZ_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): QuizDatabase {
        return Room.databaseBuilder(
            context,
            QuizDatabase::class.java,
            QUIZ_DATABASE
        ).build()
    }

}