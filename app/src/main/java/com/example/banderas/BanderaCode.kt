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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaCuba(modifier: Modifier = Modifier) {
    // 1. Contenedor principal con ConstraintLayout para asegurar la proporción 2:1
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(2f)
    ) {
        val canvasRef = createRef()

        // 2. Lienzo (Canvas) anclado dentro del ConstraintLayout
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

            // 3. Las 5 franjas horizontales (alternando azul oscuro y blanco)
            val band = height / 5f
            for (i in 0 until 5) {
                val colorFranja = if (i % 2 == 0) Color(0xFF002E6E) else Color.White
                drawRect(
                    color = colorFranja,
                    topLeft = Offset(0f, i * band),
                    size = Size(width, band)
                )
            }

            // 4. El triángulo rojo en el lado izquierdo
            val triWidth = width * 0.38f
            val trianglePath = Path().apply {
                moveTo(0f, 0f)
                lineTo(triWidth, height / 2f)
                lineTo(0f, height)
                close()
            }
            drawPath(trianglePath, color = Color(0xFFCB1428))

            // 5. La estrella blanca centrada dentro del triángulo
            val starCenter = Offset(triWidth * 0.45f, height / 2f)
            val starRout = height * 0.12f
            val starRin = starRout * 0.38f

            val starPath = Path().apply {
                val numPoints = 10
                for (i in 0 until numPoints) {
                    val r = if (i % 2 == 0) starRout else starRin
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
}


@Preview(showBackground = true)
@Composable
fun BanderaCubaPreview() {
    Surface { BanderaCuba(modifier = Modifier.fillMaxSize()) }
}