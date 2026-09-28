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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme() {
                Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    BoxConstraint()
                }
            }
        }
    }
}

@Preview
@Composable
fun BoxConstraint() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        // Creamos las referencias para las franjas y el cuadro azul
        val (stripesRef, cantonRef) = createRefs()

        // 1. Las 13 franjas de fondo
        Column(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(stripesRef) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            repeat(13) { index ->
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(if (index % 2 == 0) Color(0xFFB22234) else Color.White)
                )
            }
        }

        // 2. El cuadro azul (Canton) posicionado en la esquina superior izquierda
        Box(
            modifier = Modifier
                .background(Color(0xFF3C3B6E))
                .constrainAs(cantonRef) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    // Usamos porcentajes exactos para mantener la proporción de la bandera
                    width = Dimension.percent(0.4f)
                    height = Dimension.percent(0.54f)
                }
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.45f) // 1. Aumentamos un poco el ancho del cuadro azul
                    .fillMaxHeight(0.58f) // 2. Aumentamos un poco el alto del cuadro azul
                    .background(Color(0xFF3C3B6E)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(2.dp), // 3. Reducimos el padding interno para aprovechar todo el espacio
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    repeat(9) { rowIndex ->
                        val numStars = if (rowIndex % 2 == 0) 6 else 5
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            repeat(numStars) {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Estrella",
                                    tint = Color.White,
                                    modifier = Modifier.size(20.dp) // 4. Un tamaño intermedio (ej. 13.dp o 14.dp) que sí alcance a lucir
                                )
                            }
                        }
                    }
                }
            }        }
    }
}