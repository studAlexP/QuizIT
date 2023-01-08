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
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.quizit.domain.util.Settings
import com.example.quizit.ui.theme.AccentGreen
import com.example.quizit.ui.theme.GreyBG

@Composable
fun CategoryCard(
    category: String,
    cardClicked: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Card(
            elevation = 10.dp,
            border = BorderStroke(2.dp, AccentGreen),
            shape = RoundedCornerShape(20),
            backgroundColor = GreyBG,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 10.dp, 20.dp, 10.dp)
                .height(height = 150.dp)
                .clickable {
                    Settings.category = category.lowercase()
                    cardClicked()
                }
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(110.dp, 60.dp, 30.dp, 20.dp)
                    .align(CenterVertically),


                ) {
                Text(
                    text = category,
                    style = MaterialTheme.typography.h5
                )
            }
        }
    }
}
