package com.example.shpiel.presentation.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.screen.*


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
        composable("CrearEvento"){
            CrearEvento({
                navController.navigate("EventoCreado")
            })
        }
        composable("EventoCreado"){
            EventoCreado {
                navController.navigate("Principal")
            }
        }
        composable("DetalleBusqueda"){
            Detalle()
        }
    }
}