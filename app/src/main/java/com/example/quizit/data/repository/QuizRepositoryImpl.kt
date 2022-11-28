package com.example.quizit.data.repository

import com.example.quizit.data.network.QuizApi
import com.example.quizit.domain.model.Question
import com.example.quizit.domain.repository.QuizRepository

class QuizRepositoryImpl: QuizRepository {

    override suspend fun getQuestions(): List<Question> {
        return QuizApi.create().getQuestion()
    }
}