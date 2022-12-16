package com.example.quizit.presentation.screens.categories


import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizit.presentation.widget.CategoryCard


@Composable
fun CategoriesScreen(
    navController: NavController
){
    Row {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                text = "Pick a category",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(0.dp, 50.dp, 0.dp, 0.dp)
                    .align(Alignment.CenterHorizontally)

            )
        }

    }

    CategoryCard(navController = navController)

}
