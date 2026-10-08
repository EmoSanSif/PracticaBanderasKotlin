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
        val Line1Pixel = createRef()
        val (Line2Pixel_1, Line2Pixel_2, Line2Pixel_3) = createRefs()
        val (Line3Pixel_1, Line3Pixel_2, Line3Pixel_3, Line3Pixel_4, Line3Pixel_5) = createRefs()
        val (Line4Pixel_1, Line4Pixel_2, Line4Pixel_3, Line4Pixel_4, Line4Pixel_5) = createRefs()
        val (Line5Pixel_1, Line5Pixel_2, Line5Pixel_3) = createRefs()
        val (Line6Pixel_1, Line6Pixel_2, Line6Pixel_3, Line6Pixel_4, Line6Pixel_5) = createRefs()
        val (Line7Pixel_1, Line7Pixel_2, Line7Pixel_3, Line7Pixel_4, Line7Pixel_5, Line7Pixel_6, Line7Pixel_7, Line7Pixel_8, Line7Pixel_9) = createRefs()
        val (Line8Pixel_1, Line8Pixel_2, Line8Pixel_3, Line8Pixel_4, Line8Pixel_5, Line8Pixel_6, Line8Pixel_7, Line8Pixel_8, Line8Pixel_9, Line8Pixel_10, Line8Pixel_11) = createRefs()
        val (Line9Pixel_1, Line9Pixel_2, Line9Pixel_3, Line9Pixel_4, Line9Pixel_5, Line9Pixel_6, Line9Pixel_7, Line9Pixel_8, Line9Pixel_9, Line9Pixel_10, Line9Pixel_11, Line9Pixel_12, Line9Pixel_13, Line9Pixel_14, Line9Pixel_15) = createRefs()
        val (Line10Pixel_1, Line10Pixel_2, Line10Pixel_3, Line10Pixel_4, Line10Pixel_5, Line10Pixel_6, Line10Pixel_7, Line10Pixel_8, Line10Pixel_9, Line10Pixel_10, Line10Pixel_11, Line10Pixel_12, Line10Pixel_13) = createRefs()
        val (Line11Pixel_1, Line11Pixel_2, Line11Pixel_3, Line11Pixel_4, Line11Pixel_5, Line11Pixel_6, Line11Pixel_7, Line11Pixel_8, Line11Pixel_9, Line11Pixel_10, Line11Pixel_11, Line11Pixel_12, Line11Pixel_13) = createRefs()
        val (Line12Pixel_1, Line12Pixel_2, Line12Pixel_3, Line12Pixel_4, Line12Pixel_5, Line12Pixel_6, Line12Pixel_7, Line12Pixel_8, Line12Pixel_9, Line12Pixel_10, Line12Pixel_11, Line12Pixel_12, Line12Pixel_13) = createRefs()
        val (Line13Pixel_1, Line13Pixel_2, Line13Pixel_3, Line13Pixel_4, Line13Pixel_5, Line13Pixel_6, Line13Pixel_7, Line13Pixel_8, Line13Pixel_9, Line13Pixel_10, Line13Pixel_11, Line13Pixel_12, Line13Pixel_13) = createRefs()
        val (Line14Pixel_1, Line14Pixel_2, Line14Pixel_3, Line14Pixel_4, Line14Pixel_5, Line14Pixel_6, Line14Pixel_7, Line14Pixel_8, Line14Pixel_9, Line14Pixel_10, Line14Pixel_11) = createRefs()
        val (Line15Pixel_1, Line15Pixel_2, Line15Pixel_3, Line15Pixel_4, Line15Pixel_5, Line15Pixel_6, Line15Pixel_7, Line15Pixel_8, Line15Pixel_9, Line15Pixel_10, Line15Pixel_11) = createRefs()
        val (Line16Pixel_1, Line16Pixel_2, Line16Pixel_3, Line16Pixel_4, Line16Pixel_5, Line16Pixel_6, Line16Pixel_7) = createRefs()
        val (Line17Pixel_1, Line17Pixel_2, Line17Pixel_3, Line17Pixel_4, Line17Pixel_5, Line17Pixel_6, Line17Pixel_7, Line17Pixel_8, Line17Pixel_9) = createRefs()
        val (Line18Pixel_1, Line18Pixel_2, Line18Pixel_3, Line18Pixel_4, Line18Pixel_5) = createRefs()
        val (Line19Pixel_1, Line19Pixel_2, Line19Pixel_3, Line19Pixel_4, Line19Pixel_5, Line19Pixel_6, Line19Pixel_7) = createRefs()
        val (Line20Pixel_1, Line20Pixel_2, Line20Pixel_3, Line20Pixel_4, Line20Pixel_5, Line20Pixel_6, Line20Pixel_7) = createRefs()
        val (Line21Pixel_1, Line21Pixel_2, Line21Pixel_3, Line21Pixel_4, Line21Pixel_5, Line21Pixel_6, Line21Pixel_7, Line21Pixel_8, Line21Pixel_9, Line21Pixel_10, Line21Pixel_11, Line21Pixel_12, Line21Pixel_13) = createRefs()
        val (Line22Pixel_1, Line22Pixel_2, Line22Pixel_3, Line22Pixel_4, Line22Pixel_5, Line22Pixel_6, Line22Pixel_7, Line22Pixel_8, Line22Pixel_9, Line22Pixel_10, Line22Pixel_11, Line22Pixel_12, Line22Pixel_13) = createRefs()
        val (Line23Pixel_1, Line23Pixel_2, Line23Pixel_3, Line23Pixel_4, Line23Pixel_5, Line23Pixel_6, Line23Pixel_7, Line23Pixel_8, Line23Pixel_9) = createRefs()
        val (Line24Pixel_1, Line24Pixel_2, Line24Pixel_3, Line24Pixel_4, Line24Pixel_5, Line24Pixel_6, Line24Pixel_7, Line24Pixel_8, Line24Pixel_9) = createRefs()
        val (Line25Pixel_1, Line25Pixel_2, Line25Pixel_3, Line25Pixel_4, Line25Pixel_5) = createRefs()
        val (Line26Pixel_1, Line26Pixel_2, Line26Pixel_3, Line26Pixel_4, Line26Pixel_5) = createRefs()
        val (Line27Pixel_1, Line27Pixel_2, Line27Pixel_3) = createRefs()
        val Line28Pixel = createRef()

        // Los pixeles de la dimension de start to end son en aumento de 0.0416f
        val StartPixel1 = createGuidelineFromStart(0.0416f)
        val StartPixel2 = createGuidelineFromStart(0.0832f)
        val StartPixel3 = createGuidelineFromStart(0.1248f)
        val StartPixel4 = createGuidelineFromStart(0.1664f)
        val StartPixel5 = createGuidelineFromStart(0.208f)
        val StartPixel6 = createGuidelineFromStart(0.2496f)
        val StartPixel7 = createGuidelineFromStart(0.2912f)
        val StartPixel8 = createGuidelineFromStart(0.3328f)
        val StartPixel9 = createGuidelineFromStart(0.3744f)
        val StartPixel10 = createGuidelineFromStart(0.416f)
        val StartPixel11 = createGuidelineFromStart(0.4576f)
        val StartPixel12 = createGuidelineFromStart(0.4992f)
        val StartPixel13 = createGuidelineFromStart(0.5408f)
        val StartPixel14 = createGuidelineFromStart(0.5824f)
        val StartPixel15 = createGuidelineFromStart(0.624f)
        val StartPixel16 = createGuidelineFromStart(0.6656f)
        val StartPixel17 = createGuidelineFromStart(0.7072f)
        val StartPixel18 = createGuidelineFromStart(0.7488f)
        val StartPixel19 = createGuidelineFromStart(0.7904f)
        val StartPixel20 = createGuidelineFromStart(0.832f)
        val StartPixel21 = createGuidelineFromStart(0.8736f)
        val StartPixel22 = createGuidelineFromStart(0.9152f)
        val StartPixel23 = createGuidelineFromStart(0.9568f)


        // Los pixeles de la dimension top to bottom aumentan en 0.0178f
        val TopPixel = createGuidelineFromTop(0.25f)
        val TopPixel1 = createGuidelineFromTop(0.2678f)
        val TopPixel2 = createGuidelineFromTop(0.2856f)
        val TopPixel3 = createGuidelineFromTop(0.3034f)
        val TopPixel4 = createGuidelineFromTop(0.3212f)
        val TopPixel5 = createGuidelineFromTop(0.339f)
        val TopPixel6 = createGuidelineFromTop(0.3568f)
        val TopPixel7 = createGuidelineFromTop(0.3746f)
        val TopPixel8 = createGuidelineFromTop(0.3924f)
        val TopPixel9 = createGuidelineFromTop(0.4102f)
        val TopPixel10 = createGuidelineFromTop(0.428f)
        val TopPixel11 = createGuidelineFromTop(0.4458f)
        val TopPixel12 = createGuidelineFromTop(0.4636f)
        val TopPixel13 = createGuidelineFromTop(0.4814f)
        val TopPixel14 = createGuidelineFromTop(0.4992f)
        val TopPixel15 = createGuidelineFromTop(0.517f)
        val TopPixel16 = createGuidelineFromTop(0.5348f)
        val TopPixel17 = createGuidelineFromTop(0.5526f)
        val TopPixel18 = createGuidelineFromTop(0.5704f)
        val TopPixel19 = createGuidelineFromTop(0.5882f)
        val TopPixel20 = createGuidelineFromTop(0.606f)
        val TopPixel21 = createGuidelineFromTop(0.6238f)
        val TopPixel22 = createGuidelineFromTop(0.6416f)
        val TopPixel23 = createGuidelineFromTop(0.6594f)
        val TopPixel24 = createGuidelineFromTop(0.6772f)
        val TopPixel25 = createGuidelineFromTop(0.695f)
        val TopPixel26 = createGuidelineFromTop(0.7128f)
        val TopPixel27 = createGuidelineFromTop(0.7306f)
        val BottomPixel = createGuidelineFromTop(0.75f)

        // Line 1

        Box(modifier = Modifier.background(Color.White).constrainAs(Line1Pixel) {
            top.linkTo(TopPixel)
            bottom.linkTo(TopPixel1)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 2

        Box(modifier = Modifier.background(Color.White).constrainAs(Line2Pixel_1) {
            top.linkTo(TopPixel1)
            bottom.linkTo(TopPixel2)
            start.linkTo(parent.start)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line2Pixel_2) {
            top.linkTo(TopPixel1)
            bottom.linkTo(TopPixel2)
            start.linkTo(Line2Pixel_1.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line2Pixel_3) {
            top.linkTo(TopPixel1)
            bottom.linkTo(TopPixel2)
            start.linkTo(Line2Pixel_2.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 3

        Box(modifier = Modifier.background(Color.White).constrainAs(Line3Pixel_1) {
            top.linkTo(TopPixel2)
            bottom.linkTo(TopPixel3)
            start.linkTo(parent.start)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line3Pixel_2) {
            top.linkTo(TopPixel2)
            bottom.linkTo(TopPixel3)
            start.linkTo(Line3Pixel_1.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line3Pixel_3) {
            top.linkTo(TopPixel2)
            bottom.linkTo(TopPixel3)
            start.linkTo(Line3Pixel_2.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line3Pixel_4) {
            top.linkTo(TopPixel2)
            bottom.linkTo(TopPixel3)
            start.linkTo(Line3Pixel_3.end)
            end.linkTo(StartPixel12)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line3Pixel_5) {
            top.linkTo(TopPixel2)
            bottom.linkTo(TopPixel3)
            start.linkTo(Line3Pixel_4.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 4

        Box(modifier = Modifier.background(Color.White).constrainAs(Line4Pixel_1) {
            top.linkTo(TopPixel3)
            bottom.linkTo(TopPixel4)
            start.linkTo(parent.start)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line4Pixel_2) {
            top.linkTo(TopPixel3)
            bottom.linkTo(TopPixel4)
            start.linkTo(Line4Pixel_1.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line4Pixel_3) {
            top.linkTo(TopPixel3)
            bottom.linkTo(TopPixel4)
            start.linkTo(Line4Pixel_2.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line4Pixel_4) {
            top.linkTo(TopPixel3)
            bottom.linkTo(TopPixel4)
            start.linkTo(Line4Pixel_3.end)
            end.linkTo(StartPixel12)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line4Pixel_5) {
            top.linkTo(TopPixel3)
            bottom.linkTo(TopPixel4)
            start.linkTo(Line4Pixel_4.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 5

        Box(modifier = Modifier.background(Color.White).constrainAs(Line5Pixel_1) {
            top.linkTo(TopPixel4)
            bottom.linkTo(TopPixel5)
            start.linkTo(parent.start)
            end.linkTo(StartPixel5)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line5Pixel_2) {
            top.linkTo(TopPixel4)
            bottom.linkTo(TopPixel5)
            start.linkTo(Line5Pixel_1.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line5Pixel_3) {
            top.linkTo(TopPixel4)
            bottom.linkTo(TopPixel5)
            start.linkTo(Line5Pixel_2.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 6

        Box(modifier = Modifier.background(Color.White).constrainAs(Line6Pixel_1) {
            top.linkTo(TopPixel5)
            bottom.linkTo(TopPixel6)
            start.linkTo(parent.start)
            end.linkTo(StartPixel4)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line6Pixel_2) {
            top.linkTo(TopPixel5)
            bottom.linkTo(TopPixel6)
            start.linkTo(Line6Pixel_1.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line6Pixel_3) {
            top.linkTo(TopPixel5)
            bottom.linkTo(TopPixel6)
            start.linkTo(Line6Pixel_2.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line6Pixel_4) {
            top.linkTo(TopPixel5)
            bottom.linkTo(TopPixel6)
            start.linkTo(Line6Pixel_3.end)
            end.linkTo(StartPixel18)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line6Pixel_5) {
            top.linkTo(TopPixel5)
            bottom.linkTo(TopPixel6)
            start.linkTo(Line6Pixel_4.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 7

        Box(modifier = Modifier.background(Color.White).constrainAs(Line7Pixel_1) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(parent.start)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line7Pixel_2) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_1.end)
            end.linkTo(StartPixel4)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line7Pixel_3) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_2.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line7Pixel_4) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_3.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line7Pixel_5) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_4.end)
            end.linkTo(StartPixel15)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line7Pixel_6) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_5.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line7Pixel_7) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_6.end)
            end.linkTo(StartPixel18)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line7Pixel_8) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_7.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line7Pixel_9) {
            top.linkTo(TopPixel6)
            bottom.linkTo(TopPixel7)
            start.linkTo(Line7Pixel_8.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 8

        Box(modifier = Modifier.background(Color.White).constrainAs(Line8Pixel_1) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(parent.start)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line8Pixel_2) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_1.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line8Pixel_3) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_2.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line8Pixel_4) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_3.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line8Pixel_5) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_4.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line8Pixel_6) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_5.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line8Pixel_7) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_6.end)
            end.linkTo(StartPixel15)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line8Pixel_8) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_7.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line8Pixel_9) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_8.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line8Pixel_10) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_9.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line8Pixel_11) {
            top.linkTo(TopPixel7)
            bottom.linkTo(TopPixel8)
            start.linkTo(Line8Pixel_10.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 9

        Box(modifier = Modifier.background(Color.White).constrainAs(Line9Pixel_1) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(parent.start)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line9Pixel_2) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_1.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line9Pixel_3) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_2.end)
            end.linkTo(StartPixel4)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line9Pixel_4) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_3.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line9Pixel_5) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_4.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line9Pixel_6) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_5.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line9Pixel_7) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_6.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line9Pixel_8) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_7.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line9Pixel_9) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_8.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line9Pixel_10) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_9.end)
            end.linkTo(StartPixel15)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line9Pixel_11) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_10.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line9Pixel_12) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_11.end)
            end.linkTo(StartPixel17)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line9Pixel_13) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_12.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line9Pixel_14) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_13.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line9Pixel_15) {
            top.linkTo(TopPixel8)
            bottom.linkTo(TopPixel9)
            start.linkTo(Line9Pixel_14.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 10

        Box(modifier = Modifier.background(Color.White).constrainAs(Line10Pixel_1) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(parent.start)
            end.linkTo(StartPixel1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line10Pixel_2) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_1.end)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line10Pixel_3) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_2.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line10Pixel_4) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_3.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line10Pixel_5) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_4.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line10Pixel_6) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_5.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line10Pixel_7) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_6.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line10Pixel_8) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_7.end)
            end.linkTo(StartPixel13)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line10Pixel_9) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_8.end)
            end.linkTo(StartPixel15)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line10Pixel_10) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_9.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line10Pixel_11) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_10.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line10Pixel_12) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_11.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line10Pixel_13) {
            top.linkTo(TopPixel9)
            bottom.linkTo(TopPixel10)
            start.linkTo(Line10Pixel_12.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 11

        Box(modifier = Modifier.background(Color.White).constrainAs(Line11Pixel_1) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(parent.start)
            end.linkTo(StartPixel1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line11Pixel_2) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_1.end)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line11Pixel_3) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_2.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line11Pixel_4) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_3.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line11Pixel_5) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_4.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line11Pixel_6) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_5.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line11Pixel_7) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_6.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line11Pixel_8) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_7.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line11Pixel_9) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_8.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line11Pixel_10) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_9.end)
            end.linkTo(StartPixel17)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line11Pixel_11) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_10.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line11Pixel_12) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_11.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line11Pixel_13) {
            top.linkTo(TopPixel10)
            bottom.linkTo(TopPixel11)
            start.linkTo(Line11Pixel_12.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 12

        Box(modifier = Modifier.background(Color.White).constrainAs(Line12Pixel_1) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(parent.start)
            end.linkTo(StartPixel1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line12Pixel_2) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_1.end)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line12Pixel_3) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_2.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line12Pixel_4) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_3.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line12Pixel_5) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_4.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line12Pixel_6) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_5.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line12Pixel_7) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_6.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line12Pixel_8) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_7.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line12Pixel_9) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_8.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line12Pixel_10) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_9.end)
            end.linkTo(StartPixel17)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line12Pixel_11) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_10.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line12Pixel_12) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_11.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line12Pixel_13) {
            top.linkTo(TopPixel11)
            bottom.linkTo(TopPixel12)
            start.linkTo(Line12Pixel_12.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 13

        Box(modifier = Modifier.background(Color.White).constrainAs(Line13Pixel_1) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(parent.start)
            end.linkTo(StartPixel1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line13Pixel_2) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_1.end)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line13Pixel_3) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_2.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line13Pixel_4) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_3.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line13Pixel_5) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_4.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line13Pixel_6) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_5.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line13Pixel_7) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_6.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line13Pixel_8) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_7.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line13Pixel_9) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_8.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line13Pixel_10) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_9.end)
            end.linkTo(StartPixel17)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line13Pixel_11) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_10.end)
            end.linkTo(StartPixel18)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line13Pixel_12) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_11.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line13Pixel_13) {
            top.linkTo(TopPixel12)
            bottom.linkTo(TopPixel13)
            start.linkTo(Line13Pixel_12.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 14

        Box(modifier = Modifier.background(Color.White).constrainAs(Line14Pixel_1) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(parent.start)
            end.linkTo(StartPixel1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line14Pixel_2) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_1.end)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line14Pixel_3) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_2.end)
            end.linkTo(StartPixel4)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line14Pixel_4) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_3.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line14Pixel_5) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_4.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line14Pixel_6) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_5.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line14Pixel_7) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_6.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line14Pixel_8) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_7.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line14Pixel_9) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_8.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line14Pixel_10) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_9.end)
            end.linkTo(StartPixel18)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line14Pixel_11) {
            top.linkTo(TopPixel13)
            bottom.linkTo(TopPixel14)
            start.linkTo(Line14Pixel_10.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 15

        Box(modifier = Modifier.background(Color.White).constrainAs(Line15Pixel_1) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(parent.start)
            end.linkTo(StartPixel2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line15Pixel_2) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_1.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line15Pixel_2) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_1.end)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line15Pixel_3) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_2.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line15Pixel_4) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_3.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line15Pixel_5) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_4.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line15Pixel_6) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_5.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line15Pixel_7) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_6.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line15Pixel_8) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_7.end)
            end.linkTo(StartPixel13)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line15Pixel_9) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_8.end)
            end.linkTo(StartPixel15)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line15Pixel_10) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_9.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line15Pixel_11) {
            top.linkTo(TopPixel14)
            bottom.linkTo(TopPixel15)
            start.linkTo(Line15Pixel_10.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 16

        Box(modifier = Modifier.background(Color.White).constrainAs(Line16Pixel_1) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(parent.start)
            end.linkTo(StartPixel3)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line16Pixel_2) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(Line16Pixel_1.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line16Pixel_2) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(Line16Pixel_1.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line16Pixel_3) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(Line16Pixel_2.end)
            end.linkTo(StartPixel8)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line16Pixel_4) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(Line16Pixel_3.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line16Pixel_5) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(Line16Pixel_4.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line16Pixel_6) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(Line16Pixel_5.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line16Pixel_7) {
            top.linkTo(TopPixel15)
            bottom.linkTo(TopPixel16)
            start.linkTo(Line16Pixel_6.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 17

        Box(modifier = Modifier.background(Color.White).constrainAs(Line17Pixel_1) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(parent.start)
            end.linkTo(StartPixel4)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line17Pixel_2) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_1.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line17Pixel_3) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_2.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line17Pixel_4) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_3.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_gato)).constrainAs(Line17Pixel_5) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_4.end)
            end.linkTo(StartPixel13)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line17Pixel_6) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_5.end)
            end.linkTo(StartPixel14)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line17Pixel_7) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_6.end)
            end.linkTo(StartPixel15)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line17Pixel_8) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_7.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line17Pixel_9) {
            top.linkTo(TopPixel16)
            bottom.linkTo(TopPixel17)
            start.linkTo(Line17Pixel_8.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 18

        Box(modifier = Modifier.background(Color.White).constrainAs(Line18Pixel_1) {
            top.linkTo(TopPixel17)
            bottom.linkTo(TopPixel18)
            start.linkTo(parent.start)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line18Pixel_2) {
            top.linkTo(TopPixel17)
            bottom.linkTo(TopPixel18)
            start.linkTo(Line18Pixel_1.end)
            end.linkTo(StartPixel13)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line18Pixel_3) {
            top.linkTo(TopPixel17)
            bottom.linkTo(TopPixel18)
            start.linkTo(Line18Pixel_2.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line18Pixel_4) {
            top.linkTo(TopPixel17)
            bottom.linkTo(TopPixel18)
            start.linkTo(Line18Pixel_3.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line18Pixel_5) {
            top.linkTo(TopPixel17)
            bottom.linkTo(TopPixel18)
            start.linkTo(Line18Pixel_4.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 19

        Box(modifier = Modifier.background(Color.White).constrainAs(Line19Pixel_1) {
            top.linkTo(TopPixel18)
            bottom.linkTo(TopPixel19)
            start.linkTo(parent.start)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line19Pixel_2) {
            top.linkTo(TopPixel18)
            bottom.linkTo(TopPixel19)
            start.linkTo(Line19Pixel_1.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line19Pixel_3) {
            top.linkTo(TopPixel18)
            bottom.linkTo(TopPixel19)
            start.linkTo(Line19Pixel_2.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line19Pixel_4) {
            top.linkTo(TopPixel18)
            bottom.linkTo(TopPixel19)
            start.linkTo(Line19Pixel_3.end)
            end.linkTo(StartPixel17)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line19Pixel_5) {
            top.linkTo(TopPixel18)
            bottom.linkTo(TopPixel19)
            start.linkTo(Line19Pixel_4.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line19Pixel_6) {
            top.linkTo(TopPixel18)
            bottom.linkTo(TopPixel19)
            start.linkTo(Line19Pixel_5.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line19Pixel_7) {
            top.linkTo(TopPixel18)
            bottom.linkTo(TopPixel19)
            start.linkTo(Line19Pixel_6.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 20

        Box(modifier = Modifier.background(Color.White).constrainAs(Line20Pixel_1) {
            top.linkTo(TopPixel19)
            bottom.linkTo(TopPixel20)
            start.linkTo(parent.start)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line20Pixel_2) {
            top.linkTo(TopPixel19)
            bottom.linkTo(TopPixel20)
            start.linkTo(Line20Pixel_1.end)
            end.linkTo(StartPixel7)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line20Pixel_3) {
            top.linkTo(TopPixel19)
            bottom.linkTo(TopPixel20)
            start.linkTo(Line20Pixel_2.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line20Pixel_4) {
            top.linkTo(TopPixel19)
            bottom.linkTo(TopPixel20)
            start.linkTo(Line20Pixel_3.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line20Pixel_5) {
            top.linkTo(TopPixel19)
            bottom.linkTo(TopPixel20)
            start.linkTo(Line20Pixel_4.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line20Pixel_6) {
            top.linkTo(TopPixel19)
            bottom.linkTo(TopPixel20)
            start.linkTo(Line20Pixel_5.end)
            end.linkTo(StartPixel23)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line20Pixel_7) {
            top.linkTo(TopPixel19)
            bottom.linkTo(TopPixel20)
            start.linkTo(Line20Pixel_6.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 21

        Box(modifier = Modifier.background(Color.White).constrainAs(Line21Pixel_1) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(parent.start)
            end.linkTo(StartPixel5)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line21Pixel_2) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_1.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line21Pixel_3) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_2.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line21Pixel_4) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_3.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line21Pixel_5) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_4.end)
            end.linkTo(StartPixel12)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line21Pixel_6) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_5.end)
            end.linkTo(StartPixel13)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line21Pixel_7) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_6.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line21Pixel_8) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_7.end)
            end.linkTo(StartPixel17)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line21Pixel_9) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_8.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line21Pixel_10) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_9.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line21Pixel_11) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_10.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line21Pixel_12) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_11.end)
            end.linkTo(StartPixel23)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line21Pixel_13) {
            top.linkTo(TopPixel20)
            bottom.linkTo(TopPixel21)
            start.linkTo(Line21Pixel_12.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 22

        Box(modifier = Modifier.background(Color.White).constrainAs(Line22Pixel_1) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(parent.start)
            end.linkTo(StartPixel5)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line22Pixel_2) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_1.end)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line22Pixel_3) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_2.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line22Pixel_4) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_3.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line22Pixel_5) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_4.end)
            end.linkTo(StartPixel12)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line22Pixel_6) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_5.end)
            end.linkTo(StartPixel13)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line22Pixel_7) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_6.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line22Pixel_8) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_7.end)
            end.linkTo(StartPixel17)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line22Pixel_9) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_8.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line22Pixel_10) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_9.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line22Pixel_11) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_10.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line22Pixel_12) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_11.end)
            end.linkTo(StartPixel23)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line22Pixel_13) {
            top.linkTo(TopPixel21)
            bottom.linkTo(TopPixel22)
            start.linkTo(Line22Pixel_12.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 23

        Box(modifier = Modifier.background(Color.White).constrainAs(Line23Pixel_1) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(parent.start)
            end.linkTo(StartPixel6)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line23Pixel_2) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_1.end)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line23Pixel_3) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_2.end)
            end.linkTo(StartPixel12)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line23Pixel_4) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_3.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line23Pixel_5) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_4.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line23Pixel_6) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_5.end)
            end.linkTo(StartPixel20)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line23Pixel_7) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_6.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line23Pixel_8) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_7.end)
            end.linkTo(StartPixel23)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line23Pixel_9) {
            top.linkTo(TopPixel22)
            bottom.linkTo(TopPixel23)
            start.linkTo(Line23Pixel_8.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 24

        Box(modifier = Modifier.background(Color.White).constrainAs(Line24Pixel_1) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(parent.start)
            end.linkTo(StartPixel9)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line24Pixel_2) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_1.end)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line24Pixel_3) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_2.end)
            end.linkTo(StartPixel12)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line24Pixel_4) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_3.end)
            end.linkTo(StartPixel13)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line24Pixel_5) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_4.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line24Pixel_6) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_5.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line24Pixel_7) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_6.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line24Pixel_8) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_7.end)
            end.linkTo(StartPixel23)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line24Pixel_9) {
            top.linkTo(TopPixel23)
            bottom.linkTo(TopPixel24)
            start.linkTo(Line24Pixel_8.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 25

        Box(modifier = Modifier.background(Color.White).constrainAs(Line25Pixel_1) {
            top.linkTo(TopPixel24)
            bottom.linkTo(TopPixel25)
            start.linkTo(parent.start)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line25Pixel_2) {
            top.linkTo(TopPixel24)
            bottom.linkTo(TopPixel25)
            start.linkTo(Line25Pixel_1.end)
            end.linkTo(StartPixel16)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line25Pixel_3) {
            top.linkTo(TopPixel24)
            bottom.linkTo(TopPixel25)
            start.linkTo(Line25Pixel_2.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line25Pixel_4) {
            top.linkTo(TopPixel24)
            bottom.linkTo(TopPixel25)
            start.linkTo(Line25Pixel_3.end)
            end.linkTo(StartPixel22)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line25Pixel_5) {
            top.linkTo(TopPixel24)
            bottom.linkTo(TopPixel25)
            start.linkTo(Line25Pixel_4.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 26

        Box(modifier = Modifier.background(Color.White).constrainAs(Line26Pixel_1) {
            top.linkTo(TopPixel25)
            bottom.linkTo(TopPixel26)
            start.linkTo(parent.start)
            end.linkTo(StartPixel10)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line26Pixel_2) {
            top.linkTo(TopPixel25)
            bottom.linkTo(TopPixel26)
            start.linkTo(Line26Pixel_1.end)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.gris_gato)).constrainAs(Line26Pixel_3) {
            top.linkTo(TopPixel25)
            bottom.linkTo(TopPixel26)
            start.linkTo(Line26Pixel_2.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line26Pixel_4) {
            top.linkTo(TopPixel25)
            bottom.linkTo(TopPixel26)
            start.linkTo(Line26Pixel_3.end)
            end.linkTo(StartPixel21)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line26Pixel_5) {
            top.linkTo(TopPixel25)
            bottom.linkTo(TopPixel26)
            start.linkTo(Line26Pixel_4.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 27

        Box(modifier = Modifier.background(Color.White).constrainAs(Line27Pixel_1) {
            top.linkTo(TopPixel26)
            bottom.linkTo(TopPixel27)
            start.linkTo(parent.start)
            end.linkTo(StartPixel11)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(colorResource(id = R.color.negro_gato)).constrainAs(Line27Pixel_2) {
            top.linkTo(TopPixel26)
            bottom.linkTo(TopPixel27)
            start.linkTo(Line27Pixel_1.end)
            end.linkTo(StartPixel19)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.background(Color.White).constrainAs(Line27Pixel_3) {
            top.linkTo(TopPixel26)
            bottom.linkTo(TopPixel27)
            start.linkTo(Line27Pixel_2.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        // Line 28

        Box(modifier = Modifier.background(Color.White).constrainAs(Line28Pixel) {
            top.linkTo(TopPixel27)
            bottom.linkTo(BottomPixel)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })






    }
}