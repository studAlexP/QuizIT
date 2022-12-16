package com.example.quizit.presentation.screens.quiz

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.quizit.presentation.navigation.Screen

@Composable
fun QuizScreen(
    navController: NavController
) {
    TopAppBar(
        title = { Text(text = "Linux") },
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "close"
                )
            }
        }
    )
}








