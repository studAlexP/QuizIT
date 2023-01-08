package com.example.quizit.presentation.screens.categories


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizit.presentation.navigation.Screen
import com.example.quizit.presentation.widget.CategoryCard


@Composable
fun CategoriesScreen(
    navController: NavController
){
    Row {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){
            Text(
                text = "Pick a category",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(0.dp, 50.dp, 0.dp, 0.dp)
                    .align(Alignment.CenterHorizontally)

            )
            CategoryCard("Linux") { navController.navigate(Screen.QuizScreen.route)}
            CategoryCard("Bash") { navController.navigate(Screen.QuizScreen.route)}
            CategoryCard("Uncategorized") { navController.navigate(Screen.QuizScreen.route)}
            CategoryCard("Docker") { navController.navigate(Screen.QuizScreen.route)}
            CategoryCard("SQL") { navController.navigate(Screen.QuizScreen.route)}
            CategoryCard("CMS") { navController.navigate(Screen.QuizScreen.route)}
            CategoryCard("Code") { navController.navigate(Screen.QuizScreen.route)}
            CategoryCard("DevOps") { navController.navigate(Screen.QuizScreen.route)}

        }

    }


}
