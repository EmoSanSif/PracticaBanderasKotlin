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

@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    // 1. Contenedor principal con ConstraintLayout para asegurar la proporción 3:2
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f) // Proporción oficial 2:3
    ) {
        val canvasRef = createRef()

        // 2. Lienzo (Canvas) anclado al ConstraintLayout
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

            // -------------------------------------------------------------
            // A. FONDO GEOMÉTRICO (Triángulos Amarillo y Naranja)
            // -------------------------------------------------------------
            // Triángulo superior izquierdo (Amarillo)
            val pathAmarillo = Path().apply {
                moveTo(0f, 0f)
                lineTo(width, 0f)
                lineTo(0f, height)
                close()
            }
            drawPath(pathAmarillo, Color(0xFFFFCC00)) // Amarillo tradicional

            // Triángulo inferior derecho (Naranja)
            val pathNaranja = Path().apply {
                moveTo(width, 0f)
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }
            drawPath(pathNaranja, Color(0xFFFF4E12)) // Naranja tradicional

            // -------------------------------------------------------------
            // B. EL DRÁGONES (Druk) CON LÍNEAS (ZIGZAG)
            // -------------------------------------------------------------
            val strokeDragon = height * 0.08f
            val colorDragon = Color.White

            // Coordenadas de los puntos del cuerpo en zigzag cruzando la diagonal
            val p1 = Offset(width * 0.30f, height * 0.65f) // Cola
            val p2 = Offset(width * 0.35f, height * 0.45f) // Codo 1
            val p3 = Offset(width * 0.45f, height * 0.55f) // Codo 2
            val p4 = Offset(width * 0.55f, height * 0.40f) // Codo 3
            val p5 = Offset(width * 0.65f, height * 0.50f) // Codo 4
            val p6 = Offset(width * 0.75f, height * 0.40f) // Cabeza

            // Trazado de las líneas del cuerpo
            drawLine(colorDragon, p1, p2, strokeWidth = strokeDragon)
            drawLine(colorDragon, p2, p3, strokeWidth = strokeDragon)
            drawLine(colorDragon, p3, p4, strokeWidth = strokeDragon)
            drawLine(colorDragon, p4, p5, strokeWidth = strokeDragon)
            drawLine(colorDragon, p5, p6, strokeWidth = strokeDragon)

            // Detalle de la cabeza / cuernos
            drawLine(
                colorDragon,
                p6,
                Offset(width * 0.78f, height * 0.38f),
                strokeWidth = strokeDragon * 0.4f
            )

            // -------------------------------------------------------------
            // C. LAS 4 "JOYAS / ESTRELLAS" (Círculos amarillos en los vértices)
            // -------------------------------------------------------------
            val colorEstrella = Color(0xFFFFCC00)
            val radioEstrella = height * 0.03f

            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.35f, height * 0.48f))
            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.45f, height * 0.52f))
            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.55f, height * 0.43f))
            drawCircle(colorEstrella, radius = radioEstrella, center = Offset(width * 0.65f, height * 0.47f))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaButanPreview() {
    Surface { BanderaButan(modifier = Modifier.fillMaxSize()) }
}