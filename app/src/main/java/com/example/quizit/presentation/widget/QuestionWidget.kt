package com.example.quizit.presentation.widget

import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quizit.domain.model.Question
import com.example.quizit.ui.theme.AccentGreen
import com.example.quizit.ui.theme.GreyBG
import com.example.quizit.ui.theme.LightGrey


@Composable
fun DisplayQuestion(

    quiz: List<Question>,
    endButtonPressed: () -> Unit
) {
    val questionIndex = remember {
        mutableStateOf(0)
    }
    val buttonEnabled by derivedStateOf {
        questionIndex.value >= 1
    }

    Scaffold(
        backgroundColor = GreyBG,
        topBar = {
            TopAppBar(
                backgroundColor = GreyBG,
                elevation = 3.dp
            ) {
                Row {
                    IconButton(
                        enabled = buttonEnabled,
                        onClick = { questionIndex.value = questionIndex.value - 1 }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            "backIcon"
                        )
                    }
                    Text(
                        color = Color.White,
                        text = quiz[questionIndex.value].category.toString(),
                        modifier = Modifier.padding(top = 13.dp)
                    )
                }
            }
        }
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp, 50.dp, 10.dp, 10.dp)
        ) {
            Text(text = quiz[questionIndex.value].question)
        }

        val textChipRememberAState = remember {
            mutableStateOf(false)
        }
        val textChipRememberBState = remember {
            mutableStateOf(false)
        }
        val textChipRememberCState = remember {
            mutableStateOf(false)
        }
        val textChipRememberDState = remember {
            mutableStateOf(false)
        }
        val textChipRememberEState = remember {
            mutableStateOf(false)
        }
        val textChipRememberFState = remember {
            mutableStateOf(false)
        }

        Column(

            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(50.dp, 150.dp, 50.dp)
        ) {
            if (quiz[questionIndex.value].answers.answerA != null) {
                AnswerChip(
                    isSelected = textChipRememberAState.value,
                    text = quiz[questionIndex.value].answers.answerA.toString(),
                    selectedColor = DarkGray,
                    onChecked = {
                        textChipRememberAState.value = it
                    }
                )
            }
            if (quiz[questionIndex.value].answers.answerB != null) {
                AnswerChip(
                    isSelected = textChipRememberBState.value,
                    text = quiz[questionIndex.value].answers.answerB.toString(),
                    selectedColor = DarkGray,
                    onChecked = {
                        textChipRememberBState.value = it
                    }
                )
            }
            if (quiz[questionIndex.value].answers.answerC != null) {
                AnswerChip(
                    isSelected = textChipRememberCState.value,
                    text = quiz[questionIndex.value].answers.answerC.toString(),
                    selectedColor = DarkGray,
                    onChecked = {
                        textChipRememberCState.value = it
                    }
                )
            }
            if (quiz[questionIndex.value].answers.answerD != null) {
                AnswerChip(
                    isSelected = textChipRememberDState.value,
                    text = quiz[questionIndex.value].answers.answerD.toString(),
                    selectedColor = DarkGray,
                    onChecked = {
                        textChipRememberDState.value = it
                    }
                )
            }
            if (quiz[questionIndex.value].answers.answerE != null) {
                AnswerChip(
                    isSelected = textChipRememberEState.value,
                    text = quiz[questionIndex.value].answers.answerE.toString(),
                    selectedColor = DarkGray,
                    onChecked = {
                        textChipRememberEState.value = it
                    }
                )
            }
            if (quiz[questionIndex.value].answers.answerF != null) {
                AnswerChip(
                    isSelected = textChipRememberFState.value,
                    text = quiz[questionIndex.value].answers.answerF.toString(),
                    selectedColor = DarkGray,
                    onChecked = {
                        textChipRememberFState.value = it
                    }
                )
            }
        }

        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 620.dp, 10.dp, 10.dp)
        ) {
            val context = LocalContext.current
            OutlinedButton(
                shape = RoundedCornerShape(40),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = GreyBG,
                    contentColor = Color.White
                ),
                border = BorderStroke(2.dp, AccentGreen),
                onClick = {
                    textChipRememberAState.value = false
                    textChipRememberBState.value = false
                    textChipRememberCState.value = false
                    textChipRememberDState.value = false
                    textChipRememberEState.value = false
                    textChipRememberFState.value = false

                    Toast.makeText(
                        context,
                        "The correct answers are now highlighted",
                        Toast.LENGTH_SHORT
                    ).show()

                    if (quiz[questionIndex.value].correctAnswers.answerACorrect.toString() == "true") {
                        textChipRememberAState.value = true
                    }
                    if (quiz[questionIndex.value].correctAnswers.answerBCorrect.toString() == "true") {
                        textChipRememberBState.value = true
                    }
                    if (quiz[questionIndex.value].correctAnswers.answerCCorrect.toString() == "true") {
                        textChipRememberCState.value = true
                    }
                    if (quiz[questionIndex.value].correctAnswers.answerDCorrect.toString() == "true") {
                        textChipRememberDState.value = true
                    }
                    if (quiz[questionIndex.value].correctAnswers.answerECorrect.toString() == "true") {
                        textChipRememberEState.value = true
                    }
                    if (quiz[questionIndex.value].correctAnswers.answerFCorrect.toString() == "true") {
                        textChipRememberFState.value = true
                    }
                }
            ) {
                Text(text = "Check Answers")
            }

            if (questionIndex.value + 1 < quiz.size) {
                OutlinedButton(
                    shape = RoundedCornerShape(40),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = GreyBG,
                        contentColor = Color.White
                    ),
                    border = BorderStroke(2.dp, AccentGreen),
                    onClick = {
                        questionIndex.value = questionIndex.value + 1
                        textChipRememberAState.value = false
                        textChipRememberBState.value = false
                        textChipRememberCState.value = false
                        textChipRememberDState.value = false
                        textChipRememberEState.value = false
                        textChipRememberFState.value = false
                    }
                ) {
                    Text(text = "Next")
                }
            } else {
                OutlinedButton(
                    onClick = { endButtonPressed() },
                    shape = RoundedCornerShape(40),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = GreyBG,
                        contentColor = Color.White
                    ),
                    border = BorderStroke(2.dp, AccentGreen)
                ) {
                    Text(text = "End")
                }
            }
        }
    }
}

@Composable
fun AnswerChip(
    isSelected: Boolean,
    text: String,
    onChecked: (Boolean) -> Unit,
    selectedColor: Color = AccentGreen
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(
                5.dp, 0.dp, 0.dp, 10.dp
            )
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = if (isSelected) AccentGreen else LightGrey,
                shape = RoundedCornerShape(40)
            )
            .background(
                color = if (isSelected) selectedColor else Transparent,
                shape = RoundedCornerShape(40)
            )
            .clickable {
                onChecked(!isSelected)
            }
    ) {
        Text(
            text = text,
            modifier = Modifier
                .padding(15.dp),
            textAlign = TextAlign.Center
        )
    }
}

