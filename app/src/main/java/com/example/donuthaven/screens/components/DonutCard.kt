package com.example.donuthaven.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuthaven.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutCard(image: Painter){
    Box(modifier = Modifier) {

        Card(
            modifier = Modifier
                .padding(start = 40.dp, top = 50.dp)
                .size(height = 111.dp, width = 138.dp)
                .shadow(elevation = 150.dp, spotColor = Color(0x1A000000), ambientColor = Color(0x1A000000)),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.White),
        ) {

            Spacer(modifier = Modifier.weight(1f))

            Text(text = "Chocolate Cherry", modifier = Modifier
                .padding(bottom = 10.dp)
                .align(Alignment.CenterHorizontally),
                fontSize = 14.sp, color = Color.Black.copy(alpha = 0.7f) )


            Text(text = "$22"
                  , modifier = Modifier
                    .padding(bottom = 20.dp)
                    .align(Alignment.CenterHorizontally),
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFFFF7074))



        }

        Image(painter = image
            , contentDescription =null,
            modifier = Modifier
                .size(height = 90.dp, width = 140.dp)
                .offset(x = 45.dp))
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewDonutsCard(){
   // DonutCard{}
}