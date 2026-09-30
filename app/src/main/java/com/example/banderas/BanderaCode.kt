package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BanderaNombrePais(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        drawRect(color = Color(0xFFE30A17)) // fondo rojo
        val cy = size.height / 2f
        val rOut = size.height * 0.30f
        drawCircle(color = Color.White, radius = rOut,
            center = Offset(size.width * 0.38f, cy))
        drawCircle(color = Color(0xFFE30A17), radius = size.height * 0.24f,
            center = Offset(size.width * 0.38f + size.height * 0.09f, cy))
        // Estrella: usar un Path con 10 puntos (5 externos, 5 internos)
        // calculados con seno/coseno, ver seccion 3.


    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNombrePaisPreview() {
    Surface { BanderaNombrePais(modifier = Modifier.fillMaxSize()) }
}