package com.example.shpiel.presentation.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Principal(){

    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier
                .weight(1f)
                .background(color = Color.Cyan)
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Icon(imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Flecha izquierda",
            modifier = Modifier.clickable {}
                .size(40.dp))
            Text(
                text = "Postea",
                fontSize = 40.sp
            )
        }
        Row (
            modifier = Modifier
                .weight(1f)
                .background(color = Color.Magenta)
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Text(
                text = "Busca",
                fontSize = 40.sp
            )
            Icon(imageVector = Icons.Filled.ArrowForward,
                contentDescription = "Flecha derecha",
                modifier = Modifier.clickable {}
                    .size(40.dp))
        }
    }
}