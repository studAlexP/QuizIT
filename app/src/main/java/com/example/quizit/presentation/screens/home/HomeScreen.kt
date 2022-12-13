package com.example.quizit.presentation.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizit.presentation.navigation.Screen
import com.example.quizit.ui.theme.AccentGreen
import com.example.quizit.ui.theme.GreyBG


@Composable
fun HomeScreen(
    navController: NavController
){
    Row {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                text = "Welcome to QuizIT!",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(0.dp,50.dp,0.dp,0.dp)
                    .align(CenterHorizontally)

            )
        }

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp, 300.dp, 10.dp, 10.dp)
    ) {
        Row {
           Text(
               text = "Please enter your name:",
               style = MaterialTheme.typography.h5,
               modifier = Modifier
                   .padding(20.dp, 10.dp, 10.dp, 10.dp)


           )
        }
        Row{
            Column {
                NameField()
            }
            Column(
                modifier = Modifier
                .padding(0.dp, 20.dp, 0.dp, 10.dp)) {
                OutlinedButton(
                    onClick = { navController.navigate(Screen.SettingsScreen.route) },
                    border = BorderStroke(2.dp, AccentGreen),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = GreyBG,
                        contentColor = androidx.compose.ui.graphics.Color.White
                    ),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .width(width = 70.dp)
                        .height(height = 52.dp)
                ) {
                    Text(text="Go!")
                }
            }


        }

    }

}

@Composable
fun NameField() {
    Column(Modifier.padding(16.dp)) {
        val textState = remember { mutableStateOf(TextFieldValue()) }
        TextField(
            value = textState.value,
            onValueChange = { textState.value = it },
            modifier = Modifier.border(
                BorderStroke(width = 2.dp, color = AccentGreen),
                shape = RoundedCornerShape(50)
            ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = GreyBG,
                focusedIndicatorColor = GreyBG,
                unfocusedIndicatorColor = GreyBG
            ),
        )
    }
}