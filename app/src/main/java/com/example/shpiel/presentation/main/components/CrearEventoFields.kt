package com.example.shpiel.presentation.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CrearEventoFields(
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(red = 99, green = 24, blue = 120))
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1.0f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically)
            {
            Text(text = "Evento", color = Color.White)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(8.0f)){

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(2.0f)){

        }
    }
}

@Preview(showBackground = true)
@Composable
fun prev() {
    CrearEventoFields()
}