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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme() {
                Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    BoxConstraint()
                }
            }
        }
    }
}

val RombosShape = GenericShape { size, _ ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height / 2f)
    lineTo(size.width / 2f, size.height)
    lineTo(0f, size.height / 2f)
    close()
}


@Preview
@Composable
fun BoxConstraint() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (BackGround, Romboid, Circle) = createRefs()
        val topGuide = createGuidelineFromTop(0.2f)

        Box(modifier = Modifier.size(100.dp).background(colorResource(id = R.color.verde_brasil)).constrainAs(BackGround) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.fillMaxSize(0.75f).clip(RombosShape).background(colorResource(id = R.color.amarillo_brasil)).constrainAs(Romboid) {
            top.linkTo(BackGround.top)
            bottom.linkTo(BackGround.bottom)
            start.linkTo(BackGround.start)
            end.linkTo(BackGround.end)

        })
        Box(modifier = Modifier.size(140.dp).clip(CircleShape).background(colorResource(id = R.color.azul_brasil)).constrainAs(Circle) {
            top.linkTo(Romboid.top)
            bottom.linkTo(Romboid.bottom)
            start.linkTo(Romboid.start)
            end.linkTo(Romboid.end)
        })
    }
}