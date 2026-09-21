package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat.enableEdgeToEdge
import com.example.banderas.ui.theme.BanderasTheme
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaUSA(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun BanderaUSA(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {
            repeat(13) { index ->
                Box(
                    Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(if (index % 2 == 0) Color(0xFFB22234) else Color.White)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .fillMaxHeight(0.54f)
                .background(Color(0xFF3C3B6E))
        )
        // Aqui se agregan las estrellas con Canvas o un grid de Shapes pequenos
        // Vamos a intentarlo con una imagen
        Image(
            painter = painterResource(id = R.drawable.estrellas_usa),
            contentDescription = "Estrellas",
            modifier = Modifier.size(220.dp)
        )

    }
}



@Preview(showBackground = true)
@Composable
fun BanderaUSAPreview() {
    Surface {
        BanderaUSA(modifier = Modifier.fillMaxSize())
    }
}
