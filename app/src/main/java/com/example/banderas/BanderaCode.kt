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
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    // 1. Contenedor principal con ConstraintLayout para asegurar la proporción oficial 3:2
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f)
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

            // Colores oficiales de la bandera de Sudáfrica
            val rojo = Color(0xFFE03C31)
            val azul = Color(0xFF001489)
            val verde = Color(0xFF007749)
            val negro = Color.Black
            val amarillo = Color(0xFFFFB81C)
            val blanco = Color.White

            // 3. Fondo base (Rojo arriba, Azul abajo)
            drawRect(color = rojo, size = Size(width, height / 2f))
            drawRect(
                color = azul,
                topLeft = Offset(0f, height / 2f),
                size = Size(width, height / 2f)
            )

            // 4. Vértice central de la "Y" (Apex) basado en tus instrucciones
            val apex = Offset(width * 0.36f, height / 2f)

            // 5. Líneas Blancas (Bordes exteriores de la "Y") con grosor 0.30f
            val grosorBlanco = height * 0.30f
            drawLine(blanco, Offset(0f, 0f), apex, strokeWidth = grosorBlanco)
            drawLine(blanco, Offset(0f, height), apex, strokeWidth = grosorBlanco)
            drawLine(blanco, apex, Offset(width, height * 0.14f), strokeWidth = grosorBlanco)
            drawLine(blanco, apex, Offset(width, height * 0.86f), strokeWidth = grosorBlanco)

            // 6. Líneas Verdes (Centro de la "Y", encima con menor grosor 0.20f)
            val grosorVerde = height * 0.20f
            drawLine(verde, Offset(0f, 0f), apex, strokeWidth = grosorVerde)
            drawLine(verde, Offset(0f, height), apex, strokeWidth = grosorVerde)
            drawLine(verde, apex, Offset(width, height * 0.14f), strokeWidth = grosorVerde)
            drawLine(verde, apex, Offset(width, height * 0.86f), strokeWidth = grosorVerde)

            // 7. Triángulo Amarillo (Borde dorado que separa el verde del negro)
            val pathAmarillo = Path().apply {
                moveTo(0f, 0f)
                lineTo(width * 0.38f, height / 2f)
                lineTo(0f, height)
                close()
            }
            drawPath(pathAmarillo, color = amarillo)

            // 8. Triángulo Negro del asta usando drawPath
            val pathNegro = Path().apply {
                moveTo(0f, height * 0.11f)
                lineTo(width * 0.28f, height / 2f)
                lineTo(0f, height * 0.89f)
                close()
            }
            drawPath(pathNegro, color = negro)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    Surface { BanderaSudafrica(modifier = Modifier.fillMaxSize()) }
}