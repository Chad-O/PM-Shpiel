package com.example.shpiel.presentation.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.screen.*
import com.google.gson.Gson


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
        composable("EventoRegistrado"){
            EventoRegistrado{
                navController.navigate("Principal")
            }
        }
        composable("EventoCreado"){
            EventoCreado {
                navController.navigate("Principal")
            }
        }
        composable("Participaciones"){
            Participaciones()
        }
        composable("DetalleBusqueda/evento={evento}"){
            val eventoJson = it.arguments?.getString("evento");
            val gson = Gson();
            val evento = gson.fromJson(eventoJson, Evento::class.java);
            Detalle(evento) { navController.navigate("EventoRegistrado") }
        }

        composable("DetalleParticipante/evento={evento}"){
            val eventoJson = it.arguments?.getString("evento");
            val gson = Gson();
            val evento = gson.fromJson(eventoJson, Evento::class.java);
            DetalleParticipante(evento)
        }
    }
}