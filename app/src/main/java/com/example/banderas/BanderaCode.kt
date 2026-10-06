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
import androidx.constraintlayout.compose.ConstraintLayout
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sin



@Composable
fun BanderaSeychelles(modifier: Modifier = Modifier) {
    // 1. Contenedor principal con ConstraintLayout para asegurar la proporción oficial 2:1
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(2f)
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

            // Origen fijo en la esquina inferior izquierda
            val origin = Offset(0f, height)

            // Colores oficiales de la bandera de Seychelles
            val azul = Color(0xFF003F87)
            val amarillo = Color(0xFFFCD856)
            val rojo = Color(0xFFD62828)
            val verde = Color(0xFF007A3D)
            val colors = listOf(azul, amarillo, rojo, Color.White, verde)

            // 6 bordes definidos por 5 ángulos
            val angles = listOf(90f, 72f, 54f, 36f, 18f, 0f)

            // Función auxiliar para calcular la intersección del rayo con el borde superior o derecho
            fun getIntersection(angleDeg: Float): Offset {
                val rad = Math.toRadians(angleDeg.toDouble())
                val cosA = cos(rad).toFloat()
                val sinA = sin(rad).toFloat()

                // Intersección con el borde superior (y = 0)
                if (sinA > 0.0001f) {
                    val tTop = height / sinA
                    val xTop = tTop * cosA
                    if (xTop <= width && xTop >= 0f) {
                        return Offset(xTop, 0f)
                    }
                }
                // Intersección con el borde derecho (x = width)
                val tRight = if (abs(cosA) > 0.0001f) width / cosA else 0f
                val yRight = height - tRight * sinA
                return Offset(width, yRight.coerceIn(0f, height))
            }

            // 3. Dibujar cada una de las 5 franjas mediante polígonos
            for (i in 0 until 5) {
                val angleA = angles[i]
                val angleB = angles[i + 1]

                val pointA = getIntersection(angleA)
                val pointB = getIntersection(angleB)

                val polygonPath = Path().apply {
                    moveTo(origin.x, origin.y)
                    lineTo(pointA.x, pointA.y)

                    // Esquina intermedia: Si el rayo cruza del borde superior al borde derecho,
                    // pasamos obligatoriamente por la esquina superior derecha (width, 0f)
                    if (pointA.y == 0f && pointB.x == width && pointB.y > 0f) {
                        lineTo(width, 0f)
                    }

                    lineTo(pointB.x, pointB.y)
                    close()
                }

                drawPath(polygonPath, color = colors[i])
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSeychellesPreview() {
    Surface { BanderaSeychelles(modifier = Modifier.fillMaxSize()) }
}