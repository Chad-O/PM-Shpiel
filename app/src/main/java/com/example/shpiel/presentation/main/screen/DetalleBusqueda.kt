package com.example.shpiel.presentation.main.screen

import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.components.Fila

@Composable
fun Detalle(
    evento: Evento = Evento(titulo="val", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3")),
){
    val tamPar = evento.participantes.size
    Column(modifier = Modifier
        .fillMaxSize()) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(2f)) {
            Text(text="Registro",
            fontSize = 40.sp)
            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(8f)) {
                TextField(
                    value = evento.titulo,
                    onValueChange = {},
                    label={ Text(text = "Titulo")},
                    readOnly = true,
                )
                TextField(
                    value = evento.descripcion,
                    onValueChange = {},
                    label={ Text(text = "Descripcion")},
                    readOnly = true,
                )
                TextField(
                    value = evento.hora,
                    onValueChange = {},
                    label={ Text(text = "Hora y Fecha")},
                    readOnly = true,
                )
                for(i in 0 until tamPar)
                    Text(text = evento.participantes[i],
                    modifier = Modifier)
            }
            Row(modifier = Modifier.padding(top=20.dp)) {
                Button(onClick = {}) {
                    
                }
                
            }

        }

    }
}