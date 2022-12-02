package com.example.shpiel.presentation.main.components

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import com.example.shpiel.presentation.main.navigation.NavigationGraph
import com.example.shpiel.presentation.main.viewmodels.MainViewModel

import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navegacion(
    name: String?,
){
    val navController = rememberNavController()
    MainViewModel.navController=navController
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val name = remember {
        mutableStateOf("Hola $name")
    }

    val openDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.open()
        }
    }
    val closeDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.close()
        }
    }

    Scaffold (
        scaffoldState = scaffoldState,
        topBar={
            Topbar(
                onOpenDrawer = openDrawer
            )
        },
        drawerContent = {
            DrawerMenu(
                navController = navController,
                onCloseDrawer = closeDrawer,

                name = name.value
            )
        }
    )
    {
        NavigationGraph(
            navController = navController,
        )
    }
}