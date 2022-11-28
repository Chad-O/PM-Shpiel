package com.example.shpiel.presentation.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shpiel.MainActivity
import com.example.shpiel.presentation.login.screen.LoginScreen

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            LoginScreen()
        }
    }
    val paso : (String) -> Unit = {
        name:String -> val intent = Intent(this, MainActivity::class.java);
        intent.putExtra("name",name);
        startActivity ( intent);
        finish()
    }
}