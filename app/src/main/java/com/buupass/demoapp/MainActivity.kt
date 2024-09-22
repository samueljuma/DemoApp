package com.buupass.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.buupass.demoapp.navigation.AppNavigation
import com.buupass.demoapp.ui.screens.ProductScreen
import com.buupass.demoapp.ui.screens.WelcomeScreen
import com.buupass.demoapp.ui.theme.DemoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoAppTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
//                   WelcomeScreen()
//                    ProductScreen()
                    AppNavigation()
                }
            }
        }
    }
}