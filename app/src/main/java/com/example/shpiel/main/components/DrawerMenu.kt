package com.example.shpiel.main.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DrawerMenu(
    navController: NavController,
    name: String?,
    onCloseDrawer: () -> Unit,
    onChangeTitle: (String) -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            //Por cambiar
            Icon(Icons.Rounded.Menu, contentDescription = "Menu")
            Text(
                text = name!!,
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth()
                    .padding(30.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(
                text = "Principal"
            )
            Text(
                text = "Participaciones"
            )
        }
    }
}