package com.example.donuthaven.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.donuthaven.R

@Composable
fun OnboardingScreen(navController: NavController) {
    OnboardingContent { navController.navigate("homeScreen") }
}

@Composable
fun OnboardingContent(onClickStart: () -> Unit) {
    val l = LayoutDirection.Ltr
    Box(
        modifier = Modifier
            .background(Color(0xFFFED8DF))
            .fillMaxSize()
    ) {
        CompositionLocalProvider(LocalLayoutDirection.provides(l)) {
            Box() {
                Image(
                    painterResource(id = R.drawable.image_3), contentDescription = null,
                    alignment = Alignment.TopStart, modifier = Modifier
                        .size(160.dp)
                        .align(Alignment.TopStart)
                )

                Image(
                    painterResource(id = R.drawable.image_4), contentDescription = null,
                    alignment = Alignment.CenterEnd, modifier = Modifier
                        .size(190.dp)
                        .align(Alignment.CenterEnd)
                        .offset(y = 55.dp)
                )

                Image(
                    painterResource(id = R.drawable._a8909101054535_1), contentDescription = null,
                    alignment = Alignment.TopCenter, modifier = Modifier.fillMaxSize()
                )

                Image(
                    painterResource(id = R.drawable.donut_with_pink_icing),
                    contentDescription = null,
                    modifier = Modifier
                        .size(209.dp)
                        .align(Alignment.TopEnd)
                )

                Image(
                    painterResource(id = R.drawable.donut_with_pink_icing_1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .offset(y = 260.dp)
                )



                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = 390.dp)
                        .padding(bottom = 18.dp)
                ) {
                    Text(
                        text = "Gonuts\n" +
                                "with\n" +
                                "Donuts",
                        fontSize = 48.sp,
                        modifier = Modifier.padding(start = 40.dp, bottom = 12.dp),
                        color = Color(0xFFFF7074),
                        lineHeight = 55.sp,
                        fontFamily = FontFamily(Font(R.font.inter_bold))

                    )

                    Text(
                        text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets " +
                                "for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 40.dp, end = 40.dp),
                        color = Color(0xFFFF9494),
                        fontFamily = FontFamily(Font(R.font.inter_medium))

                    )
                }
            }

        }

        Button(
            onClick = { onClickStart() },
            modifier = Modifier
                .width(300.dp)
                .height(110.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 56.dp), colors = ButtonDefaults.buttonColors(Color.White)
        ) {
            Text(
                text = "Get Started", color = Color.Black,
                fontFamily = FontFamily(Font(R.font.inter_semibold)),

                )

        }


    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnboardingPreview() {
    OnboardingContent {}
}


