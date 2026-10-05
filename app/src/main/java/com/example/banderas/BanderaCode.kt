package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaCuba(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(2f)
    ) {
        val width = size.width
        val height = size.height

        // -------------------------------------------------------------
        // 1. LAS 5 FRANJAS HORIZONTALES (3 azules, 2 blancas)
        // -------------------------------------------------------------
        val bandHeight = height / 5f
        for (i in 0 until 5) {
            val colorFranja = if (i % 2 == 0) Color(0xFF002E6E) else Color.White
            drawRect(
                color = colorFranja,
                topLeft = Offset(0f, i * bandHeight),
                size = Size(width, bandHeight)
            )
        }

        // -------------------------------------------------------------
        // 2. EL TRIÁNGULO ROJO EQUILÁTERO/ISÓSCELES IZQUIERDO
        // -------------------------------------------------------------
        val triWidth = width * 0.38f // Ancho del triangulo
        val trianglePath = Path().apply {
            moveTo(0f, 0f)
            lineTo(triWidth, height / 2f)
            lineTo(0f, height)
            close()
        }
        drawPath(trianglePath, color = Color(0xFFCB1428))

        // -------------------------------------------------------------
        // 3. LA ESTRELLA BLANCA CENTRADA DENTRO DEL TRIÁNGULO
        // -------------------------------------------------------------
        // Coordenadas aproximadas del centro geométrico dentro del triángulo
        val starCenter = Offset(triWidth * 0.45f, height / 2f)
        val starRout = height * 0.12f // Radio exterior de la estrella
        val starRin = starRout * 0.38f // Radio interior de la estrella

        val starPath = Path().apply {
            val numPoints = 10
            for (i in 0 until numPoints) {
                val r = if (i % 2 == 0) starRout else starRin
                // Ángulo para cada vértice de la estrella de 5 puntas
                val angle = Math.PI * i / 5.0 - Math.PI / 2.0
                val x = starCenter.x + (r * cos(angle)).toFloat()
                val y = starCenter.y + (r * sin(angle)).toFloat()

                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }

        drawPath(path = starPath, color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNombrePaisPreview() {
    Surface { BanderaCuba(modifier = Modifier.fillMaxSize()) }
}