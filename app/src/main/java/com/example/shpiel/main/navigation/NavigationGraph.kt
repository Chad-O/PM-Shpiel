package com.example.shpiel.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shpiel.main.screen.Principal

@Composable
fun NavigationGraph(
    navController : NavHostController,
    codigo : String
){
    NavHost(
        navController = navController,
        startDestination = "Principal"
    ){
        composable("Principal"){
            Principal()
        }
    }
}