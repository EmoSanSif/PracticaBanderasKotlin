package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaNepal(modifier: Modifier = Modifier) {
    // 1. Contenedor principal con ConstraintLayout aplicando las dimensiones oficiales
    ConstraintLayout(
        modifier = modifier
            .width(240.dp)
            .height(290.dp)
    ) {
        val canvasRef = createRef()

        // 2. Lienzo (Canvas) anclado dentro del ConstraintLayout
        Canvas(
            modifier = Modifier
                .width(240.dp)
                .height(290.dp)
                .constrainAs(canvasRef) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val width = size.width
            val height = size.height
            val mid = height / 2f

            val azulBorde = Color(0xFF003893)
            val carmesi = Color(0xFFDC143C)
            val blanco = Color.White

            // Margen aproximado de ~16px para los triángulos interiores
            val m = 16f

            // ==========================================
            // A. TRIÁNGULO SUPERIOR
            // ==========================================
            // Triángulo exterior (Borde Azul)
            val triangSuperior = Path().apply {
                moveTo(0f, 0f)
                lineTo(width * 0.92f, height * 0.40f)
                lineTo(0f, mid)
                close()
            }
            drawPath(triangSuperior, color = azulBorde)

            // Triángulo superior interior (Carmesí)
            val triangSuperiorRojo = Path().apply {
                moveTo(m, m * 1.5f)
                lineTo(width * 0.92f - m * 2.5f, height * 0.40f + m * 0.5f)
                lineTo(m, mid - m)
                close()
            }
            drawPath(triangSuperiorRojo, color = carmesi)

            // ==========================================
            // B. TRIÁNGULO INFERIOR
            // ==========================================
            // Triángulo exterior (Borde Azul)
            val triangInferiorAzul = Path().apply {
                moveTo(0f, height * 0.38f)
                lineTo(width, height * 0.85f)
                lineTo(0f, height)
                close()
            }
            drawPath(triangInferiorAzul, color = azulBorde)

            // Triángulo inferior interior (Carmesí)
            val triangInferiorRojo = Path().apply {
                moveTo(m, height * 0.38f + m * 1.5f)
                lineTo(width - m * 2.5f, height * 0.85f - m * 0.2f)
                lineTo(m, height - m)
                close()
            }
            drawPath(triangInferiorRojo, color = carmesi)

            // ==========================================
            // C. LA LUNA (Círculo blanco + círculo carmesí desplazado)
            // ==========================================
            val lunaCentroX = width * 0.28f
            val lunaCentroY = height * 0.24f
            val radioLuna = height * 0.08f

            drawCircle(
                color = blanco,
                radius = radioLuna,
                center = Offset(lunaCentroX, lunaCentroY)
            )
            drawCircle(
                color = carmesi,
                radius = radioLuna * 0.85f,
                center = Offset(lunaCentroX, lunaCentroY - radioLuna * 0.35f)
            )

            // ==========================================
            // D. EL SOL (12 puntas usando seno/coseno)
            // ==========================================
            val solCentroX = width * 0.28f
            val solCentroY = height * 0.68f
            val radioSolExt = height * 0.085f
            val radioSolInt = radioSolExt * 0.55f

            val solPath = Path().apply {
                val numVertices = 24 // 12 puntas exteriores y 12 valles interiores
                for (i in 0 until numVertices) {
                    val r = if (i % 2 == 0) radioSolExt else radioSolInt
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
}


@Preview(showBackground = true)
@Composable
fun BanderaNepalPreview() {
    Surface { BanderaNepal(modifier = Modifier.fillMaxSize()) }
}