package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap

@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f) // Proporción oficial 2:3
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // 1. Fondo (Triángulo Amarillo y Naranja)
            val pathAmarillo = Path().apply {
                moveTo(0f, 0f)
                lineTo(width, 0f)
                lineTo(0f, height)
                close()
            }
            drawPath(pathAmarillo, Color(0xFFFFCC00)) // Amarillo

            val pathNaranja = Path().apply {
                moveTo(width, 0f)
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }
            drawPath(pathNaranja, Color(0xFFFF4E12)) // Naranja

            // 2. Trazado del Dragón (Druk) con líneas (estilo zigzag)
            val strokeDragon = height * 0.08f
            val colorDragon = Color.White

            // Definimos los puntos del zigzag que simulan el cuerpo del dragón
            // Los puntos van ascendiendo de izquierda a derecha
            val p1 = Offset(width * 0.30f, height * 0.65f) // Cola inferior izquierda
            val p2 = Offset(width * 0.35f, height * 0.45f) // Primer codo (arriba)
            val p3 = Offset(width * 0.45f, height * 0.55f) // Segundo codo (abajo)
            val p4 = Offset(width * 0.55f, height * 0.40f) // Tercer codo (arriba)
            val p5 = Offset(width * 0.65f, height * 0.50f) // Cuarto codo (abajo)
            val p6 = Offset(width * 0.75f, height * 0.40f) // Cabeza (arriba derecha)

            // Dibujamos las líneas conectando los puntos
            drawLine(colorDragon, p1, p2, strokeWidth = strokeDragon)
            drawLine(colorDragon, p2, p3, strokeWidth = strokeDragon)
            drawLine(colorDragon, p3, p4, strokeWidth = strokeDragon)
            drawLine(colorDragon, p4, p5, strokeWidth = strokeDragon)
            drawLine(colorDragon, p5, p6, strokeWidth = strokeDragon)

            // 3. Pequeños detalles extras para la silueta (cabeza y cuernos)
            // Agregamos una línea fina saliendo de la cabeza
            drawLine(
                colorDragon,
                p6,
                Offset(width * 0.78f, height * 0.38f),
                strokeWidth = strokeDragon * 0.4f
            )

            // 4. Las 4 "estrellas" (las simularemos con círculos amarillos en los vértices)
            val colorEstrella = Color(0xFFFFCC00)
            val radioEstrella = height * 0.03f

            // Colocamos las estrellas dentro o cerca de los "codos" del dragón
            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.35f, height * 0.48f))
            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.45f, height * 0.52f))
            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.55f, height * 0.43f))
            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.65f, height * 0.47f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaButamPreview() {
    Surface { BanderaButan(modifier = Modifier.fillMaxSize()) }
}