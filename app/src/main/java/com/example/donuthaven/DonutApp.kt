package com.example.donuthaven

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.donuthaven.screens.DetailsContent
import com.example.donuthaven.screens.DetailsScreen
import com.example.donuthaven.screens.HomeScreen
import com.example.donuthaven.screens.OnboardingScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DonutApp(){

    Scaffold {
        TransparentSystemBars()
        val navController=rememberNavController()
        NavHost(navController = navController, startDestination = "onboardingScreen"){
            composable("onboardingScreen"){ OnboardingScreen(navController)}
            composable("HomeScreen"){ HomeScreen(navController) }
            composable("DetailsScreen"){ DetailsScreen() }

        }

    }
}



@Composable
fun TransparentSystemBars() {
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()

    DisposableEffect(systemUiController, useDarkIcons) {
        systemUiController.setSystemBarsColor(
            color = Color.Transparent,
            darkIcons = useDarkIcons
        )

        onDispose {}
    }
}