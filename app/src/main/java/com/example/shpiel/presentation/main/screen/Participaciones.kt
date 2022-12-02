package com.example.shpiel.presentation.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.components.Fila
import com.example.shpiel.presentation.main.components.Header
import com.example.shpiel.presentation.main.components.filaPart

@Composable
fun Participaciones(){
    /*Pa Borrar compare*/
    val evento1 = Evento(titulo="val", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3"))
    val evento = listOf<Evento>(evento1)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(red = 0, green = 78, blue = 99)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Header()
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            LazyColumn(){
                items(evento){
                        evento -> filaPart(evento = evento)
                }
            }
        }
    }
}