package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaNepal(modifier: Modifier = Modifier) {
    // Dimensiones no estándar dictadas por la forma única de la bandera
    Canvas(modifier = modifier.width(240.dp).height(290.dp)) {
        val width = size.width
        val height = size.height
        val mid = height / 2f

        val azulBorde = Color(0xFF003893)
        val carmesi = Color(0xFFDC143C)
        val blanco = Color.White

        // Margen aproximado en píxeles para calcular los triángulos interiores
        val m = 12f

        // ==========================================
        // 1. TRIÁNGULO SUPERIOR
        // ==========================================
        // Triángulo Base (Azul)
        val triangSuperiorAzul = Path().apply {
            moveTo(0f, 0f)
            lineTo(width * 0.95f, height * 0.40f)
            lineTo(0f, mid)
            close()
        }
        drawPath(triangSuperiorAzul, color = azulBorde)

        // Triángulo Interior (Carmesí) desplazado hacia adentro
        val triangSuperiorRojo = Path().apply {
            moveTo(m, m * 1.5f) // Despega de la esquina superior izquierda
            lineTo(width * 0.92f - m * 2.5f, height * 0.40f + m * 0.5f) // Punta derecha acortada
            lineTo(m, mid - m) // Baja al centro dejando margen izquierdo
            close()
        }
        drawPath(triangSuperiorRojo, color = carmesi)


        // ==========================================
        // 2. TRIÁNGULO INFERIOR
        // ==========================================
        // Triángulo Base (Azul) que se cruza con el superior
        val triangInferiorAzul = Path().apply {
            moveTo(0f, height * 0.38f) // Inicia un poco arriba del 'mid'
            lineTo(width, height * 0.85f)
            lineTo(0f, height)
            close()
        }
        drawPath(triangInferiorAzul, color = azulBorde)

        // Triángulo Interior (Carmesí)
        val triangInferiorRojo = Path().apply {
            moveTo(m, height * 0.38f + m * 1.5f)
            lineTo(width - m * 2.5f, height * 0.85f - m * 0.2f)
            lineTo(m, height - m)
            close()
        }
        drawPath(triangInferiorRojo, color = carmesi)


        // ==========================================
        // 3. LA LUNA (Medialuna apuntando hacia arriba)
        // ==========================================
        val lunaCentroX = width * 0.28f
        val lunaCentroY = height * 0.24f
        val radioLuna = height * 0.08f

        // Círculo base blanco
        drawCircle(
            color = blanco,
            radius = radioLuna,
            center = Offset(lunaCentroX, lunaCentroY)
        )
        // Círculo carmesí superpuesto y desplazado hacia arriba
        drawCircle(
            color = carmesi,
            radius = radioLuna * 0.85f,
            center = Offset(lunaCentroX, lunaCentroY - radioLuna * 0.35f)
        )


        // ==========================================
        // 4. EL SOL (12 puntas)
        // ==========================================
        val solCentroX = width * 0.28f
        val solCentroY = height * 0.68f
        val radioSolExt = height * 0.085f
        val radioSolInt = radioSolExt * 0.55f

        val solPath = Path().apply {
            val numVertices = 24 // 12 puntas exteriores + 12 vértices interiores
            for (i in 0 until numVertices) {
                // Alternamos entre el radio exterior e interior
                val r = if (i % 2 == 0) radioSolExt else radioSolInt

                // Dividimos el círculo en 24 partes
                val angulo = Math.PI * i / 12.0 - Math.PI / 2.0
                val x = solCentroX + (r * cos(angulo)).toFloat()
                val y = solCentroY + (r * sin(angulo)).toFloat()

                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }
        drawPath(solPath, color = blanco)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNepalPreview() {
    Surface { BanderaNepal(modifier = Modifier.fillMaxSize()) }
}