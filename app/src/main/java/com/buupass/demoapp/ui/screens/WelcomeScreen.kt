package com.buupass.demoapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun WelcomeScreen(
    onButtonClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White), // Set your desired background color
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = "Welcome",
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Black // Set your desired text color
            )
            Button(
                onClick = {
                    onButtonClick()
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Click Me")
            }
        }

    }
}

