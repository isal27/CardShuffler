package com.example.cardshuffler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardshuffler.ui.theme.CardShufflerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardShufflerTheme {
                CardShufflerApp()
            }
        }
    }
}

@Preview
@Composable
fun CardShufflerApp() {
    CardWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun CardWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable._1
        2 -> R.drawable._2
        3 -> R.drawable._3
        4 -> R.drawable._4
        5 -> R.drawable._5
        6 -> R.drawable._6
        7 -> R.drawable._7
        8 -> R.drawable._8
        9 -> R.drawable._9
        10 -> R.drawable._10
        11 -> R.drawable._11
        12 -> R.drawable._12
        13 -> R.drawable._13
        14 -> R.drawable._14
        15 -> R.drawable._15
        16 -> R.drawable._16
        17 -> R.drawable._17
        18 -> R.drawable._18
        19 -> R.drawable._19
        20 -> R.drawable._20
        21 -> R.drawable._21
        22 -> R.drawable._22
        23 -> R.drawable._23
        24 -> R.drawable._24
        25 -> R.drawable._25
        26 -> R.drawable._26
        27 -> R.drawable._27
        else ->R.drawable._28
    }
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 12.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = imageResource),contentDescription =result.toString()
        )
        Spacer(modifier = Modifier.height(46.dp))
        Button(onClick = { result = (1..28).random() }) {
            Text(stringResource(R.string.shuffel))
        }
    }
}