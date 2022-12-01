package com.example.shpiel.presentation.signup.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.example.shpiel.presentation.signup.components.SignupFields

@Composable
fun SignupScreen(
    onClick: () -> Unit
) {
    val mcontext = LocalContext.current;
    var name = remember{
        mutableStateOf("")
    }
    var codigo = remember{
        mutableStateOf("")
    }
    var alias = remember{
        mutableStateOf("")
    }
    var password = remember{
        mutableStateOf("")
    }
    SignupFields(
        codigo = codigo.value,
        name = name.value,
        alias = alias.value,
        password = password.value,
        onCodigoChange = {codigo.value = it},
        onNameChange = {name.value = it},
        onAliasChange = {alias.value = it},
        onPasswordChange = {password.value = it},
        onClick = onClick

    )
}