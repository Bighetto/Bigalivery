package com.example.bigalivery

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bigalivery.ui.theme.BigaliveryTheme
import com.example.bigalivery.ui.theme.Purple200
import com.example.bigalivery.ui.theme.Purple40
import com.example.bigalivery.ui.theme.Purple500
import com.example.bigalivery.ui.theme.Purple700
import com.example.bigalivery.ui.theme.Purple80
import com.example.bigalivery.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            BigaliveryTheme {
                Surface {
                    ProductSsection()
                }
            }
        }
    }

    @Composable
    private fun ProductItem() {
        Surface(modifier = Modifier.padding(10.dp), shape = RoundedCornerShape(15.dp), shadowElevation = 4.dp) {
            Column(modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp))
            {
                val imageHeight = 100.dp
                Box(modifier = Modifier
                    .height(imageHeight)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Purple200, Teal200)
                        )
                    )
                    .fillMaxWidth()){
                        Image(painter = painterResource(
                            id = R.drawable.ic_launcher_background),
                            contentDescription = "Imagem do Produto",
                            Modifier
                                .size(imageHeight)
                                .offset(y = imageHeight / 2)
                                .clip(shape = CircleShape)
                                .align(Alignment.BottomCenter)
                        )
                }
                Spacer(modifier = Modifier.height(imageHeight/2))
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = LoremIpsum(50).values.first(),
                        fontSize = 18.sp, //o sp permite que aumente ou dimiua o texto conforme usuario
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                        )
                        Text(text = "14,99",
                            Modifier.padding(top = 8.dp),
                            fontSize = 14.sp,
                            fontWeight = FontWeight(400),)
                }
            }
        }
    }

    @Composable
    fun ProductSsection(modifier: Modifier = Modifier) {
        Column {
            Text(text = "Promoções")
            Row {
                ProductItem()
                ProductItem()
                ProductItem()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun ProductSectionPreview() {
        ProductSsection()
        
    }

    @Preview(showBackground = true)
    @Composable
    private fun ProductItemPreview() {
        ProductItem()
    }
}
