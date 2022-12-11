package com.example.quizit.presentation.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
}
