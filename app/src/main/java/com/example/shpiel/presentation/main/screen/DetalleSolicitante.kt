package com.example.shpiel.presentation.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.viewmodels.MainViewModel

@Composable
fun DetalleSolicitante(
    evento: Evento = Evento(titulo="val", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3") , idCreador = MainViewModel.usuario.value.id ),
){
    val tamPar = evento.participantes.size
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(red = 0, green = 78, blue = 99))) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(2f)
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(8f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text="Evento(Solicitante)",
                        fontSize = 40.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        textAlign = TextAlign.Center
                    )
                    TextField(
                        value = evento.titulo,
                        onValueChange = {},
                        label={ Text(text = "Titulo") },
                        readOnly = true,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                    TextField(
                        value = evento.descripcion,
                        onValueChange = {},
                        label={ Text(text = "Descripcion") },
                        readOnly = true,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                    TextField(
                        value = evento.hora,
                        onValueChange = {},
                        label={ Text(text = "Hora y Fecha") },
                        readOnly = true,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                    Text(
                        text="Participantes",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        textAlign = TextAlign.Center
                    )
                    for(i in 0 until tamPar)
                        Text(text = evento.participantes[i],
                            modifier = Modifier.padding(top = 4.dp))

                }
                Row(modifier = Modifier.padding(top=20.dp)) {
                    Button(onClick = { /*TODO Eliminar evento*/ },
                        modifier = Modifier.weight(2f)
                            .padding(horizontal = 10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)) {
                        Text(text = "Eliminar")
                    }
                }
            }
        }
    }
}