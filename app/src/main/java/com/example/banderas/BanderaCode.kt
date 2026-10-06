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

@Composable
fun BanderaSuiza(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .aspectRatio(1f)
            .background(Color(0xFFD52B1E))
    ) {
        val (cruzRef) = createRefs()

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(cruzRef) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val width = size.width
            val height = size.height
            val centroX = width / 2f
            val centroY = height / 2f

            val grosorPalo = width * 0.2f
            val largoPalo = height * 0.62f

            drawRect(
                color = Color.White,
                topLeft = Offset(centroX - (grosorPalo / 2f), centroY - (largoPalo / 2f)),
                size = Size(grosorPalo, largoPalo)
            )

            drawRect(
                color = Color.White,
                topLeft = Offset(centroX - (largoPalo / 2f), centroY - (grosorPalo / 2f)),
                size = Size(largoPalo, grosorPalo)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaSuizaPreview() {
    Surface { BanderaSuiza(modifier = Modifier.fillMaxSize()) }
}