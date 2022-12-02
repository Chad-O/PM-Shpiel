package com.example.shpiel.presentation.main.viewmodels

import android.annotation.SuppressLint
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.example.shpiel.model.entity.User
import com.example.shpiel.model.firebase.FirebaseManager
import kotlinx.coroutines.launch

class MainViewModel(

) : ViewModel(){
     companion object {
         @SuppressLint("StaticFieldLeak")
         lateinit var navController: NavController
         var usuario = mutableStateOf(User(nombre = "" , codigo = "" , alias = "" , id = ""))
         /*lateinit var user: String_*/
     }
    fun getUser(id : String)  {
        viewModelScope.launch {
            FirebaseManager.instance.getUser(id) { usuario.value = it }!!
        }
    }
}