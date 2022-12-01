package com.example.shpiel.presentation.signup.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.shpiel.presentation.login.viewmodels.LoginViewModel
import com.example.shpiel.presentation.login.viewmodels.LoginViewModelFactory
import com.example.shpiel.presentation.signup.components.SignupFields
import com.example.shpiel.presentation.signup.viewmodels.SignupViewModel
import com.example.shpiel.presentation.signup.viewmodels.SignupViewModelFactory

@Composable
fun SignupScreen(
    onClick: (String) -> Unit,
    vm : SignupViewModel = viewModel( factory =  SignupViewModelFactory(onClick))
) {
    SignupFields(
        codigo = vm.codigo.value,
        name = vm.nombre.value,
        alias = vm.alias.value,
        password = vm.contra.value,
        onCodigoChange = {vm.codigo.value = it},
        onNameChange = {vm.nombre.value = it},
        onAliasChange = {vm.alias.value = it},
        onPasswordChange = {vm.contra.value = it},
        onClick = { vm.Signup() }
    )
}