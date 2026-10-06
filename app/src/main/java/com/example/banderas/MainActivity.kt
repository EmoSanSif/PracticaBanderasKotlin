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
        val (topPixel, Cencolumn, Dercolumn) = createRefs()

        // Los pixeles de la dimension de start to end son en aumento de 0.0285f
        val StartPixel2 = createGuidelineFromStart(0.0285f)
        val StartPixel3 = createGuidelineFromStart(0.057f)
        val StartPixel4 = createGuidelineFromStart(0.0855f)

        // Los pixeles de la dimension top to bottom aumentan en .02f
        val TopPixel = createGuidelineFromTop(0.25f)
        val TopPixel1 = createGuidelineFromTop(0.27f)
        val TopPixel2 = createGuidelineFromTop(0.29f)
        val BottomPixel = createGuidelineFromTop(0.75f)


        Box(modifier = Modifier.background(colorResource(id = R.color.verde_mexico)).constrainAs(topPixel) {
            top.linkTo(parent.top)
            bottom.linkTo(StartPixel2)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })


    }
}