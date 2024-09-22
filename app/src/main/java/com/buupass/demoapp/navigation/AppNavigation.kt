package com.buupass.demoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.buupass.demoapp.ui.screens.ProductScreen
import com.buupass.demoapp.ui.screens.WelcomeScreen

@Composable
fun AppNavigation(){
    //step 1: Navcontroler
    val navController = rememberNavController()

    // Step 2: NavHost
    NavHost(
        navController = navController,
        startDestination = "welcome"
    ){
        //Step 3: composables that represent different screens
        composable("welcome") {
            WelcomeScreen(
                onButtonClick = {
                    navController.navigate("product-screen")
                }
            )
        }
        composable("product-screen") {
            ProductScreen()
        }
    }

}