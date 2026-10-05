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


@Composable
fun BanderaReinoUnido(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(2f) // Proporción oficial 1:2
    ) {
        val width = size.width
        val height = size.height
        val cx = width / 2f
        val cy = height / 2f

        val azulMarino = Color(0xFF012169)
        val blanco = Color.White
        val rojo = Color(0xFFC8102E)

        // 1. Fondo azul marino
        drawRect(color = azulMarino)

        // 2. Diagonales blancas (Cruz de San Andrés)
        val grosorDiagonalBlanca = height * 0.22f
        drawLine(blanco, Offset(0f, 0f), Offset(width, height), strokeWidth = grosorDiagonalBlanca)
        drawLine(blanco, Offset(width, 0f), Offset(0f, height), strokeWidth = grosorDiagonalBlanca)

        // 3. Diagonales rojas desplazadas (Cruz de San Patricio)
        val grosorDiagonalRoja = height * 0.08f
        val offsetDesplazamiento = height * 0.035f

        // Se trazan en 4 segmentos desde las esquinas hacia el centro para aplicar el desplazamiento
        // Superior izquierda (desplazada hacia abajo)
        drawLine(rojo, Offset(0f, offsetDesplazamiento), Offset(cx, cy + offsetDesplazamiento), strokeWidth = grosorDiagonalRoja)
        // Inferior derecha (desplazada hacia arriba)
        drawLine(rojo, Offset(cx, cy - offsetDesplazamiento), Offset(width, height - offsetDesplazamiento), strokeWidth = grosorDiagonalRoja)

        // Inferior izquierda (desplazada hacia abajo)
        drawLine(rojo, Offset(0f, height - offsetDesplazamiento), Offset(cx, cy - offsetDesplazamiento), strokeWidth = grosorDiagonalRoja)
        // Superior derecha (desplazada hacia arriba)
        drawLine(rojo, Offset(cx, cy + offsetDesplazamiento), Offset(width, offsetDesplazamiento), strokeWidth = grosorDiagonalRoja)


        // 4. Cruz Blanca horizontal y vertical (Borde)
        val grosorCruzBlancaH = height * 0.33f
        val grosorCruzBlancaV = width * 0.17f

        drawRect(
            color = blanco,
            topLeft = Offset(cx - (grosorCruzBlancaV / 2f), 0f),
            size = Size(grosorCruzBlancaV, height)
        )
        drawRect(
            color = blanco,
            topLeft = Offset(0f, cy - (grosorCruzBlancaH / 2f)),
            size = Size(width, grosorCruzBlancaH)
        )

        // 5. Cruz Roja horizontal y vertical (Centro)
        val grosorCruzRojaH = height * 0.20f
        val grosorCruzRojaV = width * 0.10f

        drawRect(
            color = rojo,
            topLeft = Offset(cx - (grosorCruzRojaV / 2f), 0f),
            size = Size(grosorCruzRojaV, height)
        )
        drawRect(
            color = rojo,
            topLeft = Offset(0f, cy - (grosorCruzRojaH / 2f)),
            size = Size(width, grosorCruzRojaH)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaReinoUnidoPreview() {
    Surface { BanderaReinoUnido(modifier = Modifier.fillMaxSize()) }
}