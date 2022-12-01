package com.example.shpiel.presentation.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shpiel.presentation.main.screen.Principal
import com.example.shpiel.presentation.main.screen.Busqueda
import com.example.shpiel.presentation.main.screen.Posteo


@Composable
fun NavigationGraph(
    navController : NavHostController,
){
    NavHost(
        navController = navController,
        startDestination = "Principal"
    ){
        composable("Principal"){
            Principal(navController)
        }
        composable("Busqueda"){
            Busqueda()
        }
        composable("Posteo"){
            Posteo()
        }
    }
}