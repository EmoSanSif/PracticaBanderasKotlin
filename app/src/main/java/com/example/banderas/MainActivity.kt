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
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


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

@Preview
@Composable
fun BoxConstraint() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (Toprow, Midrow, Botrow, ImgBox) = createRefs()
        val StartGuide = createGuidelineFromStart(0.2f)

        Box(modifier = Modifier.size(100.dp).background(colorResource(id = R.color.rojo_espana)).constrainAs(Toprow) {
            top.linkTo(parent.top)
            bottom.linkTo(Midrow.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.size(200.dp).background(colorResource(id = R.color.amarillo_espana)).constrainAs(Midrow) {
            top.linkTo(Toprow.bottom)
            bottom.linkTo(Botrow.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.percent(0.5f)
        })
        Box(modifier = Modifier.size(100.dp).background(colorResource(id = R.color.rojo_espana)).constrainAs(Botrow) {
            top.linkTo(Midrow.bottom)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Image(painter = painterResource(id = R.drawable.escudo_mexico),
            contentDescription = "Escudo Nacional de Espana",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(140.dp)
                .constrainAs(ImgBox) {
            top.linkTo(Midrow.top)
            bottom.linkTo(Midrow.bottom)
            start.linkTo(StartGuide)

        })
    }
}