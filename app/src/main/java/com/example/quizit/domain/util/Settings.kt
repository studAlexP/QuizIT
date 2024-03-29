package com.example.quizit.domain.util

/**
 * Settings object to store API query parameters and players name
 */
object Settings {

    lateinit var name: String
    var category: String = ""
    var difficulty: String = "Easy"
    var limit: String = "10"
}