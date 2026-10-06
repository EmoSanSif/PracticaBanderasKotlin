package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaPapuaNuevaGuinea(modifier: Modifier = Modifier) {
    // Contenedor principal con ConstraintLayout para fijar la proporción de la bandera
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.33f) // Proporción oficial 4:3
    ) {
        // Creamos las referencias para los elementos del ConstraintLayout
        val (canvasRef, aveRef) = createRefs()

        // 1. Lienzo para los triángulos de fondo y las estrellas
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(canvasRef) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val width = size.width
            val height = size.height

            // Triángulo inferior izquierdo (Negro)
            val pathNegro = Path().apply {
                moveTo(0f, 0f)
                lineTo(0f, height)
                lineTo(width, height)
                close()
            }
            drawPath(pathNegro, Color.Black)

            // Triángulo superior derecho (Rojo)
            val pathRojo = Path().apply {
                moveTo(0f, 0f)
                lineTo(width, 0f)
                lineTo(width, height)
                close()
            }
            drawPath(pathRojo, Color(0xFFCE1126)) // Rojo oficial

            // Función interna para dibujar cada estrella de la Cruz del Sur
            fun dibujarEstrella(centro: Offset, radioExt: Float, radioInt: Float, color: Color) {
                val starPath = Path().apply {
                    for (i in 0 until 10) {
                        val r = if (i % 2 == 0) radioExt else radioInt
                        val angle = Math.PI * i / 5.0 - Math.PI / 2.0
                        val x = centro.x + (r * cos(angle)).toFloat()
                        val y = centro.y + (r * sin(angle)).toFloat()
                        if (i == 0) moveTo(x, y) else lineTo(x, y)
                    }
                    close()
                }
                drawPath(starPath, color)
            }

            // Radios para las estrellas grandes y la pequeña de la constelación
            val rExtG = height * 0.08f
            val rIntG = rExtG * 0.4f
            val rExtP = height * 0.05f
            val rIntP = rExtP * 0.4f

            // Coordenadas de la Cruz del Sur en el triángulo negro
            dibujarEstrella(Offset(width * 0.25f, height * 0.20f), rExtG, rIntG, Color.White) // Superior
            dibujarEstrella(Offset(width * 0.25f, height * 0.75f), rExtG, rIntG, Color.White) // Inferior
            dibujarEstrella(Offset(width * 0.10f, height * 0.45f), rExtG, rIntG, Color.White) // Izquierda
            dibujarEstrella(Offset(width * 0.40f, height * 0.40f), rExtG, rIntG, Color.White) // Derecha
            dibujarEstrella(Offset(width * 0.33f, height * 0.60f), rExtP, rIntP, Color.White) // Pequeña central
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaPapuaNuevaGuineaPreview() {
    Surface { BanderaPapuaNuevaGuinea(modifier = Modifier.fillMaxSize()) }
}