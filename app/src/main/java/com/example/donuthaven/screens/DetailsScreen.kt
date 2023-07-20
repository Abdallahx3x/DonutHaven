package com.example.donuthaven.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuthaven.R


@Composable
fun DetailsScreen() {
    DetailsContent()
}

@Composable
fun DetailsContent() {


    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
            .systemBarsPadding()
    ) {
        Image(
            modifier = Modifier.size(height = 300.dp, width = 708.dp),
            painter = painterResource(id = R.drawable.donut_details), contentDescription = null
        )



        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .height(460.dp)
                .align(Alignment.BottomCenter)
                .background(Color(0xFFFAFAFA))
                .shadow(
                    190.dp, shape = RoundedCornerShape(16.dp), spotColor = Color.White
                )
        ) {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, bottom = 24.dp)
            ) {
                Text(
                    text = "Strawberry Wheel",
                    fontSize = 30.sp, modifier = Modifier.padding(top = 24.dp),
                    color = Color(0xFFFF7074)
                )

                Text(
                    text = "About Gonut",
                    fontSize = 14.sp, modifier = Modifier.padding(top = 26.dp), color = Color.Black
                )

                Text(
                    text = "These soft, cake-like Strawberry Frosted Donuts feature" +
                            " fresh strawberries and a delicious fresh strawber" +
                            "ry glaze frosting. Pretty enough for company and t" +
                            "he perfect treat to satisfy your sweet tooth.",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 16.dp, end = 40.dp),
                    color = Color.Black.copy(alpha = 0.6f)
                )

                Text(
                    text = "Quantity",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 24.dp, bottom = 16.dp),
                    color = Color.Black
                )


                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                ) {


                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(16.dp))
                            .size(45.dp)
                            .width(45.dp)
                            .height(45.dp)
                            .background(Color.White)


                    ) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                painterResource(id = R.drawable.decrease_icon),
                                contentDescription = "null",
                                tint = Color.Black,
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .size(45.dp)
                            .width(45.dp)
                            .height(45.dp)
                            .background(Color.White)


                    ) {
                        Text(
                            text = "1",
                            style = TextStyle(
                                fontSize = 22.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),

                                ),
                            modifier = Modifier
                                .align(Alignment.Center)
                        )

                    }


                    Box(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .size(45.dp)
                            .background(Color.Black)


                    ) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                painterResource(id = R.drawable.increase_icon),
                                contentDescription = "null",
                                tint = Color.White,
                            )
                        }
                    }


                }


                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = "£16", modifier = Modifier
                            .padding(end = 20.dp)
                            .align(Alignment.CenterVertically),
                        fontSize = 24.sp, color = Color.Black,
                        fontFamily = FontFamily(Font(R.font.inter_semibold))
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 268.dp, height = 67.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFFFF7074)),
                        shape = RoundedCornerShape(size = 50.dp)
                    ) {
                        Text(
                            text = "Add to Cart", fontSize = 18.sp, color = Color.White,
                            fontFamily = FontFamily(Font(R.font.inter_semibold))
                        )
                    }
                }

            }


        }
        Box(
            modifier = Modifier
                .offset(y = (340).dp, x = (310).dp)
                .padding(start = 15.dp, top = 15.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .size(45.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.favouriteicon), contentDescription = null
            )
        }


    }


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewDetailsScreen() {
    DetailsContent()
}