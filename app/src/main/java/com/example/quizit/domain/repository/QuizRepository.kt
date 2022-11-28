package com.example.quizit.domain.repository

import com.example.quizit.domain.model.Question

interface QuizRepository {

    suspend fun getQuestions(): List<Question>
}