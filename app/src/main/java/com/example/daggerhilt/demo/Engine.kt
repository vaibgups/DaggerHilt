package com.example.daggerhilt.demo

import android.util.Log
import javax.inject.Inject

class Engine {
    @Inject
    constructor()

    fun getEngine(){
        Log.d("Main ", "Engine is starts...")
    }
}