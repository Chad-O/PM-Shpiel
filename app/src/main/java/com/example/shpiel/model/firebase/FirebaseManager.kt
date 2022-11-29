package com.example.shpiel.model.firebase

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


}