package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.graphics.Path
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f) // 👈 Esto obliga a que mantenga la proporción correcta de la bandera (3:2)
    ) {
        // 1. Fondo rojo
        drawRect(color = Color(0xFFE30A17))

        val cy = size.height / 2f
        val rOut = size.height * 0.30f

        // 2. Círculo blanco de la medialuna
        drawCircle(
            color = Color.White,
            radius = rOut,
            center = Offset(size.width * 0.38f, cy)
        )

        // 3. Círculo rojo superpuesto para crear el efecto de la medialuna
        drawCircle(
            color = Color(0xFFE30A17),
            radius = size.height * 0.24f,
            center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
        )

        // 4. Estrella blanca de 5 puntas usando un Path
        val starCenter = Offset(size.width * 0.55f, cy)
        val starRout = size.height * 0.12f
        val starRin = starRout * 0.4f // Radio interno de la estrella

        val starPath = Path().apply {
            val numPoints = 10
            for (i in 0 until numPoints) {
                // Alterna entre radio exterior e interior
                val r = if (i % 2 == 0) starRout else starRin
                // Ángulo para cada uno de los 10 vértices (empezando hacia la izquierda/arriba)
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
fun BanderaTurquiaPreview() {
    Surface { BanderaTurquia(modifier = Modifier.fillMaxSize()) }
}