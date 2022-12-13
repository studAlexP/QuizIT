package com.example.quizit.presentation.screens.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizit.ui.theme.AccentGreen
import com.example.quizit.ui.theme.GreyBG

@Composable
fun SettingsScreen(
    navController: NavController
){
    Row {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(0.dp, 50.dp, 0.dp, 0.dp)
                    .align(Alignment.CenterHorizontally)

            )
        }

    }

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(30.dp, 160.dp)
    ) {
        OutlinedButton(
                onClick = { /*TODO*/ },
                border = BorderStroke(2.dp, AccentGreen),
                elevation = ButtonDefaults.elevation(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = GreyBG,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(20),
                modifier = Modifier
                    .width(width = 150.dp)
                    .height(height = 150.dp)
        ){
               Text(
                   text = "Random",
                   style = MaterialTheme.typography.h5

               )
        }

        OutlinedButton(
                onClick = { /*TODO*/ },
                border = BorderStroke(2.dp, AccentGreen),
                elevation = ButtonDefaults.elevation(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = GreyBG,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(20),
                modifier = Modifier
                    .width(width = 150.dp)
                    .height(height = 150.dp)
        ){
                Text(
                    text = "Categories",
                    style = MaterialTheme.typography.h5

                )
        }
    }
}