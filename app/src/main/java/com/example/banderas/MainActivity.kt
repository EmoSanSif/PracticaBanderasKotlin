package com.example.banderas

import androidx.compose.foundation.layout.*

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaNombrePais(modifier: Modifier = Modifier) {
    // Aqui va el Row/Column/Box con las franjas o formas
}

@Preview(showBackground = true)
@Composable
fun BanderaNombrePaisPreview() {
    Surface {
        BanderaNombrePais(modifier = Modifier.fillMaxSize())
    }
}
