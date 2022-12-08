package com.example.quizit.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizit.data.repository.QuizRepositoryImpl
import com.example.quizit.domain.model.Question
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class QuizViewModel: ViewModel() {

    val questions = MutableStateFlow<List<Question>?>(null)

    companion object {
        var QuizCategory: String = ""
        var QuizDifficulty: String = ""
        var QuizQuestionLimit: String = "1"
    }

    init {
        getQuestions()
    }

    private fun getQuestions() {
        viewModelScope.launch {
            kotlin.runCatching {
                QuizRepositoryImpl().getQuestions(
                    QuizCategory, QuizDifficulty, QuizQuestionLimit
                )
            }.onSuccess {
                questions.value = it
            }
        }
    }
}