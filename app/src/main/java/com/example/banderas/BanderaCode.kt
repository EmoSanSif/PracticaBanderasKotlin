package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaNuevaGuinea(modifier: Modifier = Modifier) {
    // Usamos un Box para poder encimar la imagen del Ave sobre el Canvas
    Box(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.33f) // Proporción oficial 3:4 adaptada a Compose
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // 1. Triángulo inferior izquierdo (Negro)
            val pathNegro = Path().apply {
                moveTo(0f, 0f) // Esquina superior izquierda
                lineTo(0f, height) // Baja a la esquina inferior izquierda
                lineTo(width, height) // Va a la esquina inferior derecha
                close()
            }
            drawPath(pathNegro, Color.Black)

            // 2. Triángulo superior derecho (Rojo)
            val pathRojo = Path().apply {
                moveTo(0f, 0f)
                lineTo(width, 0f) // Esquina superior derecha
                lineTo(width, height)
                close()
            }
            drawPath(pathRojo, Color(0xFFCE1126)) // Rojo bandera

            // 3. Función interna para reutilizar el trazado de estrellas
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

            // 4. Dibujamos la Cruz del Sur (5 estrellas en el triángulo negro)
            val rExtG = height * 0.08f // Radio estrellas grandes
            val rIntG = rExtG * 0.4f
            val rExtP = height * 0.05f // Radio estrella pequeña
            val rIntP = rExtP * 0.4f

            // Posiciones relativas calculadas para la constelación
            dibujarEstrella(Offset(width * 0.25f, height * 0.20f), rExtG, rIntG, Color.White) // Arriba
            dibujarEstrella(Offset(width * 0.25f, height * 0.75f), rExtG, rIntG, Color.White) // Abajo
            dibujarEstrella(Offset(width * 0.10f, height * 0.45f), rExtG, rIntG, Color.White) // Izquierda
            dibujarEstrella(Offset(width * 0.40f, height * 0.40f), rExtG, rIntG, Color.White) // Derecha
            dibujarEstrella(Offset(width * 0.33f, height * 0.60f), rExtP, rIntP, Color.White) // Pequeña
        }


    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNuevaGuineaPreview() {
    Surface { BanderaNuevaGuinea(modifier = Modifier.fillMaxSize()) }
}