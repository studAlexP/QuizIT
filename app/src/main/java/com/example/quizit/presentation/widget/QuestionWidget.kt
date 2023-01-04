package com.example.quizit.presentation.widget

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.quizit.domain.model.Question

@Composable
fun DisplayQuestion(
    quiz: List<Question>,
    endButtonPressed: () -> Unit
) {
    val questionIndex = remember {
        mutableStateOf(0)
    }

    TopAppBar(
        title = { Text(text = quiz[questionIndex.value].category.toString()) },
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "close"
                )
            }
        }
    )

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp, 10.dp, 10.dp, 10.dp)
    ) {
        Text(text = quiz[questionIndex.value].question)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = quiz[questionIndex.value].answers.answerA.toString())
    }

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp, 10.dp, 10.dp, 10.dp)
    ) {
        
        if (questionIndex.value + 1 < quiz.size) {
            Button(onClick = { questionIndex.value = questionIndex.value + 1 }) {
                Text(text = "Next")
            }
        } else {
            Button(onClick = { endButtonPressed() }) {
                Text(text = "End")
            }
        }
    }

}