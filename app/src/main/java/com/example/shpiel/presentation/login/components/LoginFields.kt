package com.example.shpiel.presentation.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun LoginFields(

    name:String,
    password: String,
    onNameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginClick: (String) -> Unit
){
    //La columna para dividirlo de la manera definida necesita contener 2 columnas hijas
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){

        }
        Column(){
            Button(
                modifier = Modifier.padding(15.dp),
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