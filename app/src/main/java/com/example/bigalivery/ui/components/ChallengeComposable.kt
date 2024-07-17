package com.example.bigalivery.ui.components

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.bigalivery.R
import com.example.bigalivery.ui.theme.BigaliveryTheme
import com.example.bigalivery.ui.theme.Purple200
import com.example.bigalivery.ui.theme.Purple700
import com.example.bigalivery.ui.theme.Teal200

class ChallengeComposable : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            BigaliveryTheme {
                Surface {
                    ChallangeOneResolution()
                }
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    private fun ChallangeOneResolution() {
        Row(modifier = Modifier
            .width(1500.dp)
            .height(200.dp)){
            Box(modifier = Modifier
                .fillMaxHeight()
                .background(Color.Blue)
                .width(100.dp))
            Column {
                Text(text = "Test 1",
                    Modifier
                        .background(Color.LightGray)
                        .fillMaxWidth()
                        .padding(15.dp))
                Text(text = "Test 2", Modifier.padding(15.dp))
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun ChallengeOneResult() {
        Row(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
        ) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .width(100.dp)
                    .background(Color.Blue)
            )
            Column {
                Text(
                    "Test 1",
                    Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFededed))
                        .padding(16.dp)
                )
                Text("Test 2", Modifier.padding(16.dp))
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun ChallangeTwoResolution() {
        Surface(modifier = Modifier.padding(10.dp), shape = RoundedCornerShape(10.dp), shadowElevation = 4.dp) {
            Row(
                Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .fillMaxHeight()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(Teal200, Purple200)
                            )
                        )
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.ic_launcher_background
                        ),
                        contentDescription = "Imagem do Produto",
                        Modifier
                            .size(80.dp)
                            .offset(x = 80.dp / 2)
                            .clip(shape = CircleShape)
                            .align(Alignment.CenterEnd)
                            .border(
                                width = 2.dp, brush = Brush.verticalGradient(
                                    colors = listOf(Purple200, Teal200)
                                ), shape = CircleShape
                            )
                    )
                }
                Spacer(modifier = Modifier.width(80.dp / 2))
                Text(
                    text = LoremIpsum(50).values.first(),
                    Modifier.padding(80.dp / 2),
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ChallengeTwoResult() {
        Surface(Modifier.padding(8.dp),shape = RoundedCornerShape(8.dp), shadowElevation = 4.dp) {
            Row(
                Modifier
                    .height(height = 200.dp)
                    .fillMaxWidth()
            ) {
                val imageSize = 100.dp
                Box(
                    Modifier
                        .fillMaxHeight()
                        .width(imageSize)
                        .background(
                            brush = Brush.verticalGradient(
                                listOf(
                                    Purple700, Purple200
                                )
                            )
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        Modifier
                            .size(imageSize)
                            .align(Alignment.Center)
                            .offset(x = imageSize / 2)
                            .clip(CircleShape)
                            .border(
                                BorderStroke(
                                    2.dp, brush = Brush.verticalGradient(
                                        listOf(
                                            Purple200, Purple700
                                        )
                                    )
                                ), CircleShape
                            )
                    )
                }
                Spacer(Modifier.width(imageSize / 2))
                Box(
                    Modifier
                        .padding(16.dp)
                        .fillMaxHeight()
                        .padding(16.dp)
                        .align(CenterVertically),
                ) {
                    Column {
                        Text(
                            text = LoremIpsum(50).values.first(),
                            overflow = TextOverflow.Ellipsis,
                            lineHeight = 20.sp
                        )
                    }
                }
            }
        }
    }
}