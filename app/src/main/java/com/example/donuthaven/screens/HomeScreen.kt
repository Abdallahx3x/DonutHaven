package com.example.donuthaven.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.donuthaven.R
import com.example.donuthaven.screens.components.DonutCard
import com.example.donuthaven.screens.components.TodayOffersCard

@Composable
fun HomeScreen(navController: NavController){
    HomeContent{navController.navigate("DetailsScreen")}
}
@Composable
fun HomeContent(onClickCard:()->Unit){
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 16.dp) .background(Color(0xFFFAFAFA)).shadow(190.dp,
                spotColor = Color.White
            ).systemBarsPadding()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end = 43.dp),Arrangement.SpaceBetween) {
            Column() {
                Text(text = "Let’s Gonuts!",
                    fontSize = 30.sp, modifier = Modifier,
                    color = Color(0xFFFF7074),
                    fontFamily = FontFamily(Font(R.font.inter_semibold))

                )

                Text(text = "Order your favourite donuts from here",
                    fontSize = 14.sp, modifier = Modifier
                    ,  color = Color.Black.copy(alpha = 0.6f),
                    fontFamily = FontFamily(Font(R.font.inter_medium))

                )

            }

            IconButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFFFED8DF))) {
                Icon(painter = painterResource(id = R.drawable.donut_search)
                    , contentDescription =null , tint = Color(0xFFFF7074)
                )
            }
        }


        Text(text = "Today Offers",
            fontSize = 20.sp, modifier = Modifier.padding(start = 40.dp,top=24.dp)
            ,  color = Color.Black,
            fontFamily = FontFamily(Font(R.font.inter_semibold))

        )


        LazyRow(
            Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
        contentPadding = PaddingValues(end = 40.dp)
        ){
            item {
                TodayOffersCard({onClickCard()}, painterResource(id = R.drawable.dounttodayoffers1),Color(0xFFD7E4F6))
            }
            item {
                TodayOffersCard({onClickCard()}, painterResource(id = R.drawable.today_offers_donut2),Color(0xFFFFC7D0))
            }
            item {
                TodayOffersCard({onClickCard()}, painterResource(id = R.drawable.dounttodayoffers1),Color(0xFFD7E4F6))
            }
            item {
                TodayOffersCard({onClickCard()}, painterResource(id = R.drawable.today_offers_donut2),Color(0xFFFFC7D0))
            }
        }

        Text(text = "Donuts",
            fontSize = 20.sp, modifier = Modifier.padding(start = 40.dp,top=24.dp)
            ,  color = Color.Black,
            fontFamily = FontFamily(Font(R.font.inter_semibold))

        )
           Spacer(modifier = Modifier.weight(1f))
        LazyRow(
            Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 8.dp),
            contentPadding = PaddingValues(end = 40.dp)){
            item {
               DonutCard(painterResource(id = R.drawable.donutcard1))
            }
            item {
                DonutCard(painterResource(id = R.drawable.donuts2))
            }
            item {
                DonutCard(painterResource(id = R.drawable.donutcard1))
            }
        }
        Spacer(Modifier.weight(1f))

        BottomAppBar(modifier = Modifier, containerColor = Color(0xFFFFFF)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.home_icon), contentDescription = null)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.favourite_appbar_icon), contentDescription = null)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.notification_app_bar_icon), contentDescription = null)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.buy_app_bar_icon), contentDescription = null)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.user_app_bar_icon), contentDescription = null)
                }
            }

        }

    }


}


@Preview(showBackground = true,showSystemUi = true)
@Composable
fun HomePreview(){
    HomeContent {}
}

