package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat.enableEdgeToEdge
import com.example.banderas.ui.theme.BanderasTheme
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge



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
