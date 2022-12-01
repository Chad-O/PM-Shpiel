package com.example.shpiel.model.firebase

import androidx.compose.animation.core.snap
import androidx.compose.runtime.Composable
import com.google.android.gms.common.server.converter.StringToIntConverter
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirebaseManager {
    val db : FirebaseFirestore
    init {
        db = Firebase.firestore
    }
    companion object{
        private var _instance : FirebaseManager? = null
        val instance : FirebaseManager
            get(){
                if(_instance == null){
                    _instance = FirebaseManager()
                }
                return _instance!!
            }
    }

    fun registrarUsuario(
        codigo: Number,
        nombre: String,
        alias: String,
        contra: String,
        onError: (String) -> Unit,
        onSucces: (String) -> Unit
    ){
        val user = hashMapOf(
            "alias" to alias,
            "codigo" to codigo,
            "contra" to contra,
            "nombre" to nombre
        )
        db.collection("users")
            .add(user)
            .addOnSuccessListener {
                onSucces(nombre)
            }
            .addOnFailureListener{ exception ->
                onError(exception.message!!.toString())
            }
    }

    fun login(
        codigo: String,
        contra: String,
        onSuccess: (String) -> Unit,
        onError:  (String) -> Unit
    ){

        db.collection("users")
            .whereEqualTo("codigo", codigo.toInt())
            .whereEqualTo("contra" , contra)
            .get()
            .addOnSuccessListener { snapshot ->
                println(snapshot.documents)
                if(snapshot.size() > 0){
                    val codigo = snapshot.documents[0].data!!.get("codigo")!!.toString();
                    onSuccess(codigo)
                }else{
                    println(codigo)
                    println(contra)
                    println("No se ha encontrado")
                }
            }
            .addOnFailureListener{
                onError(codigo);
            }
    }

    fun registrarEvento(
        titulo : String,
        deporte : String,
        cantMax : Number,
        desc : String,
        onSucces : () -> Unit,
        onError : () -> Unit
    ){
        val event = hashMapOf(
            "titulo" to titulo,
            "deporte" to deporte,
            "cantMax" to cantMax,
            "desc" to desc
        )
        db.collection("events")
            .add(event)
            .addOnSuccessListener {
                onSucces()
            }
            .addOnFailureListener{ exception ->
                onError()
            }
    }
}