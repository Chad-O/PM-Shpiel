package com.example.shpiel

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.example.shpiel.presentation.login.screen.LoginScreen
import com.example.shpiel.ui.theme.ShpielTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            LoginScreen(onClick = pasoMain, onRegister = pasoSignup)
        }
    }
     private val pasoMain: () -> Unit = {
         print("FUNCION")
         val intent = Intent(this, MainActivity::class.java);
         startActivity ( intent );
    }
    private val pasoSignup: () -> Unit = {
        print("FUNCION")
        val intent = Intent(this, SignupActivity::class.java);
        startActivity(intent);
    }
}


