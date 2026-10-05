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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path


@Composable
fun BanderaSeychelles(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(2f) // La proporción de la bandera es 1:2
    ) {
        val width = size.width
        val height = size.height

        // El punto de origen fijo para todas las franjas (esquina inferior izquierda)
        val origin = Offset(0f, height)

        // Definimos los colores oficiales
        val azul = Color(0xFF003F87)
        val amarillo = Color(0xFFFCD856)
        val rojo = Color(0xFFD62828)
        val blanco = Color.White
        val verde = Color(0xFF007A3D)

        // 1. Franja Azul (Triángulo hacia el primer tercio superior)
        val pathAzul = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(0f, 0f)                 // Esquina superior izquierda
            lineTo(width / 3f, 0f)         // 1/3 del borde superior
            close()
        }
        drawPath(pathAzul, azul)

        // 2. Franja Amarilla (Triángulo central superior)
        val pathAmarillo = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(width / 3f, 0f)
            lineTo(width * 2f / 3f, 0f)    // 2/3 del borde superior
            close()
        }
        drawPath(pathAmarillo, amarillo)

        // 3. Franja Roja (Polígono de 4 lados que envuelve la esquina superior derecha)
        val pathRojo = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(width * 2f / 3f, 0f)
            lineTo(width, 0f)              // Esquina superior derecha (punto intermedio)
            lineTo(width, height / 3f)     // 1/3 del borde derecho
            close()
        }
        drawPath(pathRojo, rojo)

        // 4. Franja Blanca (Triángulo central derecho)
        val pathBlanco = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(width, height / 3f)
            lineTo(width, height * 2f / 3f) // 2/3 del borde derecho
            close()
        }
        drawPath(pathBlanco, blanco)

        // 5. Franja Verde (Triángulo inferior derecho)
        val pathVerde = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(width, height * 2f / 3f)
            lineTo(width, height)          // Esquina inferior derecha
            close()
        }
        drawPath(pathVerde, verde)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSeychellesPreview() {
    Surface { BanderaSeychelles(modifier = Modifier.fillMaxSize()) }
}