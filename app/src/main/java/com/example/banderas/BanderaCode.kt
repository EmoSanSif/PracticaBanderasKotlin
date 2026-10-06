package com.example.banderas

import android.system.Os.close
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
import kotlin.math.cos
import kotlin.math.sin
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f)
    ) {
        val canvasRef = createRef()

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

            drawRect(color = Color(0xFFE30A17))

            val cy = height / 2f
            val rOut = height * 0.30f

            drawCircle(
                color = Color.White,
                radius = rOut,
                center = Offset(width * 0.38f, cy)
            )

            drawCircle(
                color = Color(0xFFE30A17),
                radius = height * 0.24f,
                center = Offset(width * 0.38f + height * 0.09f, cy)
            )

            val starCenter = Offset(width *.55f, cy)
            val starRout = height * 0.12f
            val starRin = starRout * 0.4f

            val starPath = Path().apply {
                val numPoints = 10
                for (i in 0 until numPoints) {
                    val r = if (i % 2 == 0) starRout else starRin
                    val angle = Math.PI * i / 5.0 - Math.PI / 2.0
                    val x = starCenter.x + (r * cos(angle)).toFloat()
                    val y = starCenter.y + (r * sin(angle)).toFloat()

                    if (i == 0) moveTo(x, y) else lineTo(x, y)
                }
                close()
            }

            drawPath(path = starPath, color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaTurquiaPreview() {
    Surface { BanderaTurquia (modifier = Modifier.fillMaxSize()) }
}