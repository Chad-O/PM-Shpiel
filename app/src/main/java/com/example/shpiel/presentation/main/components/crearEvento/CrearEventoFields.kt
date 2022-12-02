package com.example.shpiel.presentation.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.presentation.login.components.CustomTextField
import com.example.shpiel.presentation.main.components.crearEvento.rememberExposedMenuStateHolder

@Composable
fun CrearEventoFields(
    titulo: String,
    cantidad: String,
    descripcion: String,
    onTituloChange: (String) -> Unit,
    onCantidadChange: (String)-> Unit,
    onDescripcionChange:  (String) -> Unit
) {
    val stateHolder = rememberExposedMenuStateHolder()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(red = 99, green = 24, blue = 120))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.0f)
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically)
            {
            Text(
                text = "Evento",
                color = Color.White,
                fontSize = 40.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .weight(8.0f)){
            Column(
                modifier = Modifier.padding(top = 40.dp)
            ) {
                CustomTextField(
                    value = titulo,
                    onValueChange = onTituloChange,
                    label = "Titulo del evento"
                )
                CustomDropDownBox(stateHolder = stateHolder)
                CustomTextField(
                    value = cantidad,
                    onValueChange = onCantidadChange,
                    label = "Cantidad de personas"
                )

                CustomTextField(
                    value = descripcion,
                    onValueChange = onDescripcionChange,
                    label = "Descripcion"
                )
                ListaDyn(cantidad)
            }

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1.0f)){
            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 30.dp),
                onClick = { /*TODO*/ },
            ) {
               Text(text = "Publicar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prev() {
    CrearEventoFields(
        titulo = "Val",
        cantidad = "2",
        descripcion = "Descr",
        onTituloChange = {},
        onCantidadChange = {},
        onDescripcionChange = {}
    )
}