package com.example.bigalivery.ui.components

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bigalivery.ui.theme.BigaliveryTheme

class ChallengeComposable : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            BigaliveryTheme {
                Surface {
                    ChallangeResolution()
                }
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    private fun ChallangeResolution() {
        Row(modifier = Modifier.width(1500.dp)
            .height(200.dp)){
            Box(modifier = Modifier.fillMaxHeight().background(Color.Blue)
                .width(100.dp))
            Column {
                Text(text = "Test 1", Modifier.background(Color.LightGray).fillMaxWidth().padding(15.dp))
                Text(text = "Test 2", Modifier.padding(15.dp))
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun ChallengeResult() {
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
}