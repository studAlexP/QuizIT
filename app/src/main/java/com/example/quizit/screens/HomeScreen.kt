package com.example.quizit.screens



import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun HomeScreen(

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
            Column() {
                NameField()
            }
            Column(
                modifier = Modifier
                .padding(0.dp, 20.dp, 0.dp, 10.dp)) {
                GoButton()
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
            onValueChange = { textState.value = it }
        )
    }
}

@Composable
fun GoButton() {
    OutlinedButton(onClick = { /* Do something! */ }) {
        Text(text="Go!")
    }
}