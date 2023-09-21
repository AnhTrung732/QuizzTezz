package com.example.quizztezz.screens.playquiz.Quiz.Component

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizztezz.R
import com.example.quizztezz.screens.playquiz.Quiz.NextOrSubmitButton
import com.example.quizztezz.theme.Gray
import com.example.quizztezz.theme.OnestFont
import com.example.quizztezz.theme.Yellow

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Box(modifier = Modifier
            .height(20.dp)
            .weight(1f))
        {
            Text(
                text = "1/10",
                fontFamily = OnestFont.OnestBoldFamily,
            )
        }

        //Spacer(modifier = Modifier.width(16.dp))
        Box(modifier = Modifier.weight(1f))
        {
            QuizStageBar(
                numberStage = 1,
                modifier = Modifier
                    .height(10.dp)
            )
        }

        //Spacer(modifier = Modifier.width(16.dp))

        Box(modifier = Modifier.weight(1f)) {
            IconImageButton(
                R.drawable.ic_dot_menu,
                Modifier
                    .height(20.dp)
                    .align(Alignment.CenterEnd),
                onClick = {}
            )
        }
    }
}

@Composable
fun IconImageButton(drawableResId: Int, modifier: Modifier = Modifier, onClick: () -> Unit ) {
    val painter: Painter = painterResource(id = drawableResId)

    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Image(
            painter = painter,
            modifier = modifier,
            contentDescription = null // Add a description if needed
        )
    }
}

@Composable
fun QuizStageBar(
    numberStage: Int? = 1,
    modifier: Modifier = Modifier,
    progress: Float = 0.1f
) {
    Box(
        modifier = modifier
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(9.dp))
                .background(Gray)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(progress)
                .fillMaxHeight()
                .clip(RoundedCornerShape(9.dp))
                .background(Yellow)
                .animateContentSize()
        )
    }
}

@Composable
@Preview
fun QuizStageBarPreview() {
    QuizStageBar(9, modifier = Modifier.height(10.dp))
}
