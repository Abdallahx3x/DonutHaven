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
fun TodayOffersCard(onClick:()->Unit,image:Painter,cardColor:Color){
Box(modifier = Modifier) {

    Card(modifier = Modifier.padding(start = 40.dp,end=14.dp).size(height = 325.dp, width = 193.dp)
        ,
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(cardColor)
        , onClick = {onClick()},
        ) {
        Box(  modifier = Modifier
            .padding(start = 15.dp, top = 15.dp)
            .clip(CircleShape)
            .background(Color.White)
            .size(35.dp)
         ) {
            Image(modifier = Modifier.align(Alignment.Center),
                painter = painterResource(id = R.drawable.favouriteicon)
                , contentDescription = null)
        }
        Spacer(modifier = Modifier.weight(1f))

        Text(text = "Strawberry Wheel", modifier = Modifier.padding(start = 20.dp),
            fontSize = 16.sp, )


        Text(text = "These Baked Strawberry Donuts are filled with fresh strawberries" +
                "...", modifier = Modifier.padding(start = 20.dp, end = 16.dp),
            fontSize = 12.sp,
        overflow = TextOverflow.Ellipsis,
        maxLines = 3,
            textAlign = TextAlign.Justify)

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(end = 20.dp, bottom = 15.dp)
        ,Arrangement.End) {
            Text(text = "$20",
                modifier = Modifier
                    .padding(top = 4.dp, end = 5.dp)
                    .align(Alignment.CenterVertically),
                fontSize = 14.sp,
                textAlign = TextAlign.Center,


            )
            Text(text = "$16",
                modifier = Modifier.align(Alignment.Bottom),
                fontSize = 22.sp, )
        }


    }

    Image(painter =image
        , contentDescription =null,
    modifier = Modifier.size(height = 203.dp, width = 140.dp)
        .offset(x=140.dp))
}

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewTodayOffersCard(){
    //TodayOffersCard()
}