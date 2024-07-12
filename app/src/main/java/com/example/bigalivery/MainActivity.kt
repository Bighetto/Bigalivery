package com.example.bigalivery

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.bigalivery.ui.theme.BigaliveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            BigaliveryTheme {
                Surface {
                    MyFirstComposeable()
                }
            }
        }
    }
}



@Composable
fun MyFirstComposeable(){
    Text(text = "Teste 1")
    Text(text = "Teste 2")

}

@Composable
@Preview(
    name = "newTestPreview",
    showSystemUi = false,
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "newTextPreview",
    showSystemUi = true
)
@Preview(
    name = "TestePreview",
    showBackground = true,
    heightDp = 200,
    widthDp = 300,
    backgroundColor = 0XFFF2)
fun MyFirstComposeblePreview(){

    BigaliveryTheme {
        Surface {
            MyFirstComposeable()
        }
    }


}
