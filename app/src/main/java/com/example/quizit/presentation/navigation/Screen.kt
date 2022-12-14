package com.example.quizit.presentation.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object SettingsScreen : Screen("settings_screen")
    object StartScreen : Screen("start_screen")
}
