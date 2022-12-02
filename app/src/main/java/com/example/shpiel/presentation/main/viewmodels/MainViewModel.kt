package com.example.shpiel.presentation.main.viewmodels

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class MainViewModel(

) : ViewModel(){
    
     companion object {
         @SuppressLint("StaticFieldLeak")
         lateinit var navController: NavController
         /*lateinit var user: String_*/
     }
}