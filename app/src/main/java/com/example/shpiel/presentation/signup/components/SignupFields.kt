package com.example.shpiel.presentation.signup.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.presentation.login.components.LoginFields

@Composable
fun SignupFields(
    codigo:String,
    name:String,
    alias:String,
    password:String,
    onCodigoChange: (String)->Unit,
    onNameChange: (String)->Unit,
    onAliasChange: (String)->Unit,
    onPasswordChange: (String)->Unit
)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp, bottom = 40.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = "Registro",
                fontSize = 25.sp,
                textAlign = TextAlign.Left
            )
        }
        TextField(
            value = codigo,
            onValueChange = onCodigoChange,
            label = { Text(text = "Codigo de alumno")},
            modifier = Modifier
                .height(60.dp)
                .padding(bottom = 10.dp)
            )
        TextField(
            value = name,
            onValueChange = onNameChange,
            label = { Text(text = "Nombre")},
            modifier = Modifier
                .height(60.dp)
                .padding(bottom = 10.dp)
        )
        TextField(
            value = alias,
            onValueChange = onAliasChange,
            label = { Text(text = "Alias/Apodo")},
            modifier = Modifier
                .height(60.dp)
                .padding(bottom = 10.dp)
        )
        TextField(
            value = password,
            onValueChange = onPasswordChange,
            label = { Text(text = "Contraseña")},
            modifier = Modifier
                .height(60.dp)
                .padding(bottom = 10.dp)
        )
        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 60.dp)
                .padding(top = 30.dp),
            onClick = { /*TODO*/ }) {
            Text(text = "Registrate")

        }
    }

}
@Composable
@Preview(showBackground = true)
fun prueba1(){
    SignupFields(
        codigo = "",
        name = "Javier",
        alias = "",
        password = "",
        onNameChange = {},
        onPasswordChange = {},
        onAliasChange = {},
        onCodigoChange = {}
    )
}