package com.example.quizit.presentation.widget

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizit.ui.theme.AccentGreen
import com.example.quizit.ui.theme.GreyBG

@Composable
fun CategoryCard(
    navController: NavController
){
   Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(30.dp, 160.dp)
    ){
        Card(
            elevation = 10.dp,
            border = BorderStroke(2.dp, AccentGreen),
            shape = RoundedCornerShape(20),
            backgroundColor = GreyBG,
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp,0.dp,30.dp,20.dp)
                .height(height = 150.dp)
                .clickable { /*TODO*/ }
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                )
        ) {
            //Box
                //Box
                    //AsyncImage() --> corresponding picture to category
                //Box
                    //Text --> corresponding text to category
        }
    }

}