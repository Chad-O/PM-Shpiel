package com.example.shpiel

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shpiel.presentation.login.screen.LoginScreen
import com.example.shpiel.ui.theme.ShpielTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            LoginScreen(onClick = paso, onRegister = registro)
        }
    }
    private val paso : (String) -> Unit = {
            name:String -> val intent = Intent(this, MainActivity::class.java);
        startActivity ( intent);
        finish()
    }
    val registro:() -> Unit = {
        intent = Intent(this, SignupActivity::class.java);
        startActivity(intent);
        finish()
    }
}


