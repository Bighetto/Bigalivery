package com.example.bigalivery.ui.components

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bigalivery.ui.theme.BigaliveryTheme

class TestComponent : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent{
            BigaliveryTheme {
                Surface{
                    MyFirstComposeable()
                }
            }
        }
    }


    @Composable
    fun MyFirstComposeable() {
        Text(text = "Teste 1")
        Text(text = "Teste 2")

    }

    @Preview
    @Composable
    private fun ColumnPreview() {

        Column {
            Text(text = "Texto 1")
            Text(text = "Texto 2")
        }
    }

    @Preview
    @Composable
    private fun RowPreview() {

        Row {
            Text(text = "Texto 1")
            Text(text = "Texto 2")
        }

    }

    @Preview
    @Composable
    private fun BoxPreview() {

        Box {
            Text(text = "Texto 1")
            Text(text = "Texto 2")
        }

    }

    @Preview
    @Composable
    private fun MyFirstCompositablePreview() {

        Column(
            Modifier
                .padding(all = 26.dp)
                .background(Color.Blue)
                .height(300.dp)
        ) {
            Text(text = "Texto 1")
            Text(text = "Texto 2")
            Row(
                Modifier
                    .padding(horizontal = 26.dp)
                    .background(Color.Green)
            ) {
                Text(text = "Texto 3")
                Text(text = "Texto 4")
            }
            Box(
                Modifier
                    .background(Color.Red)
                    .padding(all = 22.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Row {
                    Text(text = "Texto 5")
                    Text(text = "Texto 6")
                }
                Column {
                    Text(text = "Texto 7")
                    Text(text = "Texto 8")
                }
            }
        }

    }
}