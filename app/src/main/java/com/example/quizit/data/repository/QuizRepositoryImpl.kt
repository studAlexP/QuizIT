package com.example.quizit.data.repository

import com.example.quizit.data.network.QuizApi
import com.example.quizit.domain.model.Question
import com.example.quizit.domain.repository.QuizRepository

class QuizRepositoryImpl: QuizRepository {

    override suspend fun getQuestions(
        category: String,
        difficulty: String,
        limit: String
    ): List<Question> {
        return QuizApi.create().getQuestion(
            category, difficulty, limit
        )
    }
}