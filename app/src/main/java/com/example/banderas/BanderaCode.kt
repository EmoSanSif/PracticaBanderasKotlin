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
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import kotlin.math.cos
import kotlin.math.sin

fun trianglePath(cx: Float, cy: Float, r: Float, rotationDeg: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angle = Math.toRadians((rotationDeg + i * 120).toDouble())
        val x = cx + r * cos(angle).toFloat()
        val y = cy + r * sin(angle).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize().background(Color.White)) {
        val (canvasRef) = createRefs()

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
            val israelBlue = Color(0xFF0038B8)

            // 1. Franjas azules superior e inferior
            val stripeHeight = height * 0.1f

            // Franja superior
            drawRect(
                color = israelBlue,
                topLeft = androidx.compose.ui.geometry.Offset(0f, height * 0.15f),
                size = androidx.compose.ui.geometry.Size(width, stripeHeight)
            )

            // Franja inferior
            drawRect(
                color = israelBlue,
                topLeft = androidx.compose.ui.geometry.Offset(0f, height * 0.75f),
                size = androidx.compose.ui.geometry.Size(width, stripeHeight)
            )

            // 2. Estrella de David (Magen David) en el centro
            val cx = width / 2f
            val cy = height / 2f
            val r = width * 0.15f // Radio de los triángulos

            // Triángulo superior (-90 grados)
            val pathUp = trianglePath(cx, cy, r, -90f)
            drawPath(
                path = pathUp,
                color = israelBlue,
                style = Stroke(width = 14f)
            )

            // Triángulo inferior (90 grados)
            val pathDown = trianglePath(cx, cy, r, 90f)
            drawPath(
                path = pathDown,
                color = israelBlue,
                style = Stroke(width = 14f)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaIsraelPreview() {
    Surface { BanderaIsrael(modifier = Modifier.fillMaxSize()) }
}