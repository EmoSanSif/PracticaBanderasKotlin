package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BanderaNombrePais(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        // drawRect(...), drawPath(...), drawCircle(...), etc.
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNombrePaisPreview() {
    Surface { BanderaNombrePais(modifier = Modifier.fillMaxSize()) }
}