package com.example.quizztezz.screens
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.quizztezz.R
import com.example.quizztezz.theme.OnestFont

@Composable
fun StartScreen(){
    val onestfont = OnestFont.OnestBoldFamily

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie_1))
    var isPlaying by remember { mutableStateOf(true) }

    val progress by animateLottieCompositionAsState(
        composition = composition,
        isPlaying = isPlaying,
        iterations = Int.MAX_VALUE
    )


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        LottieAnimation(
            modifier = Modifier.size(400.dp, 250.dp),

            composition = composition,
            progress = {progress}
        )
        Text("QuizzTezz", fontSize = 30.sp, fontFamily = onestfont)
    }
}

@Composable
@Preview
fun StartScreenPreview() {
    StartScreen()
}