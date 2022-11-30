package com.example.shpiel.model.firebase

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
        onSucces: (String) -> Unit,
        onError: (String) -> Unit
    ){
        db.collection("users")
            .whereEqualTo("codigo", codigo)
            .whereEqualTo("contra" , contra)
            .get()
            .addOnSuccessListener { snapshot ->
                if(snapshot.size() > 0){
                    val codigo = snapshot.documents[0].data!!.get("codigo")!!.toString();
                    onSucces(codigo)
                }
            }
            .addOnFailureListener{
                onError(codigo);
            }
    }
}