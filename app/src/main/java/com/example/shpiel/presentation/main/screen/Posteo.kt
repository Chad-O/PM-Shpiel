package com.example.shpiel.presentation.main.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.shpiel.presentation.main.components.CrearEventoFields

@Composable
fun Posteo(){
    var titulo = remember {mutableStateOf("")}
    var cantidad = remember {mutableStateOf("")}
    var descripcion = remember {mutableStateOf("")}
    CrearEventoFields(
        titulo = titulo.value,
        cantidad = cantidad.value,
        descripcion = descripcion.value,
        onTituloChange = {titulo.value = it},
        onCantidadChange = {cantidad.value = it},
        onDescripcionChange = {descripcion.value = it}
    )
}