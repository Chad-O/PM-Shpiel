package com.example.shpiel.presentation.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.components.Fila
import com.example.shpiel.presentation.main.components.Header

@Composable
fun Busqueda(
){
    /*Pa Borrar compare*/
    val evento1 = Evento(titulo="val", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3"))
    val evento = listOf<Evento>(evento1)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(red = 122, green = 22, blue = 60)
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
                    evento -> Fila(evento = evento)
                }
            }
        }
    }
}

/*
@Preview
@Composable
fun pEventos(
) {
    val evento1 = Evento(titulo="val", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3"))
    val evento2 = Evento(titulo="va1l", descripcion = "va2l", hora="va3l", cantidad = 2, participantes = arrayOf("1","2","3"))
    val evento3 = Evento(titulo="val4", descripcion = "val5", hora="val6", cantidad = 2, participantes = arrayOf("1","2","3"))
    val arrayEv = listOf<Evento>(evento1,evento2,evento3)
    Busqueda(evento = arrayEv)
}*/