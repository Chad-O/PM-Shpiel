package com.example.shpiel.presentation.login.screen

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.shpiel.MainActivity
import com.example.shpiel.presentation.login.components.LoginFields

@Composable
fun LoginScreen(
    onClick : (String) -> Unit = {}
){
    val mcontext = LocalContext.current;
    var name = remember {
        mutableStateOf("")
    }
    var password = remember{
        mutableStateOf(" ")
    }
    LoginFields(
        name = name.value,
        password = password.value,
        onNameChange = {name.value = it},
        onPasswordChange = {password.value = it},
        onLoginClick = {onClick}
    )
}


