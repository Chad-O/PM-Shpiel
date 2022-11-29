package com.example.shpiel.presentation.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LoginFields(
    name:String,
    password:String,
    onNameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginClick: (String) -> Unit
){
    val keyboardController = LocalSoftwareKeyboardController.current
    var passwordVisible =  { mutableStateOf(false) }
    //La columna para dividirlo de la manera definida necesita contener 2 columnas hijas
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f),
        ){
//Imagen
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Text(text = "Row 1")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f),
        ){
//Imagen
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Text(text = "Row Imagen")
            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f),
        ){
//Input texts
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp, top = 0.dp, end = 50.dp, bottom = 0.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = {keyboardController?.hide()}),
                    value = name,
                    onValueChange = onNameChange,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Green,
                        unfocusedBorderColor = Color.Gray),
                    label = { Text(text = "Código de Alumno")})
                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp, top = 20.dp, end = 50.dp, bottom = 0.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = {keyboardController?.hide()}),
                    value = password,
                    onValueChange = onPasswordChange,
                    label = { Text(text = "Contraseña")},
                    visualTransformation = PasswordVisualTransformation()
                )
            }
        }
        //Bu! Fantasma
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
        ){
            //Row Fantasma
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Text(text = "Row Fantasma")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),

        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 20.dp),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 70.dp),
                    onClick = {
                        if(name.trim().isNotBlank()){
                            onLoginClick(name)
                        }
                    }
                ){
                    Text(text = "Ingresar")
                }
                Text(
                    text = "Registrate",
                )
            }

        }
    }
}


@Composable
@Preview(showBackground = true)
fun prueba1(){
    LoginFields(
        name = "Javier",
        password = "",
        onNameChange = {},
        onPasswordChange = {},
        onLoginClick = {}
    )
}