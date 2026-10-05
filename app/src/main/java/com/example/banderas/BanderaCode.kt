package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path


@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f) // Proporción oficial 2:3
    ) {
        val width = size.width
        val height = size.height

        // Colores oficiales
        val rojo = Color(0xFFE03C31)
        val azul = Color(0xFF001489)
        val verde = Color(0xFF007749)
        val negro = Color.Black
        val amarillo = Color(0xFFFFB81C)
        val blanco = Color.White

        // 1. Fondos (Rojo en la mitad superior, Azul en la mitad inferior)
        drawRect(color = rojo, size = Size(width, height / 2f))
        drawRect(
            color = azul,
            topLeft = Offset(0f, height / 2f),
            size = Size(width, height / 2f)
        )

        val apex = Offset(width * 0.36f, height / 2f)

        // 2. Líneas Blancas (Base de la "Y")
        val grosorBlanco = height * 0.30f

        // Diagonales del asta hacia el centro
        drawLine(blanco, Offset(0f, 0f), apex, strokeWidth = grosorBlanco)
        drawLine(blanco, Offset(0f, height), apex, strokeWidth = grosorBlanco)

        // Franja horizontal hacia la derecha
        // (Nota: Corregido de tus instrucciones originales. La bandera de Sudáfrica
        // no se divide en dos diagonales hacia la derecha, sino en una sola línea recta central)
        drawLine(blanco, apex, Offset(width, height / 2f), strokeWidth = grosorBlanco)

        // 3. Líneas Verdes (Centro de la "Y", más delgadas y superpuestas)
        val grosorVerde = height * 0.20f
        drawLine(verde, Offset(0f, 0f), apex, strokeWidth = grosorVerde)
        drawLine(verde, Offset(0f, height), apex, strokeWidth = grosorVerde)
        drawLine(verde, apex, Offset(width, height / 2f), strokeWidth = grosorVerde)

        // 4. Triángulo Amarillo (Borde dorado)
        // La bandera oficial tiene un borde amarillo que separa el verde del negro
        val pathAmarillo = Path().apply {
            moveTo(0f, 0f)
            lineTo(width * 0.34f, height / 2f)
            lineTo(0f, height)
            close()
        }
        drawPath(pathAmarillo, amarillo)

        // 5. Triángulo Negro (Asta)
        val pathNegro = Path().apply {
            moveTo(0f, height * 0.11f) // Se ajusta el inicio para respetar el grosor del borde amarillo
            lineTo(width * 0.26f, height / 2f)
            lineTo(0f, height * 0.89f)
            close()
        }
        drawPath(pathNegro, negro)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    Surface { BanderaSudafrica(modifier = Modifier.fillMaxSize()) }
}