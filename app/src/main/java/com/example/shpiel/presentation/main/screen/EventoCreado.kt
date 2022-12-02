package com.example.shpiel.presentation.main.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun EventoCreado(
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color(red = 99, green = 24, blue = 120)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Column(modifier = Modifier.padding(20.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.LightGray)
            .border(BorderStroke(2.dp, Color.Black))
        ){
            Text(text = "Evento creado",
            modifier = Modifier.padding(vertical = 15.dp, horizontal = 20.dp)
                .clip(RoundedCornerShape(topStart = 10f, topEnd = 10f)),
                fontSize = 30.sp
            )
            Button(onClick = {onClick()},
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 20.dp)) {
                Text(text = "Regresar a Principal")
            }
        }
    }
}
@Preview
@Composable
fun ev(){
    EventoCreado {

    }
}