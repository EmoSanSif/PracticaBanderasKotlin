package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f) // Mantiene la proporción oficial 3:2 de la bandera
    ) {
        val width = size.width
        val height = size.height
        val azulIsrael = Color(0xFF0038B8) // Color azul clásico de la bandera

        // 1. Fondo blanco general
        drawRect(color = Color.White)

        // 2. Franjas horizontales azules (Superior e Inferior)
        val altoFranja = height * 0.08f // Altura proporcional de las franjas

        // Franja superior
        drawRect(
            color = azulIsrael,
            topLeft = Offset(0f, height * 0.12f),
            size = Size(width, altoFranja)
        )

        // Franja inferior
        drawRect(
            color = azulIsrael,
            topLeft = Offset(0f, height * 0.80f),
            size = Size(width, altoFranja)
        )

        // 3. Estrella de David (Magen David) en el centro
        val centroX = width / 2f
        val centroY = height / 2f
        val radioEstrella = height * 0.22f // Tamaño del radio de la estrella

        // Triángulo superior (apuntando hacia arriba)
        val pathTriangulo1 = Path().apply {
            for (i in 0 until 3) {
                // Ángulos para formar el triángulo apuntando hacia arriba
                val angulo = (-Math.PI / 2) + (i * 2 * Math.PI / 3)
                val x = centroX + (radioEstrella * cos(angulo)).toFloat()
                val y = centroY + (radioEstrella * sin(angulo)).toFloat()
                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }

        // Triángulo inferior (apuntando hacia abajo)
        val pathTriangulo2 = Path().apply {
            for (i in 0 until 3) {
                // Ángulos girados para formar el triángulo invertido
                val angulo = (Math.PI / 2) + (i * 2 * Math.PI / 3)
                val x = centroX + (radioEstrella * cos(angulo)).toFloat()
                val y = centroY + (radioEstrella * sin(angulo)).toFloat()
                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }

        // Dibujar los contornos o relleno de la estrella de David
        // Usamos Stroke para que se vea con líneas definidas como la bandera oficial
        drawPath(
            path = pathTriangulo1,
            color = azulIsrael,
            style = Stroke(width = 8f) // Grosor de las líneas de la estrella
        )
        drawPath(
            path = pathTriangulo2,
            color = azulIsrael,
            style = Stroke(width = 8f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaIsraelPreview() {
    BanderaIsrael()
}