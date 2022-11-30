package com.example.shpiel

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shpiel.presentation.signup.screen.SignupScreen

class SignupActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            SignupScreen()
        }
    }
    val paso:(String) -> Unit = {
            name:String -> val intent = Intent(this, MainActivity::class.java);
        startActivity(intent);
        finish()
    }
}

